package bitcamp.java100.ch13.ex3;

import java.io.FileReader;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) {
        // try-with-resource 방식
        //이방식을 사용하면 in.close()를 자동 구현한다. (새로 나온 문법)
        try(
                FileReader in = new FileReader("./build.gradle");
           ) {
            
            System.out.println("파일 읽기 준비 완료");
            
            int ch;
            while(true) {
                ch = in.read();
                if(ch == -1) break;
                System.out.print((char)ch);
            }
            System.out.println("---------------------------------------");
        }catch (Exception e) {
            System.out.println("파일 읽기 중 오류");
            
        }
        
        
    }
}
