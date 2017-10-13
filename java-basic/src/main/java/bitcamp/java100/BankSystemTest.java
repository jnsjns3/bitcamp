package bitcamp.java100;

import java.util.ArrayList;
import java.util.Scanner;

public class BankSystemTest{
    public static int valuea;
    
    
    static void m1(int value) {
        Scanner sc= new Scanner(System.in); 
        int a = 0;
        a += value;
        valuea += a;
 
        System.out.println(value +"원 입금되었습니다.");
    
    }
    static void m2(int value) {
        Scanner sc= new Scanner(System.in); 
        int a = 0;
        a += value;
        valuea -= a;
        
        if(valuea < 1) {
            valuea += a;
            System.out.println("잔액이 부족합니다!");
            main(null);
        }
        System.out.println(value +"원 출금 되었습니다.");
    
    }
    
    
   public static void main(String[] args) {
      int cho; 
       
      Scanner sc= new Scanner(System.in); 
      
      System.out.println("------------------- 메         뉴  -------------------");
     
      System.out.println("1.입금    2.조회     3.출금");
      cho = sc.nextInt();
      
      switch (cho) {
    case 1: 
        System.out.println("얼마를  입금하시겠습니까?");
        m1(sc.nextInt()); break;
    case 2:    
        System.out.println("입금된 총 금액 : "+valuea); break;
    case 3:
        System.out.println("얼마를 출금하시겠습니까?");
        m2(sc.nextInt());
        
    
    default:
        break;
    }
      main(args);
        
   
   
   }
      
      
       
       
       
       
     
       
}
    
        

   


   