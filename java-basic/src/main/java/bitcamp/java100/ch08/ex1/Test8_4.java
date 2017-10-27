package bitcamp.java100.ch08.ex1;


// 캡슐화의 활용 - 메서드를 private으로?

class Score4{
    
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;
    
    
    public void setName(String name) {
        this.name = name;
        
    }
    public String getName() {
        return name;
    }
    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }
    public int getKor() {
        return kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }
    public int getEng() {
        return eng;
    }
    public void setMath(int math) {
        this.math = math;
        this.compute();
    }
    public int getMath() {
        return math;
    }
    
    
    // 이렇게 get터만 사용하는 경우를 read only property 라고 부른다!
    public int getSum() {
        return this.sum;
    }
    public float getAver() {
        return this.aver;
    }
    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}




public class Test8_4 {

    
    public static void main(String[] args) {
    
    Score4 s = new Score4();
    s.setName("홍길동");
    s.setKor(100);
    s.setEng(90);
    s.setMath(80);;
    
    // s.compute();
    //셋터를 호출하여 값을 저장할떄 내부에서 compute()를 자동으로 호출한다
    //그런데 왜 쓸데없이 호출하는가?
    //이런경우 쓸데없이 호출하지 않도록 메서드() 에 private로 막는것이 좋다.
    // 외부에서 사용할 수 없도록 일부 기능만 노출하는 것이 중요하다.
    // 그것이 캡슐화의 핵심이다.
    
    
    
    
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n" ,
            s.getName(), s.getKor(), s.getEng(), s.getMath(),s.getSum() ,s.getAver());
    
    s.setEng(50);
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n" ,
            s.getName(), s.getKor(), s.getEng(), s.getMath(),s.getSum() ,s.getAver());
    
    }
}
