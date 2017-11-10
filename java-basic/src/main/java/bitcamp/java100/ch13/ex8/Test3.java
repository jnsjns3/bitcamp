package bitcamp.java100.ch13.ex8;

public class Test3 {

    
  
    static void m1()  {
        m2();
    }
    static void m2() {
        m3();
    }
    static void m3() {
        m4();
    }
    static void m4() {
     throw new RuntimeException(); //RuntimeException 계열의 예외는 throws를 해줄필요가 없다. ("스텔스 예외" 라고도 함)  
    }
    public static void main(String[] args) {
        
        try {
            m1();
        }catch(Exception e) {
            
        }
        
    }
    
}
