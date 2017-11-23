package bitcamp.java100.TestmeSi.TestmyDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Test1 {

    
    public static void main(String[] args)throws Exception {
        
        stuTest stu = new stuTest();
        
        stu.setName("홍길동");
        stu.setKor(100);
        stu.setEng(100);
        stu.setMath(100);
        
        Class.forName("com.mysql.jdbc.Driver");
        
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jnsjns3db\",\"mytest\",\"1111");
        System.out.println("연결됨");
        Statement stmt =con.createStatement();
        stmt.executeUpdate("create table test3(name varchar(20), kor int, eng int, math int, sum int);");
        
        stmt.close();
        con.close();
        System.out.println("실행완료");
        
    }
    
}
