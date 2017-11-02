package java100.app;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
성적관리> add
이름? 홍길동
국어? 100
영어? 100
수학? 100
계속 입력하시겠씁니까?(Y/n) <== 'Y' 또는 'y' 그냥 엔터치기
이름? 임꺽정
국어? 90
영어? 90
수학? 90
성적관리> list
홍길동, 300, 100.0
임꺽정, 270, 90.0
> view 
이름? 홍길동
홍길동, 100, 100, 100, 300, 100.0
>delete
이름? 홍길동
정말 삭제하시겠습니까? (y/N)
만약 우헤헤를 입력하면 우헤헤의 성적정보가 없다고 출력하게 하라

update
이름? 홍길동
국어?(100) 80 <=엔터를 치면 원래점수 유지
영어?(100)
수학?(100) 90
변경하시겠습니까(y/N)

*/
 
public class App {
    static Scanner sc = new Scanner(System.in);
    
    static String prompt(String message) {
        
        System.out.println(message);
        return sc.nextLine();
        
        
        
    }
    static boolean confirm(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String response = sc.nextLine().toLowerCase();
        
        if(response.equals("y") || response.equals("Y") || response.equals("") ) {
            return true;
        }
            return false;
        
    }
    static boolean confirm2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String response = sc.nextLine().toLowerCase();
        
        if(response.equals("n") || response.equals("no") || response.equals("") ) {
            return false;
        }
            return true;
        
    }
    
    
    
    public static void main(String[] args) {
        // Score 설계도에 따라 메모리를 준비한다.
        
         
        //제네릭이 적용된 ArrayList를 사용
        
        ArrayList<Score> list = new ArrayList<>();
        Iterator<Score> iterator;
        String name;
        Score score = new Score();
        loop:
        while(true) {
           System.out.println("성적관리> ");
           String input = sc.nextLine();
           
           switch (input) {
        case "add":
                System.out.println("[학생 등록]");
                while(true) {
                    score = new Score();
                    score.input();
                    list.add(score);
                  
                   if(!confirm("계속하시겠습니까?(Y/n)")) {
                            break;
                       
                        }
                }
            
            break;
        case "list":
            System.out.println("[학생 목록]");
            iterator = list.iterator();
            while(iterator.hasNext()) {
                iterator.next().print();
            }
            break;
        case "view":
            System.out.println("[학생 정보]");
            name = prompt("이름? ");
           
           
            iterator = list.iterator();
            while(iterator.hasNext()) {
                Score temp = iterator.next();
                if(temp.name.equals(name)) {
                    score = temp;
                    break;
                }
            }
            if(score == null) {
                System.out.printf("%s 의 성적 정보가 없습니다.\n", name);
            }else {
                score.printDetail();
            }
            break;
        case "update":
            System.out.println("[학생 정보 변경]");
            name = prompt("이름? ");
            
            score = null;
            iterator = list.iterator();
            while(iterator.hasNext()) {
                Score temp = iterator.next();
                if(temp.name.equals(name)) {
                    score = temp;
                    break;
                }
            }
            if(score == null) {
                System.out.printf("%s 의 성적 정보가 없습니다.\n", name);
            }else {
               
                score.update();
                
            }
            
            
            break;
        case "delete":
            System.out.println("[학생 삭제]");
            name = prompt("이름? ");
            
            score = null;
            iterator = list.iterator();
            while(iterator.hasNext()) {
                Score temp = iterator.next();
                if(temp.name.equals(name)) {
                    score = temp;
                    break;
                }
            }
            if(score == null) {
                System.out.printf("%s 의 성적 정보가 없습니다.\n", name);
            }else {
                if(confirm2("정말 삭제하시겠습니까?")) {
                    list.remove(score);
                }else {
                    System.out.println("삭제를 취소하였습니다.");
                }
               
            }
            break;
            
        case "quit":
            System.out.println("프로그램을 종료합니다!");
            
            break loop;
                    
        default:
            System.out.println("실행할수 없는 명령어 입니다.");
            break;
        }
           
        }
        
       
        
        
        
    }
}




