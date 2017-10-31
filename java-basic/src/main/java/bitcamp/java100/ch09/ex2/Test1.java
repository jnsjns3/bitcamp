package bitcamp.java100.ch09.ex2;

// 컬렉션 - LinkedList
public class Test1 {

    static void pirntList(LinkList list) {
        for(int i=0; i < list.size(); i++ ) {
            System.out.printf("%s ",list.get(i));
        }
        System.out.println();
        System.out.println("----------------------------------------------");
    }
    public static void main(String[] args) {
        
        
        LinkList list = new LinkList();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        list.add("안중근");
        list.add("윤봉길");
        
        pirntList(list);
       
       
    }
    
}
