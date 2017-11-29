package myTest3;

import java.io.PrintStream;

public interface Controller {
    
  //이 메서드는 추상메서드(abstract)이다. (자동으로 구현됨)    
  void excute(Request request, Response response);

  default void init() {
      
  }
   default void destroy() {
       
   }
    
}
