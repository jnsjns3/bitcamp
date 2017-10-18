package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;
//연습문제 2 : 거꾸로 출력!

// 이름, 이메일, 전화번호를 입력받는다.
// 저장하시겠습니까?(y/n)
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n)
public class Test21_6{
    
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        Console console = System.console();
        
        int v = Integer.parseInt(console.readLine("거꾸로 할 숫자를 입력하시오 : "));
        for(; v > 0; v /= 10) {
            System.out.printf("%d " ,v%10);
        } 
        
        
    }
  
  }
  
  

        

   


   