package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@WebServlet(urlPatterns="/room/add")
public class RoomAddServlet extends HttpServlet {
    
 
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
        
        Room room = new Room();
        room.setLocation(request.getParameter("loc"));    
        room.setName(request.getParameter("name"));    
        room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
           
        roomDao.insert(room);
        
        response.sendRedirect("list");
        
          
   }
   
  
        
        
  
    
    
}
