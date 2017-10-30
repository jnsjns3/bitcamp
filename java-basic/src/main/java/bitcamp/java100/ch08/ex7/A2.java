package bitcamp.java100.ch08.ex7;

public class A2 extends A {

    
    
    public void test1() {
        m4(); // 상속 받은 public 사용 가능!
        m3(); // 서브 클래스에서 상속 받은 protected 멤버 사용 가능!
        m2(); // 같은패키지에서 상속 받은 (default) 멤버 사용 가능!
        // m1(); 컴파일 오류
        
    }
    
    private void m1() {
     // A 클래스의 m1()을 오버라이딩 하는 것이 아니다.
        // 그냥 B 클래스에 새로 추가한 메서드이다.
        // private 멤버는 오직 그 클래스 안에서만 사용할 수 있다.
        
        System.out.println("B.m1()");

    }
    
    @Override
    void m2() {
        super.m2();
    }
    
    @Override
    protected void m3() {
      
        super.m3();
    }
    
    @Override
    public void m4() {
      
        super.m4();
    }
    
}
