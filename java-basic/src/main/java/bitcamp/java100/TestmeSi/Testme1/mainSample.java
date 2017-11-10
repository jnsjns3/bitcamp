package bitcamp.java100.TestmeSi.Testme1;

import java.util.HashMap;

public class mainSample {

    
    public static void main(String[] args) {
        
        HashMap<String, Controll> hash = new HashMap<>();
        
        hash.put("1", new MemberSample());
        hash.put("2", new ScoreSample());
     
        
        ControllMain con = hash.get("1");
        con.input();
        con.print();
      
    }
    
    
}
