package bitcamp.java100.ch13.ex2;

import java.io.FileNotFoundException;
import java.io.FileReader;

//예외의 종류:
// 1) try...catch... 사용을 강제하는 예외
//    -> Exception 계열의 예외
//    -> 즉 try...catch로 예외처리를 하지 않으면 컴파일 오류 발생
// 2) try...catch... 사용을 강제하지 않는 예외
//    ->Error와 RuntimException 계열의 예외

public class Test3 {

    
    public static void main(String[] args) {
        
        //파일 경로가 유효하지 않을 떄, FileNotFoundException이 발생한다.
        
        try {
            
            FileReader in = new FileReader("./build.gradle");
            System.out.println("파일 읽기 준비 완료!");
            
            
        } catch (FileNotFoundException e) {
            
            System.out.println("FileReader 객체 준비중 오류 발생!");
        }
        
        
    }
    
}
