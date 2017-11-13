package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyBufferedInputStream2 {

    InputStream worker;
    
    byte[] buf = new byte[8192];
    int len; // 버퍼에 저장한 byte 개수
    int cursor; // 버퍼에서 읽을 byte 위치
    
    public MyBufferedInputStream2(InputStream worker) throws FileNotFoundException {
        this.worker = worker;
        
    }

    
    public int read() throws IOException {
        
        if(cursor >= len) { 
            cursor = 0; // 다 읽엇으면 커서는 0으로 초기화
            len = worker.read(buf);
            
            if(len == -1)
                return -1;
        } 
        return buf[cursor++] & 0x000000FF;
      
    }
    
    
    
}
