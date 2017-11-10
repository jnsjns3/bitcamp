package bitcamp.java100.ch13.ex3;

import java.io.FileReader;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) {
        
        FileReader in = null;
        try {
            
            in = new FileReader("./build.gradle");
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
            
        }finally {
            System.out.println("finally 실행!");
            // try 블록이 정상적으로 실행되든 안되든
            //finally 블록은 반드시 실행된다.
            //그래서 이 블록은 주로 사용한 자원을 해제시키는 코드를 둔다.
            try {
                in.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
               
            }
            
        }
    }
}
