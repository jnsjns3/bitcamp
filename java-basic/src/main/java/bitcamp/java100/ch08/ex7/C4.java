package bitcamp.java100.ch08.ex7;

public class C4 extends C3 {

    @Override
    void m1() {
        System.out.println("C4.m1()");
    }
    
    @Override
    void m2() {
        System.out.println("C4.m2()");
    }
    void test1() {
        this.m1();
        this.m2();
        this.m3();
        this.m4();
        System.out.println("-----------------------------------");
        super.m1();
        super.m2();
        super.m3();
        super.m4();
        
        
    }
    
    public static void main(String[] args) {
        
        C4 obj = new C4();
        obj.test1();
        
        
    }
    
}
