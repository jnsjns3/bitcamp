package bitcamp.java100.ch20.ex7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java100.ch20.ex6.Car;


public class Test1 {

    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        
      ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex7/application-context1.xml");
     
      
      System.out.println("---------------------------------------------------------------------");
      
      Engine obj1 = (Engine) appCtx.getBean("e1");
      Engine obj2 = (Engine) appCtx.getBean("e1");
      Engine obj3 = (Engine) appCtx.getBean("e1");
    
      if(obj1 == obj2)
          System.out.println("obj1 == obj2");
      if(obj1 == obj3)
          System.out.println("obj1 == obj3");
    
    
    }
    
    
}
