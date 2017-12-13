package java100.app.servlet.score;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

//클라이언트가 /score/로 시작하는 URL을 요청할 떄 이 서블릿을 실행하라고 표시한다.
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/score/list")
public class ScoreListServlet extends HttpServlet {
   
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
  
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
        response.setContentType("text/plain;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
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
        out.println("<title>성적관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
      
        out.println("<h1>성적 목록</h1>");
        
        out.println("<p><a href='add' class='btn btn-primary btn-sm'>추가</a></p>");
        
        out.print("<table class='table table-hover'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>번호</th><th>이름</th><th>합계</th><th>평균</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");
        
        try{
           List<Score> list = scoreDao.selectList(); 
            
           for(Score score : list) {
               
               out.printf("<tr><td>%d</td><td>"
                       + "<a href='view?no=%d'>%s</a>"
                       + "</td><td>%d</td><td>%3.1f</td></tr>\n",
                                                   score.getNo(),
                                                   score.getNo(),
                                                   score.getName(),
                                                   score.getSum(),
                                                   score.getAver());
           }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        out.print("</tbody>");
        out.print("</table>");
        out.print("</body>");
        out.print("</div>");
        
        out.print("</html>");
        
        
    }
    
   
    
    
}
