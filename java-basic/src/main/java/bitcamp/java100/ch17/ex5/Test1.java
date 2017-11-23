package bitcamp.java100.ch17.ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

// 트랜잭션 : 여러 SQL 실행을 한 묶음으로 다루는 방법
public class Test1 {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        
        Class.forName("com.mysql.jdbc.Driver");
        //Class.forName(new Driver().getClass().getName());
        
        
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        PreparedStatement pstmt = con.prepareStatement("insert into jdbc_test(title,conts,regdt) values(?,?,now())");
        
        while(true) {
        System.out.print("제목? ");
        String title = sc.nextLine();
        System.out.print("내용? ");
        String contents = sc.nextLine();
        
        
        pstmt.setString(1, title);
        pstmt.setString(2, contents);
        // sql전송
        pstmt.executeUpdate();
        System.out.println("실행완료!");
        
        System.out.print("계속 입력 하시겠습니까?(y/n) ");
        String str = sc.nextLine();
        if(str.equals("n")) {
            break;
        }
        
        }
        
        
        pstmt.close();
        con.close();
        sc.close();
        
    
    }   
    
}
