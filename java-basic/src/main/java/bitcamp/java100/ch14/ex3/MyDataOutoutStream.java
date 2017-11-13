package bitcamp.java100.ch14.ex3;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class MyDataOutoutStream {

    OutputStream worker;
    
    public MyDataOutoutStream(OutputStream worker) {
       this.worker = worker;
    }
    
    public void writeUTF(String str) throws Exception {
       
        byte[] bytes = str.getBytes("UTF-8");
        
        worker.write(bytes.length >> 8);
        worker.write(bytes.length);
        worker.write(bytes);
        
        
    }
    
    public void writeInt(int value) throws Exception {
        worker.write(value >> 24);
        worker.write(value >> 16);
        worker.write(value >> 8);
        worker.write(value);
        
        
    }
    
    
}
