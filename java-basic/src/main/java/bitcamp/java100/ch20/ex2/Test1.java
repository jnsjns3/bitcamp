package bitcamp.java100.ch20.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

    
    public static void main(String[] args) {
        
      ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("bitcamp/java100/ch20/ex2/application-context1.xml");
   
      String[] names =appCtx.getBeanDefinitionNames();
     
      for(String name : names) {
          System.out.println(name);
          System.out.printf("클래스명   -----> %s\n",appCtx.getBean(name).getClass().getName());
      
   
    String[] aliases = appCtx.getAliases(name);
    System.out.printf("-->별명 :  ");
    for(String alias : aliases) {
       System.out.printf(alias+",");
    }
      System.out.println();
      
      }
    }
   
}
