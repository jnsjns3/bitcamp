package bitcamp.java100.ch06;

public class Test3 {

//메서드 문법을 이용하여 클래스에 연산자 추가
public static void main(String[] args) {
        
        Score2 score;
        score = new Score2();
        
       
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        score.sum= score.kor + score.eng + score.math;
        score.ever = score.sum / 3f;
    
        score.compute();
        
    }
    
}
