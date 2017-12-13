package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.DaoException;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/room/list")
public class RoomListServlet extends HttpServlet {
    
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
   
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
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
        out.println("<title>강의실관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
      
        out.println("<h1>강의실 목록</h1>");
        
        out.println("<p><a href='add' class='btn btn-primary btn-sm'>추가</a></p>");
        
        out.print("<table class='table table-hover'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>번호</th><th>지역</th><th>강의실명</th><th>수용인원</th><th></th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");
        
        
        try{
            List<Room> list = roomDao.selectList(); 
             
            for(Room room : list) {
                out.printf("<tr><td>%d</td><td>%s</td>"
                        + "<td>%s</td><td>%d</td><td><a href='delete?no=%d'>삭제</a></td></tr>\n",
                                                    room.getNo(),
                                                    room.getLocation(),
                                                    room.getName(),
                                                    room.getCapacity(),
                                                    room.getNo());
            }
             
         } catch (Exception e) {
            throw new DaoException();
         }
        out.print("</tbody>");
        out.print("</table>");
        out.print("</body>");
        out.print("</div>");
        
        out.print("</html>");
    }
    

        
        
  
    
    
}
