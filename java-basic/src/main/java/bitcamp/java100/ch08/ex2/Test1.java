package bitcamp.java100.ch08.ex2;

// 다양성(polymorphism) - 다양적 변수
//  - 프로그래밍의 유연성 확보를 위해 사용한다.
public class Test1 {

    public static void main(String[] args) {
        
        // 상위 분류(ex) Vehicle)는 하위 분류를 가리킬 수 있다.
        //  - 하위 분류는 상위 분류의 모든 특징을 갖고있기 때문이다.
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();
        
        
        Boat b1 = new Boat();
        // b1 = new Vehicle();
        // b1 = new Car();
        
        Car c;
        c = new Car();
        c = new Truck();
        c = new Sedan();
        
       Sedan s; 
       s = new Sedan();
       // s = new Boat();
       // s = new Car();
       // s = new Truck();
       
    }
}
