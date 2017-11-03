package myTest2;
import java.util.Scanner;

//리팩토링(refactoring) : extract method
//  - 작은 기능 단위로 메소드를 추출하는 방법 
// 성적 관리 명령을 처리하는 메서드를 별도의 클래스로 분류한다.

// 요구사항
/*
 명령> menu
 1 성적관리
 2 회원관리
 3 게시판

명령> quit
프로그램을 종료합니다.

잘못된 명령 입니다.
 명령> help
 명령을 실행할 때는 'go 번호' 를 입력하세요
 
 */


public class App {
    static Scanner sc = new Scanner(System.in);
    static void doError() {
        System.out.println("실행할수 없는 명령어 입니다.");
        
       
   }

   static void doQuite() {
        System.out.println("프로그램을 종료합니다!");
        
   }
    public static void main(String[] args) {
        ScoreController scoreController = new ScoreController();
        
        System.out.println("명령> menu");
        System.out.println("1 성적관리");
        System.out.println("2 회원관리");
        System.out.println("3 게시판");
        String meue = sc.nextLine();
        
        switch (meue) {
        case "go 1":
            loop:
                while(true) {
                   System.out.println("성적관리> ");
                   String input = sc.nextLine();
                   
                   switch (input) {
                case "add":
                    scoreController.doAdd(); break;
                    
                case "list":
                    scoreController.doList(); break;
                    
                case "view":
                    scoreController.doView(); break;
                    
                case "update":
                    scoreController.doUpdate(); break; 
                    
                case "delete":
                    scoreController.doDelete(); break;
                
                case "quit":
                    doQuite(); break loop;
                      
                default:
                    doError(); break;
                    
                }
                   
                   
                }
               
        case "go 2":
            System.out.println("회원관리");
            break;
        case "go 3":
            System.out.println("게시판");
            break;
        case "quit":
            doQuite();
            
            break;
        case "help":
            System.out.println("명령을 실행할 때는 'go 번호' 를 입력하세요");
           
            break;
        default:
            doError();
            break;
        }
    
    }     
    
       
        

    

    
}




