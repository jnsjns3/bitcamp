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
      
        
        
        out.println("<h1>게시물 목록</h1>");
        
        out.println("<p><a href='form.jsp' class='btn btn-primary btn-sm'>추가</a></p>");
        
        out.print("<table class='table table-hover'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>번호</th><th>제목</th><th>내용</th><th>날짜</th><th>조회수</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");
       
        
        
       try{
           List<Board> list = boardDao.selectList(); 
            
           for(Board board : list) {
               out.printf("<tr><td>%d</td><td>"
                       + "<a href='view?no=%d'>%s</a>"
                       + "</td><td>%s</td><td>%s</td><td>%d</td></tr>\n",
                                                   board.getNo(),
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
       out.print("</tbody>");
       out.print("</table>");
       
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
