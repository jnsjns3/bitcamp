package java100.app.servlet.score;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.listener.ContextLoaderListener;

//클라이언트가 /score/로 시작하는 URL을 요청할 떄 이 서블릿을 실행하라고 표시한다.
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/score/delete")
public class ScoreDeleteServlet extends HttpServlet {
  
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
        
        int no= Integer.parseInt(request.getParameter("no"));
        
        scoreDao.delete(no);
       
        response.sendRedirect("list");
        
   }

 
    
}
