package bitcamp.java100;

import java.util.Scanner;

public class Test21_1{
    
  public static void main(String[] args) {
    
      
      //이렇게 입력 또는 출력이 끝날떄 까지 리턴하지 않는것을
      //blocking I/O 라 부른다.
      
      Scanner keyScan = new Scanner(System.in);
      //keyScan.nextLine(); // 입력된 내용을 한줄씩 잘라서 리턴한다.
     
      System.out.print("입력하세요: ");
      String line = keyScan.nextLine();
      
     System.out.println(line);
     keyScan.close();
  }
  
  
  }
  
  

        

   


   