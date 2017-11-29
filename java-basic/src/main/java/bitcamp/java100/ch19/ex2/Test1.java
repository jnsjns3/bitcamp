package bitcamp.java100.ch19.ex2;

import java.lang.annotation.Annotation;

public class Test1 {

    public static void main(String[] args) {
        
       Annotation[] annos =MyClass.class.getAnnotations();
        
       for(Annotation a : annos) {
           System.out.println(a.annotationType().getName()); // RUNTIME으로만 지정된 애노테이션만 프로그램 실행중에 조회할 수 있다.
       }
    }
    
}
