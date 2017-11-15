package bitcamp.java100.ch14.ex4;

import java.io.Serializable;

//직렬화 클래스 ObjectOutputStream을 사용하기 위해 쓴다.
//직렬화(serialization) 라 부른다.
// 인스턴스 변수의 값을 바이트 배열로 만들어 출력하도록 허락한 클래스이다.
public class Score3before implements Serializable {

    //데이터의 버전을 구분하기 위해 사용한다.
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private int music;
    private float aver;
    
    
    public Score3before() {
        // TODO Auto-generated constructor stub
    }
    public Score3before(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.compute();
    }
    private void compute(){
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum/3f;
    }
    
    
    
    @Override
    public String toString() {
        return "Score3 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", music="
                + music + ", aver=" + aver + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
        this.compute();
    }
    public int getSum() {
        return sum;
    }
    public float getAver() {
        return aver;
    }
    
    
    
}
