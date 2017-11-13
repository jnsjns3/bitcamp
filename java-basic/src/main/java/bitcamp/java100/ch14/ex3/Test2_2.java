package bitcamp.java100.ch14.ex3;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test2_2 {

    public static void main(String[] args) throws Exception {
        
        Score s = new Score("홍길동", 800 ,900 ,1000);
        FileInputStream in = new FileInputStream("test1.dat");
        MyDataInputStream in2 = new MyDataInputStream(in);
        //DataInputStream in3 = new DataInputStream(in);
       
        
        
       s.setName(in2.readUTF());
       s.setKor(in2.readInt());
       s.setEng(in2.readInt());
       s.setMath(in2.readInt());
        
        
        in.close();
        
        System.out.println(s);
        
        
    }
    
}
