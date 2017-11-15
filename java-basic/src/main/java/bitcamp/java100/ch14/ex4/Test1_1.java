package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_1 {

    public static void main(String[] args) throws Exception {
        
        Score2 s = new Score2("홍길동", 800 ,900 ,1000);
        FileOutputStream out2 = new FileOutputStream("test1.dat");
        
       
        ObjectOutputStream out = new ObjectOutputStream(out2);
        
        //직렬화(serialization) 라 부른다.
        out.writeObject(s);
        
        out.close();
        
        System.out.println("출력 완료");
    }
    
}
