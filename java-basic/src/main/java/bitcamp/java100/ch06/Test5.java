package bitcamp.java100.ch06;

public class Test5 {

//생성자 호출하기
// new () <-생성자
public static void main(String[] args) {
        
        Score4 score;
        score = new Score4("홍꺽정", 100, 100, 100);
        
       
        score.compute();
        System.out.printf("이름 %s\n",score.name);
        System.out.printf("총점 %d\n",score.sum);
        System.out.printf("평균 %f\n",score.ever);
        
        
    }
    
}
