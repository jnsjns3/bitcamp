package bitcamp.java100.ch06;



// 인스턴스 초기화 블럭
public class Score9 {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float ever;
   
    //생성자가 호출되기 전에 먼저 실행된다.
    //생성자를 만들 수 없는 익명 클래스를 정의할때 사용할 수 있다.
    {
        System.out.println("인스턴스 초기화 블럭 실행!");
    }

    Score9(){
        System.out.println("Score()9 호출");
        
    }
    Score9(String name){
        System.out.println("Score(String)9 호출");
        
    }
    
    
    void compute() {
        
        this.sum = this.kor + this.eng + this.math;
        this.ever = this.sum / 3f;
     
    }
    
    
}
