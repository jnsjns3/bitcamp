package bitcamp.java100.ch17.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

// sql 문 보내기
public class Test1 {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        //Class.forName(new Driver().getClass().getName());
        
        
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        PreparedStatement pstmt = con.prepareStatement("insert into jdbc_test(title,conts,regdt) values(?,?,now())");
        
        pstmt.setString(1, "제목이래요");
        pstmt.setString(2, "내용이래요...");
        // sql전송
        pstmt.executeUpdate();
        
        System.out.println("실행완료!");
        pstmt.close();
        con.close();
        
        
    
    }   
    
}
