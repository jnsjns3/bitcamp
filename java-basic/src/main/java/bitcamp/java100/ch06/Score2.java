package bitcamp.java100.ch06;

public class Score2 {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float ever;
   
    void compute() {
        
        this.sum = this.kor + this.eng + this.math;
        this.ever = this.sum/3f;
      
    }
    
    
}
