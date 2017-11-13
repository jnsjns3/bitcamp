package bitcamp.java100.ch14.ex3;

import java.io.InputStream;

public class MyDataInputStream {

    InputStream worker;
    
    public MyDataInputStream(InputStream worker) {
        this.worker = worker;
        
    }
    
    
    public String readUTF() throws Exception {
        int len = worker.read() << 8 | worker.read();
        
        byte[] bytes = new byte[len];
        
        worker.read(bytes);
        
        return new String(bytes, "UTF-8");
        
    }
    
    public int readInt() throws Exception {
        
        return (worker.read() << 24 | (worker.read() << 16) | (worker.read()) << 8) | worker.read();
        
    }
    
}
