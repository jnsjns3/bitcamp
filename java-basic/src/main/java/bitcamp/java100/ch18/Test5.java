package bitcamp.java100.ch18;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Test5 {

    public static void main(String[] args) throws Exception {
        
        
        
        Class<?> clazz = Z.class;
        
       Method m = clazz.getDeclaredMethod("m3", int.class, float.class);
       System.out.printf("메서드명 : %s\n",m.getName());
       System.out.printf("리턴타입 : %s\n",m.getReturnType().getName());
       
       int modifiers =m.getModifiers();
       if(Modifier.isPublic(modifiers)) {
           System.out.println("public 이다.");
       }else if(Modifier.isProtected(modifiers)) {
           System.out.println("protected 이다.");
       }else if(Modifier.isPrivate(modifiers)) {
           System.out.println("Private 이다.");
       }else if(Modifier.isProtected(modifiers)) {
           System.out.println("protected 이다.");
       }
       
      System.out.println( Modifier.toString(modifiers));
       
    }
    
}
