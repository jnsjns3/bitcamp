package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력> ");
        String str = sc.nextLine().toLowerCase();
        
        
        try {
            System.out.println("try블럭 실행");
            switch (str) {
            case "a": throw new Exception();
            case "b": throw new IOException();
            case "c": throw new FileNotFoundException();
            case "d": throw new SQLException();
            

            }
            
            System.out.println(str);
        }catch(SQLException e) {
            System.out.println("SQLException 처리");
        }catch(FileNotFoundException e) {
            System.out.println("FileNotFoundException 처리");
        }catch(IOException e) {
            System.out.println("IOexception 처리");
        }catch (Exception e) {
            System.out.println("Exception 처리");
            
        }
        
    }
    
}
