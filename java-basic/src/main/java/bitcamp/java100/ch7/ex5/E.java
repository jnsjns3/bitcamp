package bitcamp.java100.ch7.ex5;

public class E extends A {

    // 생성자를 만들지 않으면 다음과 같이 기본 생성자가 추가된다.
    String name;
    int age;
    
    
    E(){
        this("홍길동", 20);
    }
    
    E(int age){
        
        this("홍길동", age);
    }
    
    E(String name){
        this(name, 20);
    }
    
    E(String s, int i){
        super();
        this.name = name;
        this.age = age;
    }
    
}
