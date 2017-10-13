package bitcamp.java100;

import javax.print.attribute.standard.MediaSize.Other;

public class Test15_12_2{
 

    public static void main(String[] args) {
        
       
        int v = 1234567890;
        
        System.out.println(Integer.toHexString((v >> 24)));
        System.out.println(Integer.toHexString((v >> 16) & 0xff));
        System.out.println(Integer.toHexString((v >> 8) & 0xff));
        System.out.println(Integer.toHexString(v & 0xff));
        
        
        
    }
    
    
    

}

    

   