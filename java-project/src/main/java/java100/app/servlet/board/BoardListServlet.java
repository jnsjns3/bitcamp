package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/board/list")
public class BoardListServlet extends HttpServlet {

   
     @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        response.setContentType("text/plain;charset=UTF-8");
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
    
     
    
    
}
