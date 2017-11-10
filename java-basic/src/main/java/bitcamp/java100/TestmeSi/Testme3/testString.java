package bitcamp.java100.TestmeSi.Testme3;

import java.io.File;
import java.io.IOException;

public class testString {

    public static void main(String[] args) throws IOException {
        
        
        // i = path.indexOf("bin")+4;
        //System.out.println(path.substring(i)
        
        File file = new File(".");
        System.out.println(file.getCanonicalPath());
        
        String str = file.getCanonicalPath();
        
       int i =str.indexOf("bit-user");
        System.out.println("---------------------------------");
        System.out.println(str.substring(i).replace("\\", ".").replace(".java-basic", ""));
        
    }
    
    
}
