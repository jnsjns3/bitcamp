package bitcamp.java100.ch08.ex8;


// 다형성 - 오버로딩
//        - 파라미터의 개수나 나팅ㅂ, 순서가 다르더라도 같은 기능을 수행하는 매서드에 대해
//          같은 이름을 부여함으로써 개발자가 같은 기능에 대해 같은 이르므이 메서드를 사용할수 있또록
//          일관성을 제공하는 문법이다.

public class Test1 {

    static int divide(int a, int b) {
        return a / b;
    }
    static float divide(float a, float b) {
        return a / b;
    }
    
    
    public static void main(String[] args) {
        
       // 자바의 정수 리터럴의 기본 타입은 int이다.
       System.out.println(divide(7, 2));
       System.out.println(divide(7f, 2f)); // 암시적 형변환을 통해 float타입 divide 호출
       
       System.out.println(divide(7, 2f));
       System.out.println(divide(7f, 2));
       
       
       
    }
    
}
