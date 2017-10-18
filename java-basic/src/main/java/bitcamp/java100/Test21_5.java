package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;
//연습문제 1
public class Test21_5{
    
    static void gugudan(int j) {
        Console console = System.console();
        if(j == 0 || j > 9) {
            System.out.println("1단에서 9단까지만 가능합니다!");
            System.exit(1);
        }
        
        int i=1;
        
        int sul;
        while(i <= 9) {
            sul = j * i;
            System.out.println(j+" X "+i+" = "+sul);
            
            i++;
        }
       System.out.println("--------------------------------------");  
    }
    
    
  public static void main(String[] args) {
      Console console = System.console();
      int j = Integer.parseInt(console.readLine("구구단?"));
     
    gugudan(j);;
     
     main(args);
  }
  
  
  }
  
  

        

   


   