package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {

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
        } catch (Throwable e) {
            System.out.println("catch 블럭 실행");
            //Throwable try 블록에서 발생하는 모든 예외 객체를 담을 수 있다.
        }
        
    }
    
}
