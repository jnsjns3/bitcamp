package java100.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.AppConfig;
import java100.app.annotaion.RequestMappingHandlerMapping;
import java100.app.util.DataSource;

//@WebListener <== 스프링 설정 클래스정보를 DD File에서 받기 위해  애노테이션을 제거한다 대신 DD File에 선언한다.
public class ContextLoaderListener implements ServletContextListener {
    
    public static AnnotationConfigApplicationContext iocContainer; 
    public static RequestMappingHandlerMapping handlermapping;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
       
        ServletContext webApplicationInfo = sce.getServletContext();
        
        String configClassName = webApplicationInfo.getInitParameter("contextConfigLocation");
                
        try {
           Class<?> configClass =Class.forName(configClassName);
            
            
            iocContainer = new AnnotationConfigApplicationContext(configClass);
            
            // 스프링 IoC 컨테이너에 들어있는 페이지 컨트롤러를 찾는다.
           handlermapping = new RequestMappingHandlerMapping(iocContainer);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        DataSource ds = iocContainer.getBean(DataSource.class); //이름을 모를떈 타입으로 찾는다.
        ds.close();
    }

    
    
    
}
