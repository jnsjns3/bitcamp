package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 파일 읽기 : FileInputStream 바이너리 파일을 읽을떄 사용한다 (바이트 단위로 읽는다)
public class Test2_3 {

    public static void main(String[] args) throws Exception {
        
        //랜덤 메서드를 사용하요 임의이 값을 400만개 준비한다.
        
        byte[] data = new byte[4000000];
        
        for(int i=0; i<data.length; i++) {
            data[i] = (byte)(Math.random()*255);
            
        }
       
        
        FileOutputStream out = new FileOutputStream("./test3.dat");
        
        long start = System.currentTimeMillis();
       
        for(int i=0; i< data.length; i += 8192) {
           
           out.write(data, i, (data.length - i) > 8192 ? 8192 : data.length - i);
        }
        long end = System.currentTimeMillis();
        System.out.printf("걸린시간 = %d\n", end - start);
        out.close();
    
    }
    
}
