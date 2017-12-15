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
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/board/update")
public class BoardUpdateServlet extends HttpServlet {

  
            

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
   
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
        
        out.println("<h1>게시물 변경</h1>");
   
    
    
    try {
        
        Board board = new Board();
        board.setNo(Integer.parseInt(request.getParameter("no")));
        board.setTitle(request.getParameter("title"));    
        board.setContent(request.getParameter("conts"));
        
            
       boardDao.update(board);
      
       out.println("<p>저장하였습니다.</p>");
        
        if(boardDao.update(board) > 0) {
            out.println("<p>변경하였습니다.</p>");
        }else {
            out.printf("<p>'%s'의 게시물 정보가 없습니다.</p>\n", board.getNo());
        }
        
        
    } catch (Exception e) {
        e.printStackTrace();
        out.println(e.getMessage());
    }
    out.print("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
    
    rd = request.getRequestDispatcher("/footer");
    rd.include(request, response);
    
    out.print("</div>");
    
    out.print("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
    out.print("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
    out.print("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
    
    out.print("</body>");
    out.print("</html>");
    
}

           
        
        
 
    
    
}
