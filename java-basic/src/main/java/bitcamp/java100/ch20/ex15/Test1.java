package bitcamp.java100.ch20.ex15;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test1 {

    
    public static void main(String[] args) throws Exception {
        
      ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex15/application-context1.xml");
     Engine en = new Engine();
     
     Engine en1 = (Engine) appCtx.getBean("bitengine");
     en1.setCc(17);
     en1.setName("티코");
     System.out.println(en1);
     Car car =  (Car) appCtx.getBean("tico");
     
      System.out.println(car);
    
      System.out.println("-----------------------------------------------------------------");
      
      String[] names = appCtx.getBeanDefinitionNames();
      for(String name : names) {
          System.out.printf("%s => %s\n",name, appCtx.getBean(name));
      }
      
    }
    
    
}
