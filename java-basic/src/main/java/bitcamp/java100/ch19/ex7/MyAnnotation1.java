package bitcamp.java100.ch19.ex7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    
    //프로퍼티를 선언할때는 메서드처럼 선언한다.
    String value();
    String value2() default "aaaa";
    int value3() default 100;
    
    
    
    
    
}



