package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// sql 문 보내기
public class JdbcDelete {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        //Class.forName(new Driver().getClass().getName());
        
        
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        
        System.out.println("연결되었슴!");
        
        //빈 sql문 객체를 생성
        Statement stmt =con.createStatement();
        stmt.executeUpdate("delete from jdbc_test where no=1 ");
        
        System.out.println("삭제완료!");
        stmt.close();
        con.close();
        
        
    
    }   
    
}
