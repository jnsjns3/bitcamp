package bitcamp.java100;

import java.util.Date;

public class Test10_4{

   public static void main(String[] args){

   System.out.printf("%s, %d, %o, %x, %h, %f, %b, %tY\n", "홍길동", 
   100, 100, 100, 100, 
   3.14, true, new Date());

   System.out.printf("%1$4s,%1$10s,%2$5.2f,%2$10.3f\n", 
   "홍길동", 3.14);

   System.out.printf("%10s,%-10s\n", 
   "홍길동", "임꺽정");

   System.out.printf("%d,%+d\n", 
   100, 100);

   System.out.printf("%5d,%05d\n", 
   123, 123);

   System.out.printf("%1$tH, %1$tI, %1$tM, %1$tS, %1$tS, %1$tp\n", 
   new Date());

   System.out.printf("%1$tH:%1$tM:%1$tS\n", 
   new Date());
   
   System.out.printf("%1$tA:%1$ta\n", 
   new Date());
   
   

}
}