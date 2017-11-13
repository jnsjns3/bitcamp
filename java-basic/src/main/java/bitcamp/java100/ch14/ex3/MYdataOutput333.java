package bitcamp.java100.ch14.ex3;

import java.io.IOException;
import java.io.OutputStream;

public class MYdataOutput333 {

    OutputStream worker;
    
    public MYdataOutput333(OutputStream worker) {
        this.worker = worker;
    }
    
    public void writeUTF(String str) throws Exception {
       
        byte[] bytes = str.getBytes();
        worker.write(bytes.length >> 8);
        
        
    }
    
}
