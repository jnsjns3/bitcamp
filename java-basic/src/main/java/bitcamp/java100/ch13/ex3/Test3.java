package bitcamp.java100.ch13.ex3;

import java.io.FileReader;
import java.io.IOException;

public class Test3 {

    public static void main(String[] args) {
        
        class MyClass{
            
        }
        class MyClass2 implements AutoCloseable{

            @Override
            public void close() throws Exception {
                // TODO Auto-generated method stub
                System.out.println("close() 호출되었슴");
            }
            
        }
        
        //이방식을 사용하면 in.close()를 자동 구현한다. (새로 나온 문법)
        try(
            MyClass2 obj2 = new MyClass2();  
           ) {
            
            System.out.println("try 블럭 실행!");
           //int r = 20 /0; 
        } catch (Exception e) {
            System.out.println("캐치 블럭 실행");
            
        }
        
        
    }
}
