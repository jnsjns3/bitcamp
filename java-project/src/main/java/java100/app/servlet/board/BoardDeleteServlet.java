package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<title>게시물관리</title>");
        
        
        out.println("<style>");
        out.println(".container {");
        out.println(" width: 680px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>게시물 삭제</h1>");
        
           
        try {
            int no= Integer.parseInt(request.getParameter("no"));
            
            
            if(boardDao.delete(no) > 0) {
                
               out.println("<p>삭제됬습니다.</p>");
             
            }else {
                out.printf("<p>'%d' 의 게시물 정보가 없습니다.</p>\n", no);
                           
            }
                        
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        out.print("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
        
    }  
           
        
        
 
    
    
}
