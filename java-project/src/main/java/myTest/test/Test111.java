package myTest.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java100.app.util.DataSource;




public class Test111 {

    @Bean
    String getDataSource() {
    
    
    return "hello";
}
   public static void main(String[] args) {
    
       
      AnnotationConfigApplicationContext iocContainer = new AnnotationConfigApplicationContext(Test111.class);
       
       

}
}
