package bitcamp.java100;

import javax.print.attribute.standard.MediaSize.Other;

public class Test15_12_1{
 

    public static void main(String[] args) {
        
       
        int v = 87; //0000_0000_0000_0000_0000_0000_0101_0111
        
        System.out.println(v >> 1); //x000_0000_0000_0000_0000_0000_0010_1011|1 (1을 오른쪽으로 이동시킨다.)
        System.out.println(v >> 2);
        System.out.println(v >> 3);
        System.out.println(v >> 4);
        
        v = -87; //0000_0000_0000_0000_0000_0000_0101_0111
        
        System.out.println(v >> 1); //x000_0000_0000_0000_0000_0000_0010_1011|1
        System.out.println(v >> 2);
        System.out.println(v >> 3);
        System.out.println(v >> 4);
        
        v = 87; //0000_0000_0000_0000_0000_0000_0101_0111
        
        System.out.println(v >>> 1); //x000_0000_0000_0000_0000_0000_0010_1011|1
        System.out.println(v >>> 2);
        System.out.println(v >>> 3);
        System.out.println(v >>> 4);
        
        
        v = -87; //0000_0000_0000_0000_0000_0000_0101_0111
        
        System.out.println(v >>> 1); //x000_0000_0000_0000_0000_0000_0010_1011|1
        System.out.println(v >>> 2);
        System.out.println(v >>> 3);
        System.out.println(v >>> 4);
        
        v = 5; //0000_0000_0000_0000_0000_0000_0000_0101
        
        System.out.println(v << 1); //0000_0000Testme9.java_0000_0000_0000_0000_0000_1010
        System.out.println(v << 2);
        System.out.println(v << 3);
        System.out.println(v << 4);
        
        
        v = -5; 
        
        System.out.println(v << 1); 
        System.out.println(v << 2);
        System.out.println(v << 3);
        System.out.println(v << 4);
        
        for(int i=0; i<40; i++) {
            System.out.printf("%32s, %d\n", Integer.toBinaryString(v << i), v << i);
        }
        
    }
    
    
    

}

    

   