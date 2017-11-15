package bitcamp.java100.TestmeSi.Testme4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class objectTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        
       ArrayList<Score> list = new ArrayList<>();
       ArrayList<Score> list2 = new ArrayList<>();
       
       Score s = new Score();
      
       s.setName("Jang");
       s.setKor(100);
       s.setEng(80);
       s.setMath(80);
       list.add(s);
      
       
       FileOutputStream out = new FileOutputStream("testMe");
       ObjectOutputStream obj = new ObjectOutputStream(out);
       obj.writeObject(s);
       
       
       FileInputStream in = new FileInputStream("testMe");
       ObjectInputStream obj2 = new ObjectInputStream(in);
       
       list2.add((Score) obj2.readObject());
        Score s2 = list2.get(0);
       System.out.println(s2.toString());
        
      
      
    }
    
}
