package step3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// 리스너 : 서블릿 컨테이너에 특정 사건이 발생했을 떄 보고받는 역할을 한다.
@WebListener // <-- 따로 URL을 지정하지 않는다
public class Listener01 implements ServletContextListener{

    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 이 메서드는 이 리스너가 소속된 웹 애플리케이션이 시작될 떄 호출된다.
        System.out.println("Listener01.contextInitialzed()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 이 메서드는 이 리스너가 소속된 웹 애플리케이션이 종료될 떄 호출된다.
        System.out.println("Listener01.contextDestroyed()");
        
    }

    
    
}
