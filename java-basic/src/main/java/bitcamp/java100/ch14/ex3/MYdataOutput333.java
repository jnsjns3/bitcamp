package bitcamp.java100.ch14.ex3;

import java.io.IOException;
import java.io.OutputStream;

public class MYdataOutput333 {

    OutputStream worker;
    
    public MYdataOutput333(OutputStream worker) {
        this.worker = worker;
    }
    
    public void writeUTF(String str) throws Exception {
       
        byte[] bytes = str.getBytes("UTF-8");
        worker.write(bytes.length >> 8);
        worker.write(bytes.length);
       
        
    }
    public void writeInt(int value) throws Exception {
        
        worker.write(value >> 32);
        worker.write(value >> 16);
        worker.write(value >> 8);
        worker.write(value);
       
        
    }
    
    
    
}
