package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;
//연습문제 2 : 거꾸로 출력!

// 이름, 이메일, 전화번호를 입력받는다.
// 저장하시겠습니까?(y/n)
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n)
public class Test21_8{
    
    public static void main(String[] args) {
System.out.println("---------------------------------------------------------");
        
        Console console = System.console();
        
        int i = Integer.parseInt(console.readLine("뽑아내고 싶은 숫자 : "));
       
        
        int[] arr = new int[10];
        while(i > 0) {
            arr[i % 10]++;
            i /= 10;
            
        }
        
        int x = 0;
        while(x < arr.length) {
            System.out.printf("%d = %d\n", x, arr[x]);
            x++;
        }
        
        
    }
  
  }
  
  

        

   


   