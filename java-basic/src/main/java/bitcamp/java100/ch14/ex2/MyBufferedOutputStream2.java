package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedOutputStream2 {

    OutputStream worker;
    
    byte[] buf = new byte[8192];
    int len;
    int cursor;
    
    public MyBufferedOutputStream2(OutputStream worker) {
        this.worker = worker;
        
    }
    
    
    public void write(int b) throws IOException {
        if(cursor > 0 && cursor >= buf.length) {
            worker.write(buf);
            cursor = 0;
            
        }
        buf[cursor++] = (byte)b;
        
    }
    
    
    public void flush() throws IOException {
        // TODO Auto-generated method stub
        worker.write(buf, 0, cursor);
        cursor = 0;
    }
    
    
    public static void main(String[] args) {
        int data = 0x000000fa; // = 255
        byte b = (byte)data;
        System.out.println(Integer.toHexString(b));
        
    }
    
}
