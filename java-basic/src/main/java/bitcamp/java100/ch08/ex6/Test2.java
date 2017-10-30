package bitcamp.java100.ch08.ex6;

import java.util.HashSet;

import bitcamp.java100.ch08.ex3.ArrayList;
import bitcamp.java100.ch08.ex4.Score;

//다형성 : hashCode() 오버라이딩 사용 후!

public class Test2 {

    
    public static void main(String[] args) {
        
        Score s1 = new Score(1, "홍길동", 100, 100, 100);
        Score s2 = new Score(1, "홍길동", 100, 100, 100);
      
        HashSet set = new HashSet();
        
   
        
        set.add(s1);
        set.add(s2); // s1 과 s2는 다른 객체로 보기 때문에 s2도 저장된다.
        System.out.println(set.size());
        System.out.println("------------------------------------------");
        System.out.printf("s1.equals(s2) = %b\n",s1.equals(s2));
        System.out.printf("s1.hashCode() = %d\n",s1.hashCode());
        System.out.printf("s2.hashCode() = %d\n",s2.hashCode());
        
        Score2 s3 = new Score2(1, "홍길동", 100, 100, 100);
        Score2 s4 = new Score2(1, "홍길동", 100, 100, 100);
      
        HashSet set2 = new HashSet();
        
     
        
        set2.add(s3);
        set2.add(s4); // s3와 s4가 비록 인스턴스가 다르지만 같은 객체로 취급하기 떄문에 
                      // s4는 저장되지 않는다.
                      //판단기준? equals()의 리턴값이 같을 뿐만 아니라 hashCode()의 리턴 값도 같다.
                      // Score2에서 hashCorde를 재정의 하엿기떄문에 이런 결과값이 나온다.
        System.out.println(set2.size());
        System.out.println("------------------------------------------");
        System.out.printf("s3.equals(s4) = %b\n",s3.equals(s4));
        System.out.printf("s3.hashCode() = %d\n",s3.hashCode());
        System.out.printf("s4.hashCode() = %d\n",s4.hashCode());
        
         
         
    }
}
