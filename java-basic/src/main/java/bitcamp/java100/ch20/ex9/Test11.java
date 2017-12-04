package bitcamp.java100.ch20.ex9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java100.ch20.ex9.Car;


public class Test11 {

    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        
      ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex9/application-context1.xml");
     
      
      Car car =  (Car) appCtx.getBean("c1");
    
      System.out.println(car);
    
    }
    
    
}
