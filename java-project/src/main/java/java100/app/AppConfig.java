package java100.app;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 요구사항
/*
 Spring IoC
 http://spring.io/
 */


//@Configuration //이 클래스가 스프링 IoC 컨테이너를 위한 설정 클래스임을 선언
//@ComponentScan("java100.app") 
public class AppConfig {
    
  
  
 // @bean 스프링 IoC 컨테이너에게 getDataSource() 메서드를 호출해서 이 메서드가 리턴한 객체를 컨테이너에 보관해달라고 표시
    /*
    @Bean
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        
        return ds;
        
    }
    */
  


   
    

}




