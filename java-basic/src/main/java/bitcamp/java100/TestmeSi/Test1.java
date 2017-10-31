package bitcamp.java100.TestmeSi;

import bitcamp.java100.ch09.ex2.LinkList;

public class Test1 {

    
    public static void main(String[] args) {
        
        linkLista list = new linkLista();
        list.add("홍길동");
        list.add("안중근");
        list.add("이순신");
        
        
        System.out.println(list.head.value);
        
        System.out.println(list.head.next.value);
        System.out.println(list.tail.value);
        
       System.out.println(list.get(0));
        
    }
    
}
