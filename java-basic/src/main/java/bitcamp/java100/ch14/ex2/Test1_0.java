package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

// 파일 읽기 : FileInputStream 바이너리 파일을 읽을떄 사용한다 (바이트 단위로 읽는다)
public class Test1_0 {

    public static void main(String[] args) throws Exception {
        
        File file = new File("sample/a.jpg");
        
        FileInputStream in = new FileInputStream(file);
        
        int b;
        int count = 0;
        while((b = in.read()) != -1) {
            count++;
        }
        System.out.println(count);
        
        in.close();
    }
    
}
