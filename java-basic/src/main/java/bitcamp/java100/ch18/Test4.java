package bitcamp.java100.ch18;

import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import bitcamp.java100.ch06.Score;

public class Test4 {

    public static void main(String[] args) throws Exception {
        
        
        Class<?> clazz = Z.class;
        
        Method[] methods =clazz.getMethods();
        for(Method m : methods) {
            System.out.println(m.getName());
            
            Parameter[] params = m.getParameters();
            for(Parameter param : params) {
                System.out.printf("    %s:%s\n",param.getName(), param.getType().getName());
            }
        }
        
        

        System.out.println("----------------------------------------------------------");
        methods =clazz.getDeclaredMethods();
        for(Method m : methods) {
            System.out.println(m.getName());
            Parameter[] params = m.getParameters();
            for(Parameter param : params) {
                System.out.printf("    %s:%s\n",param.getName(), param.getType().getName());
            }
        }
     
        
        
        
    }
    
}
