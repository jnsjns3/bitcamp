package bitcamp.java100.ch08.ex8;


// 다형성 - 오버로딩
//        - 파라미터의 개수나 타입, 순서가 다르더라도 같은 기능을 수행하는 매서드에 대해
//          같은 이름을 부여함으로써 개발자가 같은 기능에 대해 같은 이르므이 메서드를 사용할수 있또록
//          일관성을 제공하는 문법이다.

public class Test4 {

   
    
    public static void main(String[] args) {
        
       A obj = new A();
   
       int result = obj.m2();
      // 즉 리턴 타입만 다른 메서드를 오버로딩 할 수 없다!
       
       
    }
    
}
