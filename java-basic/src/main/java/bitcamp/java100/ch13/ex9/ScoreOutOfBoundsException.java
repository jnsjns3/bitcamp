package bitcamp.java100.ch13.ex9;

//점수의 유효 범위를 벗어났을 때 던지는 예외 클래스
public class ScoreOutOfBoundsException extends Exception {

    public ScoreOutOfBoundsException() {
        super(); //수퍼 클래스의 기본생성자를 호출한다.
       
    }
    
    
    public ScoreOutOfBoundsException(String message) {
        super(message); // 그냥 수퍼 클래스의 메시지를 받는 생성자를 호출한다.
       
    }
    
}
