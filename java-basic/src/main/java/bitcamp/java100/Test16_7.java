package bitcamp.java100;

import java.awt.Label;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class Test16_7{
 

    public static void main(String[] args) {
       
        String[] names = {"홍길동","임꺽정","유관순","안중근","윤봉길",};
            
    for(String n : names) {
        System.out.println(n);
    }
    // 처음부터 끝까지 출력할떄만 사용함
    System.out.println("------------------------------------------");
    
    int[] kor = {100,90,80,90,50,80};
    for(int score : kor) {
        System.out.println(score);
    }
    
System.out.println("------------------------------------------");
    
    
    ArrayList<String> arr = new ArrayList<>();
    arr.add("홍길동");
    arr.add("임꺽정");
    arr.add("유관순");
    arr.add("안중근");
    arr.add("윤봉길");
    
    for(String n : arr) {
        System.out.println(n);
    }
    
    System.out.println("------------------------------------------");
    
    
    HashSet<String> set = new HashSet<>();
    set.add("홍길동");
    set.add("임꺽정");
    set.add("유관순");
    set.add("안중근");
    set.add("윤봉길");
    
    for(String n : set) {
        System.out.println(n);
    }
}
}
    

   