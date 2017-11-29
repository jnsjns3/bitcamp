package myTest4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.beans.ApplicationContext;
import java100.app.domain.Room;
import java100.app.util.DataSource;

public interface RoomDao {

    List<Room> selectList();
    int insert(Room room);
    int delete(int no);
    
    
    
}
