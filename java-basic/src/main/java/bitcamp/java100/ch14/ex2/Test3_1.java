package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 파일 읽기 : FileInputStream 바이너리 파일을 읽을떄 사용한다 (바이트 단위로 읽는다)
public class Test3_1 {

    public static void main(String[] args) throws Exception {
        
       
        
        FileInputStream in = new FileInputStream(new File("sample/jls9.pdf"));
        
        FileOutputStream out = new FileOutputStream(new File("sample/jls9-2.pdf"));
        
        
        int b;
        int count = 0;
        long start = System.currentTimeMillis();
        while((b = in.read()) != -1) {
            out.write(b);
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.printf("걸린시간 = %d\n", end - start);
        
        in.close();
        out.close();
        
        System.out.println("파일 복사 완료했슴!");
    }
    
}
