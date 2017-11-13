package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyBufferedOutputStream extends FileOutputStream {

    byte[] buf = new byte[8192];
    int len;
    int cursor;
    
    public MyBufferedOutputStream(String path) throws FileNotFoundException {
        super(path);
        
    }
    
    @Override
    public void write(int b) throws IOException {
        if(cursor > 0 && cursor >= buf.length) {
            this.write(buf);
            cursor = 0;
            
        }
        buf[cursor++] = (byte)b;
        
    }
    
    @Override
    public void flush() throws IOException {
        // TODO Auto-generated method stub
        this.write(buf, 0, cursor);
    }
    
    
    public static void main(String[] args) {
        int data = 0x000000fa; // = 255
        byte b = (byte)data;
        System.out.println(Integer.toHexString(b));
        
    }
    
}
