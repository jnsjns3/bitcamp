package bitcamp.java100.ch08.ex2;

// 다양성(polymorphism) - 다양적 변수
//  - 프로그래밍의 유연성 확보를 위해 사용한다.
public class Test2 {

    public static void main(String[] args) {
        
        
        Car c;
        
        
        c = new Car();
       c.model = "티코";
       c.capacity = 4;
       c.enginType = 1;
       c.cylinder = 4;
       c.valve = 16;
       
        
        c = new Truck();
       c.model = "타이탄";
       c.capacity = 3;
       c.enginType = 2;
       c.cylinder = 8;
       c.valve = 32;
       
       c = new Vehicle(); // 원래 클래스보다 더 상위 클래스로 연결하면 다음과 같이 에러가 난다.
       
        c = new Sedan();
        c.model = "소나타";
        c.capacity = 4;
        
       
       
    }
}
