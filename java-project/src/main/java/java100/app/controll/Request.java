package java100.app.controll;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

public class Request {
    //명령어 경로
    private String menuPath;
    private HashMap<String, String> params = new HashMap<>();
    
    public Request(String command) {
        
        String[] path = command.split("\\?");
        
        this.menuPath = path[0];
       
        if(path.length > 1) { //?다음에 문자열이 있다면
            String[] arr = path[1].split("&");
            for(String param : arr) {
                String[] kv = param.split("=");
                
                try {
                    this.params.put(kv[0], URLDecoder.decode(kv[1], "UTF-8"));
                } catch (UnsupportedEncodingException e) { }
            }
        }
        
    }
    
    public String getMenuPaht() {
        return this.menuPath;
        
    }
    
    public String getParameter(String name) {
        return this.params.get(name);
    }
    
}
