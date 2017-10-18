package bitcamp.java100;

import java.util.ArrayList;

public class Test17_18{
    
    static class My{
        int value;
        
        static void print(My ref) {
           System.out.println(ref.value);
        }
    }
    
    
  public static void main(String[] args) {
    
      My r = new My();
      My r2 = new My();
      My r3 = new My();
      
      r.value = 100;
      r2.value = 200;
      r3.value = 300;
      
      
      System.out.println(r.value);
      System.out.println(r2.value);
      System.out.println(r3.value);
      
      
      My.print(r);
      My.print(r2);
      My.print(r3);
    
      r.print(r);
}
        

   
}

   