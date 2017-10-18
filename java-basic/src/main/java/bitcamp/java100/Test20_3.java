package bitcamp.java100;

import java.io.File;

public class Test20_3{
   
    
    static void print1(String value) {
        System.out.println(value);
    }
    static void print2(int value) {
        System.out.println(value);
    }
    static void print3(float value) {
        System.out.println(value);
    }
    
    //Object의 레퍼런스는 자바의 모든 클래스 객체(의 주소)를 저장할 수 있다.
    static void print4(Object value) {
        System.out.println(value);
    }
  public static void main(String[] args) {
    
    print1("문자열");
    print2(300);
    print3(3.14f);
    
    //다양한 타입의 객체를 전달하기
    String v1 = "홍길동";
    StringBuffer v2 = new StringBuffer("임꺽정");
    File v3 = new File(".");
   
    print4(v1);
    print4(v2);
    print4(v3);
    
    print4(100); // 컴파일러가 자동으로 오토박싱을 수행하여 new Integer(100)으로 바뀐다.
    print4(3.14f); // 오토박싱을 수행하여 new Float(3.14f)으로 바뀐다.
    print4(true); // 오토박싱을 수행하여 new Boolean(true)으로 바뀐다.
     
  }
  
  
  }
  
  

        

   


   