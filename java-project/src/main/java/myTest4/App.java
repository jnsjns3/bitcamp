package myTest4;
import java.util.Scanner;

// 요구사항
/*
 게시판> add
 번호? 1
 제목? aaa
 내용? aaaa
 날짜
 
 입력하였습니다.
 
 회원관리> add
 번호? 1
 이미 등록된 번호입니다.
 
 성적관리> list
1, aaa, 2017-11-3, 0(조회수)
2, bbb, 2017-11-3, 2

성적관리> view
번호? 1
제목: aaa
내용: aaaa
등록일: 2017-11-3
조회수: 1
9번 게시물이 없습니다.

성적관리>delete
 번호 ? 1
 삭제하시겠습니까?
 
성적관리>update
번호? 1
제목?(aaa) xxx <= 원래 값 유지
내용: 222 <= 그냥 입력하지 않고 엔터치면 빈 문자열이 내용이 된다.
날짜 <= 등록일을 현재 날짜 및 시각으로 바꿔라
 */


public class App {
    static Scanner sc = new Scanner(System.in);
    static ScoreController scoreController = new ScoreController();
    static Membercontroller memberController = new Membercontroller();
    static BordController bordController = new BordController();
    
    public static void main(String[] args) {
       
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
         
        
         switch (menuNO) {
        case "1": scoreController.excute(); break;
            
        case "2":
            
            memberController.excute();
            break;
        case "3":
           bordController.excute();
            break;
        default:
            System.out.println("메뉴번호가 잘못되었습니다.");
            break;
        }
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
         System.out.println("프로그램을 종료합니다!");
         
    }

    

    
}




