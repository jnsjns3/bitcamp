package bitcamp.java100.ch11.ex4;
//추상 클래스
public class Test1 {

    
    public static void main(String[] args) {
        
        Sedan car1 = new Sedan();
        car1.run();
        car1.stop();
       
        Truck car2 = new Truck();
        car2.run();
        car2.stop();
       
        
    }
    
}
