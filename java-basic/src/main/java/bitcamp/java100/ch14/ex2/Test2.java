package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 파일 읽기 : FileInputStream 바이너리 파일을 읽을떄 사용한다 (바이트 단위로 읽는다)
public class Test2 {

    public static void main(String[] args) throws Exception {
        
        File file = new File("./test.dat.jpg");
        FileOutputStream out = new FileOutputStream(file);
        int[] data = {0x66554420,0x66554421,0x66554422,0x66554423,0x66554424,0x66554425,0x66554426,0x66554427,0x66554428,0x66554429};
        
        for(int b : data) {
           System.out.println(Integer.toHexString(b));
           out.write(b);
        }
        
        out.close();
    }
    
}
