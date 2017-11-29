package myTest4;

public class Test {

    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = Score.class;    
         
        Score score = (Score) clazz.newInstance();
        score.setName("홍길동");
        score.setKor(100);
        score.setEng(100);
        score.setMath(100);
        
        System.out.println(score.toString());   
        
        
        
        
    }
    
}
