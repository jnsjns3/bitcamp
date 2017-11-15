package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_3 {

    public static void main(String[] args) throws Exception {
        
        
        FileInputStream in2 = new FileInputStream("test3.dat");
        
       
        ObjectInputStream in = new ObjectInputStream(in2);
        
        Score4 s = (Score4)in.readObject();
        
        in.close();
        s.compute();
        System.out.println(s);
        
        //인스턴스를 사용하기 전에 sum 과 aver 필드의 값을 계산해야 한다.
        //이렇게 기존 필드의 값을 가지고 계산하는 필드는
        //데이터를 읽은 다음에 명시적으로 계산하는것이 데이터간의 오류를 줄이는 방법이다.
        
    }
    
}
