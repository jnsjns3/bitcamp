package bitcamp.java100.ch13.ex6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test3 {

    public static class MYClass implements AutoCloseable{

        @Override
        public void close() throws Exception {
            // TODO Auto-generated method stub
          System.out.println("close()호출됨");  
        }
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력> ");
        String str = sc.nextLine().toLowerCase();
        
        try(
                //AutoCloseable 구현체를 여기에 선언하면 개발자가 따로 close()를 호출하지 않아도 된다. 
                //예)FileReader 의 close();
                
           MYClass obj = new MYClass();     
           ) {
            System.out.println("try블럭 실행");
            switch (str) {
            case "a": throw new Exception();
            case "b": throw new IOException();
            case "c": throw new FileNotFoundException();
            case "d": throw new SQLException();
            

            }
            
            System.out.println(str);
        }catch (Exception e) {
            System.out.println("catch 블록 실행");
            
        }
        
    }
    
}
