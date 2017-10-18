package bitcamp.java100;

import java.io.Console;

import bitcamp.java100.Testme4.Student;

public class Test21_4{
    
  public static void main(String[] args) {
    
      class Student{
          String name;
          int age;
          boolean working;
          float gpa;
      }
      
      Console console = System.console();
      if(console == null) {
          System.out.println("콘솔을 지원하지 않습니다.");
          System.exit(1);
      }    
      Student s = new Student();
      s.name = console.readLine("예:(홍길동)");
      s.age = Integer.parseInt(console.readLine("예:(나이)")); 
      s.working = Boolean.parseBoolean(console.readLine("예:true or flase"));
      s.gpa = Float.parseFloat(console.readLine("예: 3.5"));
      
      
      System.out.println("--------------------------------------------------");
      
      System.out.printf("이름 : %s\n", s.name);
      System.out.printf("나이 : %d\n", s.age);
      System.out.printf("재직여부 : %b\n", s.working);
      System.out.printf("졸업학점 : %.2f\n", s.gpa);
      
      
  }
  
  
  }
  
  

        

   


   