package bitcamp.java100.ch08.ex6;

import java.util.HashSet;

import bitcamp.java100.ch08.ex3.ArrayList;
import bitcamp.java100.ch08.ex4.Score;

//다형성 : hashCode() 오버라이딩 사용전!
//         hashCode()의 리턴값은 Hashset 이나 HashMap에서 객체를 저장할 떄 사용한다.
public class Test1 {

    
    public static void main(String[] args) {
        
        Score s1 = new Score(1, "홍길동", 100, 100, 100);
        Score s2 = new Score(1, "홍길동", 100, 100, 100);
        
        ArrayList list = new ArrayList();
        //Arraylist는 객체의 주소들을 보관한다.
        // 같은객체는 중복되어 저장된다.
        
        list.add(s1);
        list.add(s1);
        
        System.out.println(list.size());
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());
        
        System.out.println("-------------------------------------------------------");
        
        HashSet set = new HashSet();
        //HashSet은 ArrayList나 HashMap, Hashtable처럼 객체의 주소를 보관하는 용도로 사용하는 클래스이다.
        // 단 ArrayList와 다른점은 같은 객체를 중복해 저장하지 않는다.
        set.add(s1);
        set.add(s1);
        System.out.println(set.size());
        System.out.println("------------------------------------------");
        
        set.add(s2);
        System.out.println(set.size());
        // 같은 값을 갖고 있다고 해서 같은 객체는 아니다. 
        System.out.println("------------------------------------------");
        System.out.printf("s1.equals(s2) = %b\n",s1.equals(s2));
        System.out.printf("s1.hashCode() = %d\n",s1.hashCode());
        System.out.printf("s1.hashCode() = %d\n",s1.hashCode());
        
         System.out.printf("합계=%d\n", s1.getSum());
         System.out.printf("평균=%f\n", s1.getAver());
        
         
         
    }
}
