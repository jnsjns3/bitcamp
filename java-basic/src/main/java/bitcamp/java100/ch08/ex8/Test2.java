package bitcamp.java100.ch08.ex8;


// 다형성 - 오버로딩
//        - 파라미터의 개수나 나팅ㅂ, 순서가 다르더라도 같은 기능을 수행하는 매서드에 대해
//          같은 이름을 부여함으로써 개발자가 같은 기능에 대해 같은 이르므이 메서드를 사용할수 있또록
//          일관성을 제공하는 문법이다.

public class Test2 {

    static void m1(byte a, byte b) {
        System.out.println("m1(byte byte)");
    }
    static void m1(short a, short b) {
        System.out.println("m1(short short)");
    }
    static void m1(int a, int b) {
        System.out.println("m1(int int)");
    }
    
    
    public static void main(String[] args) {
        
       m1(10, 20);
       m1((byte)10, (byte)20);
       m1((short)10, (short)20);
       
       
    }
    
}
