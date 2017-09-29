package bitcamp.java100;

import java.util.Scanner;

public class Testme4{

   public static class Student{

   String name;
   int money;
   

   Student(String name, int mon){

    this.name = name;
    this.money = mon;
    
    void conju
   }
   
  
   
   
   static void com(){
    int a;
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    Student[] st = new Student[2];
    
       st[0] = new Student("Minsu", 15000);
       st[1] = new Student("Su", 13000);
       
       for(int i=0; i<st.length; i++){
           
       }
       st[0].money = st[0].money-500;
       
       a = st[0].money;
       System.out.println(a);
   }
   
   


}


}
