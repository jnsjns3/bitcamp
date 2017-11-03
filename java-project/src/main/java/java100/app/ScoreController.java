package java100.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScoreController {

    private ArrayList<Score> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
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
