package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/board/add")
public class BoardAddServlet extends HttpServlet {

    
  
    
   
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
      
       
            BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
            
            Board board= new Board();
            board.setTitle(request.getParameter("title"));    
            board.setContent(request.getParameter("conts"));    
            
             
            boardDao.insert(board);
            
            response.sendRedirect("list");
            
           
   }

            

           
        
        
 
    
    
}
