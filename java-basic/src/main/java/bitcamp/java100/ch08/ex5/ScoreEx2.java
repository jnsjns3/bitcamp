package bitcamp.java100.ch08.ex5;

// 이 클래스는 compute()를 오버라이딩 하지 않는다.
//  오버라이딩 하지 않아서 발생하는 문제를 확인하자
public class ScoreEx2 extends Score {

    int sci;
    int soc;
    
    public ScoreEx2() {
      
    }
    ScoreEx2(int no, String name, int kor, int eng, int math, int sci, int soc){
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
    @Override
    //오버라이딩 할 때 완전히 모든 코드를 재작성하는 경우가 있고,
    //현재의 경우처럼 기존의 코드를 사용하는 경우가 있다.
    
    protected void compute() {
        super.compute(); // 의미: 현재클래스가 아니라 슈퍼 클래스부터 compute()를 찾아 올라가라.
                         //       있으면 호출하라!
                         //       없다면 컴파일 오류
        this.sum += this.sci + this.soc;
        this.aver = this.sum / 5f;
        
    }
    
    
    
}
