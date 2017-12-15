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
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       
       out.println("<!DOCTYPE html>");
       out.println("<html>");
       out.println("<head>");
       out.println("<title>게시물관리</title>");
       out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
       
       out.println("<link rel='stylesheet' href='../css/common.css'>");
    
       out.println("</head>");
       out.println("<body>");
       out.println("<div class='container'>");
        
       RequestDispatcher rd = request.getRequestDispatcher("/header");
       rd.include(request, response);
       
       out.println("<h1>게시물 등록 결과</h1>");
       
        try{
            Board board = new Board();
                board.setTitle(request.getParameter("title"));    
                board.setContent(request.getParameter("conts"));    
                
                 
            boardDao.insert(board);
           
            out.println("<p>저장하였습니다.</p>");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        out.println("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        
        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
        
        out.print("</div>");
        
        out.print("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.print("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.print("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
        
        out.println("</body>");
        out.println("</html>");    
           
   }

            

           
        
        
 
    
    
}
