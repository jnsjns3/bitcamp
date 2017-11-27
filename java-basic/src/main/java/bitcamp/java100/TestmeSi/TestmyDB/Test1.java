package bitcamp.java100.TestmeSi.TestmyDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test1 {

    
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
       
        stuTest stu = new stuTest();
        
        stu.setName("ccc");
        stu.setKor(100);
        stu.setEng(100);
        stu.setMath(100);
        String str1 = stu.getName();
        
        
        
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jnsjns3db","mytest","1111");
        System.out.println("연결됨");
        PreparedStatement stmt =con.prepareStatement("insert into test3 (name, kor, eng, math, sum) values (?,?,?,?,?);");
        stmt.setString(1, stu.getName());
        stmt.setInt(2, stu.getKor());
        stmt.setInt(3, stu.getEng());
        stmt.setInt(4, stu.getMath());
        stmt.setInt(5, stu.getSum());
        stmt.executeUpdate();
        
        System.out.println("실행완료");
        stmt.close();
        con.close();
        
        
    }
    
}
