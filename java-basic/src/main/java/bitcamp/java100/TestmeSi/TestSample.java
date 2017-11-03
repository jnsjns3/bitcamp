package bitcamp.java100.TestmeSi;

import java.util.HashMap;
import java.util.Set;

public class TestSample {

    public static void main(String[] args) {
        
        
        HashMap<String, Object> hash = new HashMap<>();
        hash.put("a01", "이름 : 홍길동");
        hash.put("a02", "나이 : "+27);
        hash.put("a03", "주소 : 서울시 노원구");
        
        Set<String> keySet = hash.keySet();
        String[] keylist = new String[keySet.size()];
        keySet.toArray(keylist);
       
        for(String key : keylist) {
            System.out.printf("%s=%s\n", key, hash.get(key));
        }
        
        
    }
    
}
