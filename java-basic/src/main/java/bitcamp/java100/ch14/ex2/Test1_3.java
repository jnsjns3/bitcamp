package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 파일 읽기 : FileInputStream 바이너리 파일을 읽을떄 사용한다 (바이트 단위로 읽는다)
public class Test1_3 {

    public static void main(String[] args) throws Exception {
        
        File file = new File("sample/jls9.pdf");
        FileInputStream in = new FileInputStream(file);
        
        byte[] buf = new byte[8196];
        int len = 0;
        
        int count = 0;
        long start = System.currentTimeMillis();
        while((len = in.read(buf)) != -1) {
            count+=len;
        }
        long end = System.currentTimeMillis();
        
        
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린시간 = %d\n", end - start);
        
        in.close();
    }
    
}
