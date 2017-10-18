package bitcamp.java100;


import java.util.Scanner;

import bitcamp.java100.Testme4.Student;

public class Testme10{

    static class Score{
    
        String name;
        int age;
   
     
   static Score Create(String name, int age) {
       
       Score sc = new Score();
       sc.name = name;
       sc.age = age;
       
       return sc;
       
   }
   
  }
    
    public static void main(String[] args) {
            
        Score[] sc = new Score[2];
        for(int i=0; i < sc.length; i++) {
            sc[i] = new Score();
            
        }
        sc[0].age = 20;
        sc[0].name = "민수";
        
        for(int i=0; i < sc.length; i++) {
            System.out.println(sc[i].age);
        }
        
    }
        
        
        
        
        
        
        
        
       
      
        
      
      
    
    
}