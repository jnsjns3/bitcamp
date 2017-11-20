package java100.app.controll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

import java100.app.domain.Board;
import java100.app.domain.Score;
import java100.app.util.Prompts;

public class BordController extends GenericController<Board> {

    private String dataFilePath;
    
    public BordController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
  
    public void destroy() {
        
        
        try (PrintWriter out = new PrintWriter
                (new BufferedWriter
                        (new FileWriter(this.dataFilePath)));){
            
            
            for(Board bord : this.list) {
                out.println(bord.toCSVString());
            }
            
           out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        
        }
        
    }
    @Override
    public void init() {
        try(BufferedReader in = new BufferedReader(
                new FileReader(this.dataFilePath));  
                ) {
            
            String csv = null;
            while((csv=in.readLine()) != null) {
              
                try {
                    list.add(new Board(csv));
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
    public void excute(Request request, Response response) {
      
           switch (request.getMenuPaht()) {
        case "/board/add":
            this.doAdd(request, response); break;
        case "/board/list":
            this.doList(request, response); break;
        case "/board/view":
            this.doView(request, response); break;
        case "/board/update":
            this.doUpdate(request, response); break; 
        case "/board/delete":
            this.doDelete(request, response); break;
            
        default:
            response.getWriter().println("해당 명령이 없습니다"); break;
            
        }
            
    
    }
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
       out.println("[게시 목록]");
        
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            out.printf("%d, %s, %s, %d\n",  
                    board.getNo(), 
                    board.getTitle(),
                    board.getRegDate().toString(),
                    board.getViewCount());
        }
        out.println();
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        
        
        Board bord = new Board();
        bord.setNo(Integer.parseInt(request.getParameter("no")));
        
        if(findByNo(bord.getNo()) != null) {
            out.println("이미 등록된 번호 입니다.");
            return;
        }
                
                bord.setTitle(request.getParameter("title"));
                bord.setContent(request.getParameter("content"));
                bord.setRegDate(new Date(System.currentTimeMillis())); // 최근 시간 입력
              
                list.add(bord);
                out.println("등록되었습니다.");
           
   }
    
private void doView(Request request, Response response) {
    
        PrintWriter out = response.getWriter();
        
       
        int no = Integer.parseInt(request.getParameter("no"));
        
        Board bord = findByNo(no);
        
        if(bord == null) {
            out.printf("%d 의 게시물 정보가 없습니다.\n", no);
            return;
        }
            out.printf("제목: %s\n", bord.getTitle(),
                     "내용: %s\n", bord.getContent(),
                     "등록일: %s\n", bord.getRegDate().toString(),
                     "조회수: %d\n", bord.getViewCount());
            out.println();
            bord.setViewCount(bord.getViewCount() + 1);
            out.println();
            
            
        
       
   }

private void doUpdate(Request request, Response response) {
   
    PrintWriter out = response.getWriter();
   
    int no = Integer.parseInt(request.getParameter("no"));
    
    Board bord = findByNo(no);
    
    if (bord == null) {
        out.printf("%d번 게시물이 없습니다.\n", no);
        return;
    } 
    
    bord.setTitle(request.getParameter("title"));
    bord.setContent(request.getParameter("content"));
    bord.setRegDate(new Date(System.currentTimeMillis()));
    out.println("변경하였습니다!");
}
    private void doDelete(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");
        int no = Integer.parseInt(request.getParameter("no"));
        
        Board bord = findByNo(no);
        
        if (bord == null) {
            out.printf("%d번 게시물이 없습니다.\n", no);
            return;
        } 
           list.remove(bord);
           out.println("삭제하였습니다.");
        
    }  
           
        
        
   
    private Board findByNo(int no) {
        Iterator<Board> iterator;
        
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Board bord = iterator.next();
            if(bord.getNo() == no) {
                return bord;
                
            }
        }
        return null;
        
    }
    
    
}
