package bitcamp.java100.ch14.ex3;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test2_3 {

    public static void main(String[] args) throws Exception {
        
        Score s = new Score("홍길동", 800 ,900 ,1000);
        FileInputStream in = new FileInputStream("test3.dat");
        //MyDataInputStream in2 = new MyDataInputStream(in);
        DataInputStream in3 = new DataInputStream(in);
       
        
       
       s.setName(in3.readUTF());
       s.setKor(in3.readInt());
       s.setEng(in3.readInt());
       s.setMath(in3.readInt());
        
        
        in.close();
        
        System.out.println(s);
        
        
    }
    
}
