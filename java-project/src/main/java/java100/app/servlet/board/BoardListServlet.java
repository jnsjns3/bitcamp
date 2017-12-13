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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        
        out.println("<style>");
        out.println(".container {");
        out.println(" width: 680px;");
        out.println("}");
        out.println("</style>");
        out.println("<title>게시물관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
      
        out.println("<h1>게시물 목록</h1>");
        
        out.println("<p><a href='add' class='btn btn-primary btn-sm'>추가</a></p>");
        
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
       out.print("</div>");
       out.print("</body>");
       
       
       out.print("</html>");
        
    }
    
    
    
    
}
