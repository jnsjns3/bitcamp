package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;
//연습문제 2 : 거꾸로 출력!

// 이름, 이메일, 전화번호를 입력받는다.
// 저장하시겠습니까?(y/n)
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n)
public class Test21_8{
    
    
    static int[] input() {
        int[] arr = new int[10];
        return arr;
    }
    
    static void compute(int[] arr, long i) {
        while(i > 0) {
            arr[(int)(i % 10)]++;
            i /= 10;
            
        }
        
          
    }
    static void print(int[] arr) {
        int x = 0;
        while(x < arr.length) {
            System.out.printf("%d = %d\n", x, arr[x]);
            x++;
        }  
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
System.out.println("---------------------------------------------------------");
        
        Console console = System.console();
        
        long i = Long.parseLong(console.readLine("뽑아내고 싶은 숫자 : "));
       int [] arr = input();
        
        compute(arr, i);
        print(arr);
     
        
       
    }
  
  }
  
  

        

   


   