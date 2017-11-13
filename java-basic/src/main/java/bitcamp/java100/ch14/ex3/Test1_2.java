package bitcamp.java100.ch14.ex3;

import java.io.FileOutputStream;

public class Test1_2 {

    public static void main(String[] args) throws Exception {
        
        Score s = new Score("홍길동", 800 ,900 ,1000);
        FileOutputStream out = new FileOutputStream("test1.dat");
        
        MyDataOutoutStream out2 = new MyDataOutoutStream(out);
        
        out2.writeUTF(s.getName());
        out2.writeInt(s.getKor());
        out2.writeInt(s.getEng());
        out2.writeInt(s.getMath());
        
        
        out.close();
        
        System.out.println("출력 완료");
    }
    
}
