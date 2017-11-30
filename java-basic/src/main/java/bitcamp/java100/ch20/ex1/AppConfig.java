package bitcamp.java100.ch20.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//스프링 IoC 컨테이너의 설정관련 클래스
@Configuration
public class AppConfig {

    
    @Bean("str1")
    String getString1() {
        return new String();
    }
    @Bean("str2")
    String getString2() {
        return new String("Helloaaaaa!");
    }
    
}
