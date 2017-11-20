package bitcamp.java100.ch13.ex1;

import java.io.Console;

public class Test2 {

    public static void main(String[] args) {
        
        Console console = System.console();
        
        while(true) {
        if(console == null) {
            System.out.println("콘솔 입력을 지원하지 않습니다.");
            System.exit(1);
        }
        
        int a = Integer.parseInt(console.readLine("a? ")); 
        String op = console.readLine("연산자? ");
        int b = Integer.parseInt(console.readLine("a? "));
        
        switch (op) {
        case "+":
            System.out.printf("결과 = %d\n", a+b); break;
        case "-":
            System.out.printf("결과 = %d\n", a-b); break;
        case "*":
            System.out.printf("결과 = %d\n", a*b); break;
        case "/":
            System.out.printf("결과 = %d\n", a/b); break;
        case "%":
            System.out.printf("결과 = %d\n", a%b); break;
         
        default:
            System.out.println("지원하지 않는 연산자 입니다.");
            break;
        }
            
            
        }
        
        
        
        
        
        
        
        
    }
    
    
}