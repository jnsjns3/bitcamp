package bitcamp.java100;

import java.io.Console;
import java.util.Random;

public class Testme2{
    
    
   public static void main(String[] args){

       Console console = System.console();
       int [] arr = new int[9];
       
       int su = Integer.parseInt(console.readLine("입력할 숫자?")); 
       
       for(int i=su%10; i > 0; i++) {
           System.out.println(arr[i%10]=su);
       }
    

   


}
}