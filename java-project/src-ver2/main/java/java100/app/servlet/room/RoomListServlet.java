package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
       
        
        List<Room> list = roomDao.selectList(); 
        request.setAttribute("list", list);
        
        response.setContentType("text/html;charset=UTF-8");
        
        RequestDispatcher rd = request.getRequestDispatcher("/room/list.jsp");
        rd.include(request, response);
        
        
    }
    

        
        
  
    
    
}
