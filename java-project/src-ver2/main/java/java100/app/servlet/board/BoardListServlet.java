package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
        
         BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(
                 BoardDao.class);
         
         List<Board> list = boardDao.selectList();
         
         request.setAttribute("list", list);
         
         response.setContentType("text/html;charset=UTF-8");
         
         RequestDispatcher rd = request.getRequestDispatcher("/board/list.jsp");
         rd.include(request, response);
        
    }
    
    
    
    
}
