package java100.app.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//이 애노테이션은 자동으로 객체를 생성해야 하는 클래스에 대해 붙인다.
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {

    
    String value() default ""; 
    
    
    
}
