package java100.app;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

import java100.app.controll.BordController;
import java100.app.controll.Controller;
import java100.app.controll.Membercontroller;
import java100.app.controll.Roomcontroller;
import java100.app.controll.ScoreController;

// 요구사항
/*
강의실(지역, 강의실번호, 수용인원) 관리 기능을 추가한다.
1) Room 클래스 정의

 */


public class App {
    Scanner sc = new Scanner(System.in);

    //이제 HashMap에 보관하는 값은 Controller 규칙을 준수한 객체이다.
    HashMap<String, Controller> controllerMap = 
            new HashMap<>();


    void init() {
        controllerMap.put("/score", new ScoreController("./data/score.csv"));
        controllerMap.put("/member", new Membercontroller("./data/member.csv"));
        controllerMap.put("/board", new BordController("./data/bord.csv"));
        controllerMap.put("/room", new Roomcontroller("./data/room.csv")); //ok!
    }

    void service() throws Exception {

        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버실행");
        while(true) {

            try(
                    Socket socket = ss.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
                    PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
                    ){
               
                
                    while(true) {
                       
                        String command = in.readLine();
                        
                        if(command.equals("/")) {
                            hello(command, out);
                        }else if(command.equals("quit")){
                            break;
                        }else {
                            request(command, out);
                        }
                        out.println(); //응답 완료를 표시하기 위한 빈줄 보냄
                        out.flush();
                    }
                
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



private void request(String command, PrintStream out) {
   
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
    out.println("좋은 명령입니다. ^^");
    //controller.excute();


}



private void hello(String command,PrintStream out) {
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


}




