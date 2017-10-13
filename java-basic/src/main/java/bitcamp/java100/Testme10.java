package bitcamp.java100;


import java.util.Scanner;

import bitcamp.java100.Testme4.Student;

public class Testme10{
    
   
    public static void main(String[] args) {
       
        
        
        Scanner sc = new Scanner(System.in);
        int sa;
        int b;
        int cho;
       
        
        System.out.println("----------메뉴------------");
        System.out.println("1.입금   2.조회");
        cho = sc.nextInt();
        switch (cho) {
        case 1: System.out.println("얼마 입금할래요?"); 
        
        int ss = sc.nextInt();
        Testme9_1 te = new Testme9_1(ss);
        
        
        case 2: 
       System.out.println(te.su);
            
        default:
            break;
        }
        
       main(args); 
        
        
        
        
        
        
        
        
        
        
        
       
      
        
      
      
    }
    
    
}