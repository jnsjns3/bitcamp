package java100.app;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

// 요구사항
/*
 Spring IoC
 http://spring.io/
 */

@WebServlet(urlPatterns="/init", name="AppInitServlet", loadOnStartup=1)
@Configuration //이 클래스가 스프링 IoC 컨테이너를 위한 설정 클래스임을 선언
@ComponentScan("java100.app") 
public class AppInitServlet implements Servlet {
    
   ServletConfig  servletConfig;
    
   //이 컨테이너를 다른 
    public static AnnotationConfigApplicationContext iocContainer;
    
 // @bean 스프링 IoC 컨테이너에게 getDataSource() 메서드를 호출해서 이 메서드가 리턴한 객체를 컨테이너에 보관해달라고 표시
    @Bean
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        
        return ds;
        
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("AppInitSErvlet.init()");
        this.servletConfig = config;
        
        iocContainer = new AnnotationConfigApplicationContext(AppInitServlet.class);
        
       
    }

    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("AppInitSErvlet.service()");
        //이 메서드는 클라이언트가 요청할 떄마다 호출되는 메서드이다.
        
    }
    
    @Override
    public void destroy() {
        System.out.println("AppInitSErvlet.destroy()");
        
        // 이 메서드는 웹 애플리케이션을 종료할 떄 서블릿 컨테이너가 호출하는 메서드이다.
        // 자원해제
        DataSource ds = iocContainer.getBean(DataSource.class); //이름을 모를떈 타입으로 찾는다.
        ds.close();
    }
    
    @Override
    public ServletConfig getServletConfig() {
      
        
        // 이 메서드는 init()가 호출되었을 때 넘겨 받은 ServletConfig 객체를 리턴하는 메서드이다.
        return this.servletConfig;
    }

   

    @Override
    public String getServletInfo() {
        // 이 메서드는 서블릿 정보를 출력할 떄 호출된다.
        // 간단히 서블릿 정보를 문자열로 리턴한다.
        return "이 서블릿은 다른 서블릿을 위한 스프링 IoC 컨테이너를 준비한다.";
    }

   
    

}




