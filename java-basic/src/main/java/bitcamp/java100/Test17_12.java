package bitcamp.java100;

import java.util.ArrayList;
import java.util.Scanner;

public class Test17_12{
    public static int valuea;
    
    
    static void m1(int value) {
        Scanner sc= new Scanner(System.in); 
        value += 50;
        valuea = valuea+100;
     System.out.printf("m1(): %d\n ",value);
 
    
    }
    
   public static void main(String[] args) {
       
       
      Scanner sc= new Scanner(System.in); 
      
        int value = 100;
        m1(value);
       
        System.out.printf("main(): %d\n ", valuea);
        m1(value);
        System.out.printf("main(): %d\n ", valuea);
    }
      
      
       
       
       
       
     
       
}
    
        

   


   