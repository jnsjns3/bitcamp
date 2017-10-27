package bitcamp.java100.ch08.ex1;

// 캡슐화의 존재 이유
//  - 인스턴스 변수에 무효한 값이 저장되는 것을 방지함으로써
//    추상화가 무너지는 것을 막는다.
//  추상화(abstraction)?
//   - 사물이나 사람, 업무 등을 데이터와 메서드로 표현한 것.
//     즉 클래스를 정의하는 것을 말한다.

// Gym 회원을 추상화 해보자

class Member{

    String name;
    int age;
    float weight;
    float height;
    
    
    
}


public class Test7_1 {

    
    public static void main(String[] args) {
    
    Member m = new Member();
    m.name = "홍길동";
    m.age = 20;
    
    // 다음 코드는 몸무게와 키를 저장한다.
    // 문법으로는 아무런 문제가 없다 하지만 내용 측면에서는 괴물데이터이다.
    // 이런 경우가 바로 캡슐화를 무너뜨리는 예이다.
    // 이런경우 변수나 메서드의 접근 범위를 조정하면 된다.
    
    m.weight = 900.7f;
    m.height = 16.0f;
    
        
        
    }
}
