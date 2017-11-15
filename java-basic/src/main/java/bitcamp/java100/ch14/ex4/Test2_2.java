package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_2 {

    public static void main(String[] args) throws Exception {
        
        
        FileInputStream in2 = new FileInputStream("test2.dat");
        
       
        ObjectInputStream in = new ObjectInputStream(in2);
        
        Score3before s = (Score3before)in.readObject();
        
        in.close();
        
        System.out.println(s);
        
    }
    
}
