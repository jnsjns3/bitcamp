package bitcamp.java100.ch13.ex2;

import java.io.FileNotFoundException;
import java.io.FileReader;

//예외의 종류:
// java.lang.Error(시스템에러) : 이런 예외가 발생하면 개발자는 즉시 현재 작업중인 내용을 저장하고 JYM을 멈춰야 한다.
// java.lang.Exception(어플리케이션 에러) : 개발자가 처리해야 될 예외이다.
// RuntimeException : try...catch...를 사용하지 않아도 된다.
public class Test4 {

    
    public static void main(String[] args) throws FileNotFoundException  {
        
        //여기에서 발생하는 예외는 당장 처리하지 않고, 호출자에게 그 처리를 떠넘기겠다는 의미이다.
        FileReader in = new FileReader("./build.gradle");
        
        System.out.println("파일 읽기 준비 완료!");
        
        
        
        
    }
    
}
