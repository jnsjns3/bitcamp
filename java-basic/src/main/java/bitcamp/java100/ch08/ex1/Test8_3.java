package bitcamp.java100.ch08.ex1;


// 캡슐화의 활용 - 접근 제한하기 전

class Score3{
    
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
    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
}




public class Test8_3 {

    
    public static void main(String[] args) {
    
    Score3 s = new Score3();
    s.setName("홍길동");
    s.setKor(100);
    s.setEng(90);
    s.setMath(80);;
    s.compute();
    
    
    
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n" ,
            s.getName(), s.getKor(), s.getEng(), s.getMath(),s.getSum() ,s.getAver());
    
    s.setEng(50);
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n" ,
            s.getName(), s.getKor(), s.getEng(), s.getMath(),s.getSum() ,s.getAver());
    
    }
}
