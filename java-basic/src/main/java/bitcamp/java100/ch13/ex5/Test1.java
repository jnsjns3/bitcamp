package bitcamp.java100.ch13.ex5;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력> ");
        String str = sc.nextLine().toLowerCase();
        
        
        try {
            System.out.println("try블럭 실행");
            if(str.equals("y")) {
                throw new Exception();
            }
            
            System.out.println(str);
        } catch (Exception e) {
            System.out.println("catch 블럭 실행");
        }
        
    }
    
}
