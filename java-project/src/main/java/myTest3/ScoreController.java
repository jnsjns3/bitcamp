package myTest3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScoreController {

    private ArrayList<Score> list = new ArrayList<>();
    private ArrayList<Score2> list2 = new ArrayList<>();
    
    static Scanner sc = new Scanner(System.in);
    public void excute2() {
        loop:
            while(true) {
           System.out.println("회원관리> ");
           String input = sc.nextLine();
          
           switch (input) {
        case "add":
            this.doAdd2(); break;
            
        case "list":
            this.doList2(); break;
            
        case "view":
            this.doView2(); break;
            
        case "update":
            this.doUpdate2(); break; 
            
        case "delete":
            this.doDelete2(); break;
            
        case "main":
            break loop;
              
        default:
            System.out.println("해당 명령이 없습니다"); break;
            
        }
            }
        
    }
    
    
    private void doDelete2() {
        System.out.println("[학생 삭제]");
        String email = Prompts.input("E-mail? ");
        
        Score2 score = null;
        Iterator<Score2> iterator = list2.iterator();
        while(iterator.hasNext()) {
            Score2 temp = iterator.next();
            if(temp.email.equals(email)) {
                score = temp;
                break;
            }
        }
        if(score == null) {
            System.out.printf("%s 님 의 정보가 없습니다.\n", email);
        }else {
            if(Prompts.confirm2("정말 삭제 하시겠습니까?")) {
                list2.remove(score);
            }else {
                System.out.println("삭제를 취소하였습니다.");
            }
           
        }
        
        
       
   }

    private void doUpdate2() {
        System.out.println("[회원 정보 변경]");
       String emaile = Prompts.input("E-mail? ");
        
        Score2 score = null;
        Iterator<Score2> iterator = list2.iterator();
        while(iterator.hasNext()) {
            Score2 temp = iterator.next();
            if(temp.email.equals(emaile)) {
                score = temp;
                break;
            }
        }
        if(score == null) {
            System.out.printf("%s 님의 정보가 없습니다.\n", emaile);
        }else {
           
            score.update();
            
        }
       
   }

    private void doView2() {
        System.out.println("[회원 정보]");
        String email = Prompts.input("e-mail? ");
        Score2 score = null;
       Iterator<Score2> iterator;
       
        iterator = list2.iterator();
        while(iterator.hasNext()) {
            Score2 temp = iterator.next();
            if(temp.email.equals(email)) {
                score = temp;
                break;
            }
        }
        if(score == null) {
            System.out.printf("%s 의 정보가 없습니다.\n", email);
        }else {
            score.printDetail();
        }
       
   }

    private void doAdd2() {
        System.out.println("[학생 등록]");
        Score2 score;
        
            score = new Score2();
            System.out.println("이름?");
            String name = sc.nextLine();
            System.out.println("이메일?");
            String email = sc.nextLine();
            System.out.println("암호?");
            String password = sc.nextLine();
            
            Iterator<Score2> iterator;
            iterator = list2.iterator();
           
            boolean su = true;
            while(iterator.hasNext()) {
                if(email.equals(iterator.next().email)) {
                    
                    System.out.println("중복된 이메일 입니다. 저장되지 않습니다.");
                    su = false;
                }
            }
            
            if(su == true) {
                score.input(name, email, password);
                list2.add(score);
                System.out.println("저장되었습니다.");
            }
            
            
            
            
            
            
                
            
       
   }
    private void doList2(){
        System.out.println("[학생 목록]");
        Iterator<Score2> iterator;
        iterator = list2.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
    }
   
    //---------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------
    
    public void excute() {
        loop:
            while(true) {
           System.out.println("성적관리> ");
           String input = sc.nextLine();
          
           switch (input) {
        case "add":
            this.doAdd(); break;
            
        case "list":
            this.doList(); break;
            
        case "view":
            this.doView(); break;
            
        case "update":
            this.doUpdate(); break; 
            
        case "delete":
            this.doDelete(); break;
            
        case "main":
            break loop;
              
        default:
            System.out.println("해당 명령이 없습니다"); break;
            
        }
            }
        
    }
    
    
    private void doDelete() {
        System.out.println("[학생 삭제]");
        String name = Prompts.input("이름? ");
        
        Score score = null;
        Iterator<Score> iterator = list.iterator();
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
            if(Prompts.confirm2("정말 삭제 하시겠습니까?")) {
                list.remove(score);
            }else {
                System.out.println("삭제를 취소하였습니다.");
            }
           
        }
        
        
       
   }

    private void doUpdate() {
        System.out.println("[학생 정보 변경]");
       String name = Prompts.input("이름? ");
        
        Score score = null;
        Iterator<Score> iterator = list.iterator();
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
       
   }

    private void doView() {
        System.out.println("[학생 정보]");
        String name = Prompts.input("이름? ");
        Score score = null;
       Iterator<Score> iterator;
       
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
       
   }

    private void doAdd() {
        System.out.println("[학생 등록]");
        Score score;
        while(true) {
            score = new Score();
            score.input();
            list.add(score);
          
           if(!Prompts.confirm("계속하시겠습니까?(Y/n)")) {
                    break;
               
                }
        }
       
   }
    private void doList(){
        System.out.println("[학생 목록]");
        Iterator<Score> iterator;
        iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
    }
    
}
