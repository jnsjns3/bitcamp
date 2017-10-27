package bitcamp.java100.ch08.ex1;

import java.io.File;

import bitcamp.java100.ch08.ex2.Car;
import bitcamp.java100.ch08.ex2.Sedan;
import bitcamp.java100.ch08.ex2.Truck;

// 다형성 변수의 활용
// 다양한 타입의 객체 주소를 보관할 배열을 만들어보자!
public class Test5 {

    public static void main(String[] args) {
       
        Object[] arr = new Object[100];
        
     // Object 클래스는 최상위 루트 클래스이다.
     // 즉 자바의 모든 클래스의 조상이다.
        
        arr[0] = new String();
        arr[1] = Integer.valueOf(100);
        arr[2] = new File("./build.gradle");
     
        Car c1 = new Truck();
        Car v2 = new Sedan();
        
        
        
        
    }
}
