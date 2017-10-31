package bitcamp.java100.ch09.ex2;

//역할 : Box를 이용하여 여러 개의 값을 보관하고 꺼내는 일을 한다.
public class LinkList {

    Box head;
    Box tail;
    
    //전체 상자 개수
    int len;
    
    public void add(Object value) {
        
        Box box = new Box();
        box.value = value;
        
        if(tail == null) {
            head = box;
            tail = box;
          
        }else {
            tail.next = box;
            tail = box;
        }
        len++;
    }
    
    public int size() {
        return len;
    }
    public Object get(int index) {
        if(index < 0 || index >= len) {
            return null;
        }
        Box box = head;
        for(int i=1; i <= index; i++) {
            box = box.next;
        }
        return box.value;
    }
    
    public void insert(int index, Object value) {
        if(index < 0 || index >= len) {
            return; // 값을 안주고 리턴하면 함수를 끝내라는 뜻
        }
        Box box = new Box();
        box.value = value;
        
        this.len++;
        
        if(index == 0) {
            box.next = head;
            head = box;
            return;
        }
        
        
        Box pre = head;
        
        for(int i=1; i < index; i++) {
            pre = pre.next;
        }
        box.next = pre.next;
        pre.next = box; 
       
    }
    
    public Object remove(int index) {
        if(index < 0 || index >= len) {
            return null;
        }
        Box removedBox;
        this.len--;
        if(index == 0) {
            removedBox = head;
            head = head.next;
            return removedBox.value;
        }
        
        Box pre = head;
        
        for(int i=1; i < index; i++) {
            pre = pre.next;
        }
        removedBox = pre.next;
        pre.next = pre.next.next;
        if(index == len - 1) {
            tail = pre;
        }
        
        return removedBox.value;
        
    }
}
