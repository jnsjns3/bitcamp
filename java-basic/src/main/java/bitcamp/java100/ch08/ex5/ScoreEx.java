package bitcamp.java100.ch08.ex5;

// compute() 오버라이딩!
// 오버라이딩을 이용해 compute()를 재정의한다
public class ScoreEx extends Score {

    int sci;
    int soc;
    
    public ScoreEx() {
      
    }
    ScoreEx(int no, String name, int kor, int eng, int math, int sci, int soc){
        super(no, name, kor, eng, math); //수퍼클래스 Score 생성자 호출하기
        
        this.sci = sci;
        this.soc = soc;
        
        this.compute();
        
        
    }
    
    public int getSci() {
        return sci;
    }
    public void setSci(int sci) {
        this.sci = sci;
        this.compute();
    }
    public int getSoc() {
        return soc;
    }
    public void setSoc(int soc) {
        this.soc = soc;
        this.compute();
    }
    
   
    
    
}
