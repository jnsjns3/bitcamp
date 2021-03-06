package bitcamp.java100.ch08.ex3;

public class ArrayList {

    Object[] list = new Object[100];
    int cursor = 0;
    
    
    //파라미터로 모든 타입의 객체 주소를 받을 수 있게 전환한다.
    public void add(Object obj) {
        if(this.cursor == this.list.length) {
            
            System.out.println("저장개수 초과");
            return;
        }
        this.list[this.cursor++] = obj;
    }
    
    public int size() {
        return this.cursor;
    }
    
    
    public Object get(int index) {
        if(index < 0 || index >= this.cursor) {
            return null;
        }
        return this.list[index];
    }
    
}
