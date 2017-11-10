package bitcamp.java100.ch12.ex3;

public class Test3 {

    public static void main(String[] args) {
        
        System.out.println(Protocol3.AA);
 
        
        
        class MyClass implements Protocol3 {

            @Override
            public void m1() {
                System.out.println("m1()");
                
            }

            @Override
            public void m2(int v) {
                System.out.println("m2()");
                
            }

            @Override
            public void m3(String v) {
                System.out.println("m3()");
                
            }
            
            
        }
        
       Protocol3 obj = new MyClass();
       obj.m1();
       obj.m2(300);
       obj.m3("hello");
       
        
    }
    
}
