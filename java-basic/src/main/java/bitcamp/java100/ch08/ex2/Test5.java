package bitcamp.java100.ch08.ex2;

import java.io.File;

// 다양적 변수의 형변환
public class Test5 {

    public static void main(String[] args) {
        
       Vehicle[] cars = new Vehicle[10];
       
       cars[0] = new Car();
       cars[1] = new Boat();
       cars[2] = new Truck();
       cars[3] = new Sedan();
       
       Object[] objs = new Object[10];
       objs[0] = new Car();
       objs[1] = new String("hello");
       objs[0] = new Integer(10);
       objs[0] = new File("");
       objs[0] = new StringBuffer();
       
       
       
        
     
       
    }
}
