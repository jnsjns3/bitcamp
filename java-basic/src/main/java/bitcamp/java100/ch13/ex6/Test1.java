package bitcamp.java100.ch13.ex6;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력> ");
        String str = sc.nextLine().toLowerCase();
        
        
        try {
            System.out.println("try블럭 실행");
            
            
            System.out.println(str);
        } finally {
            // finally 블록은 try 블록을 나가기 전에 반드시 실행한다.
            System.out.println("finally 블록 실행");
        }
        
    }
    
}
