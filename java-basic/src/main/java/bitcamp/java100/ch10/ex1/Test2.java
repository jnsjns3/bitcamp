package bitcamp.java100.ch10.ex1;

// 중첩 클래스(nested class)(inner class)
// 특정 클래스 안에서만 사용되는 클래스는 오직 그 클래스만 사용하도록제약을 가하는게 유지보수에 좋다.
// 이렇게 패키지가 아닌 클래스에 소속된 클래스를 중첩 클래스라 부른다.
public class Test2 {
    
    static class A{}
    
    class B{} // 인스턴스가 있어야만 사용할수있는 클래스를 중첩클래스라 한다.
    
    // 익명클래스
    //  -클래스의 이름이 없어 클래스를 정의하는 동시에 
    //   인스턴스를 바로 생성하는 클래스를 말한다.
    Object obj = new Object() {
        String name;
        public void m1() {}
    };
    
    public static void main(String[] args) {
        
        
        // 로컬 클래스
        
        class C{}
        
        
    }
}
