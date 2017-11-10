package bitcamp.java100.ch12.ex5;

public interface Test4 extends A, E {

    //이 인터페이스는 컴파일 오류이다.
    //A의 m1()을 상속받게 되면 리턴 타입이 void가 되고,
    //A의 m1()을 상속받게 되면 리턴 타입이 String가 된다.
    //
    
}
