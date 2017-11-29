package myTest3;

import java.io.PrintWriter;
import java.util.List;

import java100.app.annotation.Component;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Component("/board")
public class BoardController implements Controller {

   BoardDao boardDao;
   
   
    public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
    }

    
    public void destroy() {}
    
    @Override
    public void init() {
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
        
        
       try{
           List<Board> list = boardDao.selectList(); 
            
           for(Board board : list) {
               out.printf("%4d, %4s, %4s, %4s, %4d\n",
                                                   board.getNo(),
                                                   board.getTitle(),
                                                   board.getContent(),
                                                   board.getRegDate(),
                                                   board.getViewCount());
           }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        try{
            Board board = new Board();
                board.setTitle(request.getParameter("title"));    
                board.setContent(request.getParameter("conts"));    
            
                 
            boardDao.insert(board);
           
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
                
           
   }
    
private void doView(Request request, Response response) {
    
        PrintWriter out = response.getWriter();
        
        
try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            Board board = boardDao.selectOne(no);
            
            if(board != null) {
                
                out.printf("번호: %d\n", board.getNo());
                out.printf("제목: %s\n", board.getTitle());
                out.printf("내용: %s\n", board.getContent());
                out.printf("날짜: %s\n", board.getRegDate());
                out.printf("조회수: %d\n", board.getViewCount());
             
           }else {
                out.printf("'%d' 의 게시물 정보가 없습니다.\n", no);
                           
             }
                        
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
   }
            


private void doUpdate(Request request, Response response) {
   
    PrintWriter out = response.getWriter();
   
    
    
    try {
        
        Board board = new Board();
        board.setNo(Integer.parseInt(request.getParameter("no")));
        board.setTitle(request.getParameter("title"));    
        board.setContent(request.getParameter("conts"));
        
            
       boardDao.update(board);
      
       out.println("저장하였습니다.");
        
        if(boardDao.update(board) > 0) {
            out.println("변경하였습니다.");
        }else {
            out.printf("'%s'의 게시물 정보가 없습니다.\n", board.getNo());
        }
        
        
    } catch (Exception e) {
        e.printStackTrace();
        out.println(e.getMessage());
    }
    
    
}
    private void doDelete(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");
        
           
        try {
            int no= Integer.parseInt(request.getParameter("no"));
            
            
            if(boardDao.delete(no) > 0) {
                
               out.println("삭제됬습니다.");
             
            }else {
                out.printf("'%d' 의 게시물 정보가 없습니다.\n", no);
                           
            }
                        
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }  
           
        
        
 
    
    
}
