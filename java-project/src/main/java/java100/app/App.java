package java100.app;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.control.Controller;
import java100.app.control.Request;
import java100.app.control.Response;
import java100.app.util.DataSource;

// 요구사항
/*
 Spring IoC
 
 http://spring.io/

 */

@Configuration //이 클래스가 스프링 IoC 컨테이너를 위한 설정 클래스임을 선언
@ComponentScan("java100.app") // @Component 붙은 클래스가 어느 패키지에 있는지 표시
public class App {
    
    ServerSocket ss;
    // Spring IoC 컨테이너
    AnnotationConfigApplicationContext iocContainer;
    
 // @bean 스프링 IoC 컨테이너에게 getDataSource() 메서드를 호출해서 이 메서드가 리턴한 객체를 컨테이너에 보관해달라고 표시
    @Bean
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        
        return ds;
        
    }
    
    void init() {
        
        iocContainer = new AnnotationConfigApplicationContext(App.class);
        
       
    }

    void service() throws Exception {

        ss = new ServerSocket(9999);
        System.out.println("서버실행");
        
        loop:
        while(true) {
            //스레드에게 처리 위임
          new HttpAgent(ss.accept()).start();
          
        }
       
    }


private void request(String command, PrintWriter out) {
   
    String menuName=command;
    int i = command.indexOf("/", 1); //0다음 부터
    
    if(i !=-1) {
      menuName = command.substring(0, i);
    }

    Object controller =  iocContainer.getBean(menuName);
    if(controller == null && controller instanceof Controller) {
        out.println("해당 명령을 지원하지 않습니다.");
        return;
    }
    Request request = new Request(command);
    
    Response response = new Response();
    response.setWriter(out);
    
    
    ((Controller)controller).excute(request, response); // Object 객체에서 Controller 인터페이스를 꺼내기 위한 타입 캐스팅


}



private void hello(String command,PrintWriter out) {
    out.println("안녕하세요. 성적관리 시스템 입니다.");
    out.println("[성적]");
    out.println("[목록보기 명령: /score/list]");
    out.println("[상세보기 명령: /score/view?name=이름]");
    out.println("[등록: /score/add?name=이름&kor=점수&eng=점수&math=점수]");
    out.println("[변경: /score/update?name=이름&kor=점수&eng=점수&math=점수]");
    out.println("[삭제: /score/delete?name=이름");
    out.println("[회원]");
    out.println("[게시판]");
    out.println("[강의실]");

}




public static void main(String[] args) throws Exception {
    App app = new App();
    app.init();
    app.service();


}


class HttpAgent extends Thread {
    Socket socket;
    
    public HttpAgent(Socket socket) {
       this.socket = socket;
    }
    
    @Override
    public void run() {
        try(
            
                Socket socket = this.socket;
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
                PrintWriter out = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
                ){
           
                 //예) GET /score/list HTTP/1.1 (CRLF)
                 
                    String command = in.readLine().split(" ")[1]; // /score/list 만 가져옴
                 
                    String header = null;
                    while(true) {
                        header = in.readLine();
                        if(header.equals("")) {
                            break;
                        }
                    }
                    
                    out.println("HTTP/1.1 200 OK");
                    out.println("Content-Type:text/plain;charset=UTF-8"); //출력하는 콘텐츠의 MIME 타입
                    out.println();
                    
                    if(command.equals("/")) {
                        hello(command, out);
                    }else {
                        request(command, out);
                        
                    }
                    out.println(); //응답 완료를 표시하기 위한 빈줄 보냄
                    out.flush();
                
                
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}


}




