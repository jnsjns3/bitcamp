package myTest3;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java100.app.annotation.Component;
import java100.app.dao.DaoException;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.domain.Score;

@Component("/room")
public class RoomController extends ArrayList<Room> implements Controller {
    
    private static final long serialVersionUID = 1L;
    Scanner sc = new Scanner(System.in);
    
    
    RoomDao roomDao;
    
    public void setRoomDao(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    @Override
    public void destroy() {
    }
    
    @Override
    public void init() {}
    
    @Override
    public void excute(Request request, Response response) {
        
          
           switch (request.getMenuPaht()) {
        case "/room/add":
            this.doAdd(request, response); break;
            
        case "/room/list":
            this.doList(request, response); break;
        
         
        case "/room/delete":
            this.doDelete(request, response); break;
            
      
        default:
            response.getWriter().println("해당 명령이 없습니다"); break;
            
        }
            
    
    }
    private void doList(Request request, Response response){
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 목록]");
       
        try{
            List<Room> list = roomDao.selectList(); 
             
            for(Room room : list) {
                out.printf("%4d, %4s, %4s, %d\n",
                                                    room.getNo(),
                                                    room.getLocation(),
                                                    room.getName(),
                                                    room.getCapacity());
            }
             
         } catch (Exception e) {
            throw new DaoException();
         }
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 등록]");
        
        try{
            Room room = new Room();
             room.setLocation(request.getParameter("loc"));    
             room.setName(request.getParameter("name"));    
             room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
                
             roomDao.insert(room);
             
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
            
          
   }
   
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 삭제]");
       
       
        try {
            int no= Integer.parseInt(request.getParameter("no"));
            
            
            if(roomDao.delete(no) > 0) {
                
               out.println("삭제됬습니다.");
             
            }else {
                out.printf("'%d' 의 강의실 정보가 없습니다.\n", no);
                           
            }
                        
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
           
        }
        
        
  
    
    
}
