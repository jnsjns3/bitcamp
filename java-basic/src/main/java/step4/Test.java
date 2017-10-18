package step4;

import java.util.ArrayList;

public class Test{

    static float area(Rect r) {
        return (r.width * r.height)/10000f;
    }

    static float pyeong(Rect r) {
        return (r.width * r.height)/10000f / 3.3f;
    }
    
   public static void main(String[] args) {
    
          
       Rect r;
       r = new Rect();
       r.height = 390;
       r.width = 390;
       
       
       
       System.out.println(area(r));
       
       
       System.out.println(pyeong(r));
       
   }

   
}

   