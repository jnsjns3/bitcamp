package java100.app;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import java100.app.controll.BordController;
import java100.app.controll.Controller;
import java100.app.controll.GenericController;
import java100.app.controll.Membercontroller;
import java100.app.controll.Roomcontroller;
import java100.app.controll.ScoreController;
import java100.app.domain.Bord;
import java100.app.domain.Member;
import java100.app.domain.Room;
import java100.app.domain.Score;

// 요구사항
/*
강의실(지역, 강의실번호, 수용인원) 관리 기능을 추가한다.
1) Room 클래스 정의

 */


public class App {
    static Scanner sc = new Scanner(System.in);
    
    //이제 HashMap에 보관하는 값은 Controller 규칙을 준수한 객체이다.
    static HashMap<String, Controller> controllerMap = 
            new HashMap<>();
    
    
    
    
    public static void main(String[] args) {
       
        controllerMap.put("1", new ScoreController("./data/scroe.csv"));
        controllerMap.put("2", new Membercontroller("./data/member.csv"));
        controllerMap.put("3", new BordController("./data/bord.csv"));
        
        // Roomcontroller는 GenericController를 상속 받지 않았따.
        // 그래서 controllerMap에 저장할 수 없다.
        controllerMap.put("4", new Roomcontroller("./data/room.csv")); //ok!
        
        loop:
        while(true) {
            System.out.println("명령>");
            String[] input = sc.nextLine().toLowerCase().split(" ");
            
            try {
            switch (input[0]) {
            case "menu":
                doMenu();
                break;
            case "help":
                doHelp();
                System.out.println("도움말 출력");
                break;
            
            case "quit":
                doQuite(); break loop;
            case "go":
                doGo(input[1]); break;

            default:
                doError();
                
            }
            }catch (Exception e) {
                System.out.println("명령 처리 중 오류 발생!");
            }
            
            
          
        }
        
       
    }
    
     private static void doGo(String menuNO) {
         
        
         Controller controller = controllerMap.get(menuNO);
         if(controller == null) {
             System.out.println("해당 번호의 메뉴가 없습니다.");
             return;
         }
         controller.excute();
         
         
    }

   

    private static void doHelp() {
         System.out.println("[명령]");
         System.out.println("menu           -메뉴 목록을 출력한다");
         System.out.println("명령을 실행할 때는 'go 번호' 를 입력하세요");
         System.out.println("quit           -프로그램 종료");
         
    }

    private static void doMenu() {
        System.out.println("1. 성적관리");
        System.out.println("2. 회원관리");
        System.out.println("3. 게시판");
        
    }

    private static void doError() {
         System.out.println("실행할수 없는 명령어 입니다.");
        
    }

    private static void doQuite() {
        Collection<Controller> controls = controllerMap.values();
        for(Controller control : controls) { 
         control.destroy(); //각 컨트롤러에게 마무리 기회를 준다.
        }
        
        System.out.println("프로그램을 종료합니다!");
         
    }

    

    
}




