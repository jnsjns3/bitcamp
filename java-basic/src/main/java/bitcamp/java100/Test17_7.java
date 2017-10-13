package bitcamp.java100;

import java.util.ArrayList;

public class Test17_7{
    //values 배열을 이용해서 여러개의 값을 리턴하기!
    
    static java.util.ArrayList m1() {
        
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(20);
        list.add(false);
        list.add(4.12f);
        list.add('M');
        
        return list;
        
        
    }
    
    
   public static void main(String[] args) {
    
       ArrayList list = m1();
       
       for(Object v : m1()) {
           System.out.println(v);
       }
       
}
    
    
        

   
}

   