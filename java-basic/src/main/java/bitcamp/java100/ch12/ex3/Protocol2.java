package bitcamp.java100.ch12.ex3;

public interface Protocol2 {

    
    public static final float PI = 3.14159f;    
    
    static final int AA = 100;
    
    final int BB = 200;
    
    int CC = 300;
    // 생략하면 컴파일러가 자동으로 public static final을 붙인다.
    //private protected 같은건 사용 불가
    //규칙은 무조건 공개되어야만 한다.
    
    
}
