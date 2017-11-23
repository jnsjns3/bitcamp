package bitcamp.java100.ch17.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

// sql 문 보내기
public class Test1 {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 게시물 번호? ");
        String no = sc.nextLine();
        
        System.out.print("제목? ");
        String title = sc.nextLine();
        
        System.out.print("내용? ");
        String contents = sc.nextLine();
        sc.close();
        
        Class.forName("com.mysql.jdbc.Driver");
        //Class.forName(new Driver().getClass().getName());
        
        
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        
        System.out.println("연결되었슴!");
        
        //빈 sql문 객체를 생성
        Statement stmt =con.createStatement();
        stmt.executeUpdate("update jdbc_test set title='"+title+"', conts='"+contents+"'where no="+no);
        
       
        System.out.println("실행완료!");
        stmt.close();
        con.close();
        
        
    
    }   
    
}
