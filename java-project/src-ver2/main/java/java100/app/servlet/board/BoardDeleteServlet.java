package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/board/delete")
public class BoardDeleteServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        
        int no= Integer.parseInt(request.getParameter("no"));
        boardDao.delete(no);
        
        response.sendRedirect("list");
        
        
    }  
           
        
        
 
    
    
}
