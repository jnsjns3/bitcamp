package myTest2;

import java.util.ArrayList;
import java.util.Iterator;

public class ScoreController {

    private ArrayList<Score> list = new ArrayList<>();
    
    
    
    public void doDelete() {
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

    public void doUpdate() {
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

    public void doView() {
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

    public void doAdd() {
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
    public void doList(){
        System.out.println("[학생 목록]");
        Iterator<Score> iterator;
        iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
    }
    
}
