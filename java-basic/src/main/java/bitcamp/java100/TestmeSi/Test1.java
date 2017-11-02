package bitcamp.java100.TestmeSi;

import bitcamp.java100.ch09.ex2.LinkList;

public class Test1 {

    
    public static void main(String[] args) {
        
        linkLista list = new linkLista();
        list.add("홍길동");
        list.add("안중근");
        list.add("이순신");
        list.add("장길산");
        
        
        list.delete(2);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
       System.out.println(list.get(2));
      
       
        
    }
    
}
