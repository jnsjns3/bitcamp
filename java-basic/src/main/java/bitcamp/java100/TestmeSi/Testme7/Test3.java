package bitcamp.java100.TestmeSi.Testme7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test3 {

    
    @Bean
    String hihi() {
       
        System.out.println("aaaaaaaaaaaaaaaa"); 
        return "haha";
    }
    
    
    @Bean("okok")
    String str() {
        
        return "hello";
    }
    
    public static void main(String[] args) {

        AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(Test3.class);
        
       
        appCtx.getBean("okok");
        
    }
    
    
    
}
