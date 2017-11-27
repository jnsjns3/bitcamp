package java100.app;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import java100.app.controll.BordController;
import java100.app.controll.Controller;
import java100.app.controll.Membercontroller;
import java100.app.controll.Request;
import java100.app.controll.Response;
import java100.app.controll.Roomcontroller;
import java100.app.controll.ScoreController;
import java100.app.dao.DaoException;
import java100.app.domain.Board;

// 요구사항
/*
 * JDBC API 적용함

 */


public class App {
    
    ServerSocket ss;
    Scanner sc = new Scanner(System.in);

    //이제 HashMap에 보관하는 값은 Controller 규칙을 준수한 객체이다.
    HashMap<String, Controller> controllerMap = 
            new HashMap<>();


    
    void init() {
        
        ScoreController scoreController = new ScoreController();
        Roomcontroller roomcontroller = new Roomcontroller();
        Membercontroller membercontroller = new Membercontroller();
        BordController bordController = new BordController();
        scoreController.init();
        roomcontroller.init();
        membercontroller.init();
        bordController.init();
        controllerMap.put("/score", scoreController);
        controllerMap.put("/room", roomcontroller);
        controllerMap.put("/member", membercontroller);
        controllerMap.put("/board", bordController);
        
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
    
    private void save() {
        Collection<Controller> controllers = controllerMap.values();
        for(Controller controller : controllers) {
                controller.destroy(); // list에 들어있는 값을 파일에 저장.
        }
       
    }


private void request(String command, PrintWriter out) {
   
    String menuName=command;
    int i = command.indexOf("/", 1); //0다음 부터
    
    if(i !=-1) {
      menuName = command.substring(0, i);
    }


    Controller controller = controllerMap.get(menuName);
    if(controller == null) {
        out.println("해당 명령을 지원하지 않습니다.");
        return;
    }
    Request request = new Request(command);
    
    Response response = new Response();
    response.setWriter(out);
    
    
    controller.excute(request, response);


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
                        save();
                    }
                    out.println(); //응답 완료를 표시하기 위한 빈줄 보냄
                    out.flush();
                
                
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}


}


// 명령> /score/list
//bbb, 100, 100, 100, 300, 100.0
//ccc, 90, 90, 90, 270, 90.0
//
//명령> /score/add?name=aaa&kor=100&eng=90&math=30
//입력되었습니다.
//
//명령> /score/view?name=aaa
//이름: aaa
//국어: 100
//영어: 90
//수학: 30
//합계: 220
//평균: 76.6
//
//명령> /score/update?name=aaa&kor=100&eng=100&math=100
//변경하였습니다.
//
//명령> /score/delete?name=aaa
//삭제하였습니다.
//
//명령>
//
//게시판 명령어 정리:
//목록 => /board/list
//보기 => /board/view?no=1
//등록 => /board/add?no=10&title=aaa&content=bbb
//변경 => /board/update?no=10&title=aaax&content=bbbx
//삭제 => /board/delete?no=10
//
//회원관리 명령어 정리:
//목록 => /member/list
//보기 => /member/view?email=aaa@test.com
//등록 => /member/add?email=bbb@test.com&name=bbb&password=1111
//변경 => /member/update?email=bbb@test.com&name=bbbx&password=2222
//삭제 => /member/delete?email=bbb@test.com
//
//강의실 명령어 정리:
//목록 => /room/list
//보기 => /room/view?name=K101
//등록 => /room/add?name=K101&location=강남&capacity=30
//변경 => /room/update?name=K101&location=강남&capacity=30
//삭제 => /root/delete?name=K101
//

