package bitcamp.java100.ch19.ex3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    
    //프로퍼티를 선언할때는 메서드처럼 선언한다.
    String name();
    int age();
    
    
    
}



