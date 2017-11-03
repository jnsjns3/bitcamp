package myTest3;
import java.util.Scanner;

// 요구사항
/*
 회원관리> add
 이름? 홍길동
 이메일? hong@test.com
 암호? 111
 이미 등록된 이메일입니다.
 입력하였습니다.
 
 회원관리> list
 홍길동, hong@test.com
 
 성적관리> view
 이메일 ? hong@test.com
 hong@test.com의 회원정보가 없습니다

 성적관리> delete
 이메일? hong@test.com
 hong@test.com의 회원정보가 없습니다

 성적관리>update
 이메일? hong@test.com
 이름?(홍길동) 홍길동2
 암호?(1111) 2222
 변경하시겠씁니까? (y/n)
 

 */


public class App {
    static Scanner sc = new Scanner(System.in);
    static ScoreController scoreController = new ScoreController();
    
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
            
            scoreController.excute2(); break;
            
        case "3":
            System.out.println("게시판");
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




