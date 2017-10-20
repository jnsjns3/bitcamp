package bitcamp.java100.ch06;



// this의 생략
public class Score8 {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float ever;
   
    

    
    Score8(String name){
        
        this.name = name;
        // this가 자동으로 붙는다.
        kor = 50;
        eng = 50;
        math = 50;
        compute();
    }
   
    
    
    
    
    void compute() {
        
        this.sum = this.kor + this.eng + this.math;
        this.ever = this.sum / 3f;
     
    }
    
    
}
