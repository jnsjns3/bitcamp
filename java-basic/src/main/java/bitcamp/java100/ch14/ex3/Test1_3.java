package bitcamp.java100.ch14.ex3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test1_3 {

    public static void main(String[] args) throws Exception {
        
        Score s = new Score("홍길동", 800 ,900 ,1000);
        FileOutputStream out = new FileOutputStream("test3.dat");
        
        //MyDataOutoutStream out2 = new MyDataOutoutStream(out);
        DataOutputStream out3 = new DataOutputStream(out);
        
        
        out3.writeUTF(s.getName());
        out3.writeInt(s.getKor());
        out3.writeInt(s.getEng());
        out3.writeInt(s.getMath());
        
        
        out.close();
        
        System.out.println("출력 완료");
    }
    
}
