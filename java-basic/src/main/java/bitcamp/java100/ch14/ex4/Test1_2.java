package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_2 {

    public static void main(String[] args) throws Exception {
        
        Score3before s = new Score3before("홍길동", 800 ,900 ,1000);
        FileOutputStream out2 = new FileOutputStream("test2.dat");
       
        ObjectOutputStream out = new ObjectOutputStream(out2);
        
        
        out.writeObject(s);
        
        out.close();
        
        System.out.println("출력 완료");
    }
    
}
