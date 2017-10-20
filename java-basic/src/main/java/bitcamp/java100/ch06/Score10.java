package bitcamp.java100.ch06;



// 인스턴스 초기화 블럭
public class Score10 {

    String name = "이름없슴";
    int kor=10;
    int eng=10;
    int math;
    int sum;
    float ever;
   
    //인스턴스 블록
    {
        this.name = "홍길동";
        this.kor = 20;
        
        compute();
    }

    //생성자
    Score10(){
        this.name = "임꺽정";
        compute();
    }
   
    void compute() {
        
        this.sum = this.kor + this.eng + this.math;
        this.ever = this.sum / 3f;
       
    }
    
    
}
