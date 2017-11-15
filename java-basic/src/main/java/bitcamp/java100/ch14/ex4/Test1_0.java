package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_0 {

    public static void main(String[] args) throws Exception {
        
        Score s = new Score("홍길동", 800 ,900 ,1000);
        FileOutputStream out2 = new FileOutputStream("test0.dat");
        
       
        ObjectOutputStream out = new ObjectOutputStream(out2);
        
        //직렬화(serialization) 라 부른다.
        // 인스턴스 변수의 값을 바이트 배열로 만들어 출력하도록 허락한 클래스이다.
        out.writeObject(s);
        
        out.close();
        
        System.out.println("출력 완료");
    }
    
}
