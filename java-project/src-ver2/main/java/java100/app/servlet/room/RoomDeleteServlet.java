package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

import java100.app.dao.DaoException;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/room/delete")
public class RoomDeleteServlet extends HttpServlet {
    

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
        
        int no= Integer.parseInt(request.getParameter("no"));
        
        roomDao.delete(no);
        
        response.sendRedirect("list");
        
           
        }
        
        
  
    
    
}
