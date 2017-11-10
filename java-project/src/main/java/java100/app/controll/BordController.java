package java100.app.controll;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

import java100.app.domain.Bord;
import java100.app.domain.Score;
import java100.app.util.Prompts;

public class BordController extends GenericController<Bord> {

    private String dataFilePath;
    
    public BordController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
  
    public void destroy() {
        
        
        try (FileWriter out = new FileWriter(dataFilePath);){
            
            
            for(Bord bord : this.list) {
                out.write(bord.toCSVString() + "\n");
            }
            
           
        } catch (IOException e) {
            e.printStackTrace();
        
        }
        
    }
    @Override
    public void init() {
        try(FileReader in = new FileReader(dataFilePath);
            Scanner sc = new Scanner(in);    
                ) {
            
            String csv = null;
            while(sc.hasNextLine()) {
              csv = sc.nextLine();  
             
                try {
                    list.add(new Bord(csv));
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
           System.out.println("게시판> ");
           
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
    
    private void doList() {
        System.out.println("[게시물 목록]");
        
        Iterator<Bord> iterator = list.iterator();
        while (iterator.hasNext()) {
            Bord board = iterator.next();
            System.out.printf("%d, %s, %s, %d\n",  
                    board.getNo(), 
                    board.getTitle(),
                    board.getRegDate().toString(),
                    board.getViewCount());
        }
    }
    
    private void doAdd() {
        System.out.println("[게시물 등록]");
        
        
        Bord bord = new Bord();
        bord.setNo(Prompts.inputInt("번호? "));
        
        if(findByNo(bord.getNo()) != null) {
            System.out.println("이미 등록된 번호 입니다.");
        }
                
                bord.setTitle(Prompts.inputString("제목? "));
                bord.setContent(Prompts.inputString("내용? "));
                bord.setRegDate(new Date(System.currentTimeMillis())); // 최근 시간 입력
              
                list.add(bord);
           
   }
    
private void doView() {
        
        System.out.println("[게시물 상세 정보]");
       
        int no = Prompts.inputInt("번호? ");
        
        Bord bord = findByNo(no);
        
        if(bord == null) {
            System.out.printf("%d 의 게시물 정보가 없습니다.\n", no);
            return;
        }else {
            System.out.printf("제목: %s\n", bord.getTitle());
            System.out.printf("내용: %s\n", bord.getContent());
            System.out.printf("등록일: %s\n", bord.getRegDate().toString());
            bord.setViewCount(bord.getViewCount() + 1);
            System.out.printf("조회수: %d\n", bord.getViewCount());
              
        }
       
   }

private void doUpdate() {
    System.out.println("[게시물 변경]");
    int no = Prompts.inputInt("번호? ");
    
    Bord bord = findByNo(no);
    
    if (bord == null) {
        System.out.printf("%d번 게시물이 없습니다.\n", no);
        return;
    } 
    
    String title = Prompts.inputString("제목?(%s) ", bord.getTitle());
    if (title.isEmpty()) {
        title = bord.getTitle();
    }
    
    String content = Prompts.inputString("내용? ");
    
    if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
        bord.setTitle(title);
        bord.setContent(content);
        bord.setRegDate(new Date(System.currentTimeMillis()));
        System.out.println("변경하였습니다.");
        
    } else {
        System.out.println("변경을 취소하였습니다.");
    }
}
    private void doDelete() {
        System.out.println("[게시물 삭제]");
        int no = Prompts.inputInt("번호? ");
        
        Bord bord = findByNo(no);
        
        if (bord == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", no);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(bord);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }  
           
        
        
   
    private Bord findByNo(int no) {
        Iterator<Bord> iterator;
        
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Bord bord = iterator.next();
            if(bord.getNo() == no) {
                return bord;
                
            }
        }
        return null;
        
    }
    
    
}
