package bitcamp.java100.TestmeSi.Testme7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("bitcamp/java100/TestmeSi/Testme7/application-context1.xml");
        
        Test2 es = (Test2) appCtx.getBean("es");
        
        System.out.println(es.toString());
        
    }
    
}
