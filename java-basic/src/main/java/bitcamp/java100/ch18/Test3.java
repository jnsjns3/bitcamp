package bitcamp.java100.ch18;

import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Test3 {

    public static void main(String[] args) throws Exception {
        
        
        Class<?> clazz = Z.class;
        
        Constructor<?>[] constructor =clazz.getConstructors();
        for(Constructor con : constructor) {
            System.out.println(con.getName());
            Parameter[] params = con.getParameters();
            for(Parameter param : params) {
                System.out.printf("    %s:%s\n",param.getName(), param.getType().getName());
            }
        }
        
        

        System.out.println("----------------------------------------------------------");
        constructor =clazz.getDeclaredConstructors();
        for(Constructor con : constructor) {
            System.out.println(con.getName());
            Parameter[] params = con.getParameters();
            for(Parameter param : params) {
                System.out.printf("    %s:%s\n",param.getName(), param.getType().getName());
            }
        }
     
        
        
        
    }
    
}
