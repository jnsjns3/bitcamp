package myTest.test;

import java.util.HashMap;
import java.util.Scanner;

public class appTest {

    static HashMap<String, mainControllerTest<?>> hash = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        hash.put("1", new ScoreSample());
        hash.put("2", new MemberSample());
       hash.get("1").input();
       hash.get("1").print();
       
       
       System.out.println("--------------------------------------------");
       mainControllerTest<?> con2 = hash.get("2");
       
        con2.input();
        con2.print();
        
    }
    
}
