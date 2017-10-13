package bitcamp.java100;

import java.util.ArrayList;

public class Test17_8{
    //values 배열을 이용해서 여러개의 값을 리턴하기!
    
    static class Member {
        String name;
        int age;
        boolean working;
        float score;
        char level;
        
    }
    
    
    static Member m1() {
        
        Member ref = new Member();
        
        ref.name = "홍길동";
        ref.age = 20;
        ref.working = false;
        ref.score = 4.12f;
        ref.level = 'M'; // '' 이 따음표는 유니코드를 리턴하는 명령어임;
        
        return ref;
        
        
    }
    
    
   public static void main(String[] args) {
    
       Member mem = m1();
       
       System.out.println(mem.name);
       System.out.println(mem.age);
       System.out.println(mem.working);
       System.out.println(mem.score);
       System.out.println(mem.level);
       
}
    
    
        

   
}

   