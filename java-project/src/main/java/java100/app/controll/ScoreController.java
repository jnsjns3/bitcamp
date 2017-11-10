package java100.app.controll;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Score;
import java100.app.util.Prompts;

public class ScoreController extends GenericController<Score> {

    private String dataFilePath;
    
    public ScoreController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
        
        
    }
    
    //Arraylist에 보관된 데이터를 score.txt 파일에 저장한다.
    //저장방식은 CSV 방식을 사용한다.
    @Override
    public void destroy() {
        
      
        try (FileWriter out = new FileWriter(this.dataFilePath);){
            
            
            for(Score score : this.list) {
                out.write(score.toCSVString() + "\n");
            }
            
           
        } catch (IOException e) {
            e.printStackTrace();
        
        }
        
    }
    @Override
    public void init() {
        try(FileReader in = new FileReader(this.dataFilePath);
            Scanner sc = new Scanner(in);    
                ) {
            
            String csv = null;
            while(sc.hasNextLine()) {
              csv = sc.nextLine();  
             
                try {
                    list.add(new Score(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            
            
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
} 
    
    
    @Override
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
        //String name = Prompts.input("이름? ");
       
        String name = Prompts.inputString("이름?");
        Score score = findByName(name);
        
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
       String name = Prompts.inputString("이름?");
        
        Score score = findByName(name);
        
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            int kor = score.getKor();
            try {
                kor = Prompts.inputInt("국어?(%d) ", score.getKor());
            } catch(Exception e) {}
            
            int eng = score.getEng();
            try {
                eng = Prompts.inputInt("영어?(%d) ", score.getEng());
            } catch(Exception e) {}
            
            int math = score.getMath();
            try {
                math = Prompts.inputInt("수학?(%d) ", score.getMath());
            } catch(Exception e) {}
            
            if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
                score.setKor(kor);
                score.setEng(eng);
                score.setMath(math);
                System.out.println("변경하였습니다.");
                
            } else {
                System.out.println("변경을 취소하였습니다.");
            }
            
        }
       
   }

    private void doView() {
        System.out.println("[성적 정보]");
        String name = Prompts.inputString("이름?");
        Score score = findByName(name);
       
        if(score == null) {
            System.out.printf("%s 의 성적 정보가 없습니다.\n", name);
            return;
            
        }
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",   
                score.getName(), 
                score.getKor(), 
                score.getEng(), 
                score.getMath(), 
                score.getSum(), 
                score.getAver());
            
   }

    private void doAdd() {
        System.out.println("[성적 등록]");
        Score score;
       
           score = new Score();
            
            score.setName(Prompts.inputString("이름?"));
            score.setKor(Prompts.inputInt("국어? "));
            score.setEng(Prompts.inputInt("영어? "));
            score.setMath(Prompts.inputInt("수학? "));
            
            list.add(score);
         
   }
    
    private void doList(){
        System.out.println("[학생 목록]");
        Iterator<Score> iterator;
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Score score = iterator.next();
             System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                        score.getName(), 
                        score.getKor(), 
                        score.getEng(), 
                        score.getMath(), 
                        score.getSum(), 
                        score.getAver());
            
        }
    }
    
    private Score findByName(String name) {
        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()) {
            Score score = iterator.next();
            if(score.getName().equals(name)) {
                return score;
            }
        }
        return null;
        
    }
    
    
}
