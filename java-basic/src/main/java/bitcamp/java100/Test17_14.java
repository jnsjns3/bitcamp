package bitcamp.java100;

import java.util.ArrayList;

public class Test17_14{
    
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", a,b);
    
        
        
    }
    static void swap2(int[] r) {
        int temp = r[0];
        r[0] = r[1];
        r[1] = temp;
        System.out.printf("swap2(): p[0] = %d, p[1] = %d\n", r[0], r[1]);
    }
    
   public static void main(String[] args) {
    
       int a = 5;
       int b = 7;
       
       swap(a, b);
       
       int[] arr = new int [2];
       arr[0] = 5;
       arr[1] = 7;
       
       swap2(arr);
       
       System.out.printf("main(): arr[0] = %d, arr[1] = %d\n",arr[0], arr[1]);
       
       
}

   
}

   