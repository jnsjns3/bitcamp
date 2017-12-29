package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

// sql 문 보내기
public class JdbcUpdate {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        //Class.forName(new Driver().getClass().getName());
        
        
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        
        System.out.println("연결되었슴!");
        
        //빈 sql문 객체를 생성
        Statement stmt =con.createStatement();
        stmt.executeUpdate("update jdbc_test set title='xxx',conts='xxx' where no=27 ");
        
        System.out.println("변경완료!");
        stmt.close();
        con.close();
        
        
    
    }   
    
}
