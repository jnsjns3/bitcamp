package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/board/update")
public class BoardUpdateServlet extends HttpServlet {

  
            

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
   
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        response.setContentType("text/plain;charset=UTF-8");
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

           
        
        
 
    
    
}
