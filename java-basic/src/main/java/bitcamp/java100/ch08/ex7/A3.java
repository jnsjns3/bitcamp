package bitcamp.java100.ch08.ex7;


// 다형성 - 오버라이딩할 떄 접근 제어의 확장 및 축소
public class A3 extends A{

    // 접근범위를 확장하기
    //  -접근 범위를 확장할수는 있어도 줄일수는 없다.
    //  ex) protected -> public = OK!
    //  ex) protected -> private = No!!
   
    /*
    @Override ---------------------------------------- No!
    private void m2() {
        // TODO Auto-generated method stub
        super.m2();
    }
    */
    
    @Override // ------------------------------------- OK!
    public void m3() {
        // TODO Auto-generated method stub
        super.m3();
    }
    
}
