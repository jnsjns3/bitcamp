package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java100.app.dao.DaoException;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.domain.Score;

public class HelloController extends ArrayList<Room> implements Controller {
    
    private static final long serialVersionUID = 1L;
    

    @Override
    public void destroy() {
    }
    
    @Override
    public void init() {}
    
    @Override
    public void excute(Request request, Response response) {
        
          
           switch (request.getMenuPaht()) {
        case "/hello/hi":
            this.doHi(request, response); break;
            
        case "/hello/hi2":
            this.doHi2(request, response); break;
        
         
        case "/hello/hi3":
            this.doDelete(request, response); break;
            
      
        default:
            response.getWriter().println("해당 명령이 없습니다"); break;
            
        }
            
    
    }
    private void doHi(Request request, Response response){
        PrintWriter out = response.getWriter();
        
        out.println("[hihihi]");
       
       
    }
    
    private void doHi2(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[hihihihihihihi");
        
       
            
          
   }
   
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 삭제]");
       
           
        }
        
        
  
    
    
}
