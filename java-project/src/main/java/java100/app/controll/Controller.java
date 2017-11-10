package java100.app.controll;



//여기서는 규칙만 구현한다.
//인터페이스는 상속의 범위를 확대시켜준다.
//다른 클래스를 상속받고있어도 이 규칙만 지킨다면 그 클래스도 상속받을수 있다.
public interface Controller {
    
    
    
  //이 메서드는 추상메서드(abstract)이다. (자동으로 구현됨)    
  /*public abstract*/ void excute();
  
  
  //새 규칙을 추가한다.
  // 단 기존에 작성된 클래스들은 오류가 발생할 것이다.
  // 그런 경우를 고려하여 새로 추가한 규칙에 대해 기본으로 메서드를 구현 상태로 만든다.
  // 그 문법이 "default" 문법이다.
  default void init() {
      
  }
   default void destroy() {
       
   }
    
}
