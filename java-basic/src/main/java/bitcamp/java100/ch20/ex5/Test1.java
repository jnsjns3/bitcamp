package bitcamp.java100.ch20.ex5;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        
      ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex5/application-context1.xml");
     
      System.out.println(appCtx.getBean("c1"));
     
    }
}
