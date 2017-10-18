package bitcamp.java100;

import java.awt.Label;
import java.lang.reflect.Array;

public class Test16_4{
 

    public static void main(String[] args) {
        
    int i = 0;
    while(i < 5)
        
        System.out.println(i++);
        
        System.out.println("---------------------------------------------------------");    
        
        i = 0;
        while(i < 5) {
            System.out.println("=>");
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------------------------------------------"); 
        
        i = 5;
        while(i >= 0) {
            int count = (5 - i)/2;
            while (count > 5) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while(count <= i) {
                System.out.print("*");
                count++;
                
                
              
            }
            System.out.println();
            i -= 2;
        }
        
        
        i= 0;
        while(i < 5) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }
        
        i= 0;
        while(i < 5) {
            if(i == 3) {
                i++;
                continue; //바로 조건 검사로 이동한다.
            }
            System.out.println(i);
            i++;
        }
        
        i= 1;
        Label1:{
        while(i <= 10) {
            int count = 1;
            while(count <= i) {
                System.out.print("*");
                if(count == 5) {
                 break Label1; // lable1 블록을 탈출한다.   
                }   
            count++;
            }
            System.out.println();
            i++;
        }
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
        
        i= 1;
        Label1:
        while(i <= 10) {
            int count = 1;
            while(count <= i) {
                System.out.print("*");
                if(count == 5) {
                 break Label1; // lable1 블록을 탈출한다.   
                }   
            count++;
            }
            System.out.println();
            i++;
        }
        
        System.out.println();
        
        System.out.println("---------------------------------------------------------");
        
        i = 987654321;
        
        while(i > 0 ) {
            
            System.out.printf("%d " ,i%10);
            i /= 10;
        }
        
        System.out.println("---------------------------------------------------------");
        
        i = 4885323;
       
        
        int[] arr = new int[10];
        while(i > 0) {
            arr[i % 10]++;
            i /= 10;
            
        }
        
        int x = 0;
        while(x < arr.length) {
            System.out.printf("%d = %d\n", x, arr[x]);
            x++;
        }
        
        
        
        
}
}
    

   