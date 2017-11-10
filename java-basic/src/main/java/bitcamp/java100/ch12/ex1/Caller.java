package bitcamp.java100.ch12.ex1;

//인터페이스 사용
public class Caller {

    public static void main(String[] args) {
        
        Protocol obj = new Callee();
        
        obj.m1();
        obj.m2();
       
    }
    
}
