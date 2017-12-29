package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// sql 문 보내기
public class JdbcSelect {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        //Class.forName(new Driver().getClass().getName());
        
        
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        
        System.out.println("연결되었슴!");
        
        //빈 sql문 객체를 생성
        Statement stmt =con.createStatement();
        
        //조회할떄는 executeQuery 문을 사용해야 한다.
        
        ResultSet rs =stmt.executeQuery("select * from jdbc_test");
        
       while(rs.next()) {
        System.out.printf("%d, %s, %s, %s, %d\n",rs.getInt("no"),
                                                 rs.getString(2),
                                                 rs.getString("conts"),
                                                 rs.getString("regdt").toString(),
                                                 rs.getInt("vwcnt"));   
       }
        
        
       rs.close();
        stmt.close();
        con.close();
        
        
    
    }   
    
}
