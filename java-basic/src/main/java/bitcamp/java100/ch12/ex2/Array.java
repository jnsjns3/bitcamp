package bitcamp.java100.ch12.ex2;

import java.util.Iterator;

//인터페이스와 구현체를 만드는 개발자 입장!
public class Array {

    //다음 변수를 인스턴스 변수로 만들 것인지 스태틱 변수로 만들 것인지 결정해야 한다.
    //배열을 한 개만 만들어서 순차적으로 사용할 것 가으면 스태틱으로 만들면된다.
    //배열을 여러개 만들어야 한다면 인스턴스 변수로 지정하라!
    
    private Object[] arr = new Object[10000];
    private int cursor= 0;

    public void add(Object obj) {
        if(cursor == arr.length) {
            return;
        }
        arr[cursor++] = obj;
                
    }
    public int size() {
        return cursor;
    }
    public Object get(int index) {
        if(index < 0 || index >= cursor) {
            return null;
        }
        return arr[index];
    }
    
    public Object remove(int index) {
        if(index < 0 || index >= cursor) {
            return null;
        }
        //삭제할 값을 임시 변수에 저장한다.
        Object removedValue = arr[index];
        for(int i= index; i < cursor - 1; i++) {
            arr[i] = arr[i+1];
        }
        cursor --;
        return removedValue;
    }
    
    public void insert(int index, Object value) {
        if(cursor == arr.length) {
            return;
        }
        if(index < 0 || index >= cursor) {
            return; // 값을 안주고 리턴하면 함수를 끝내라는 뜻
        }
        for(int i = cursor - 1; i >= index; i--) {
            arr[i+1] = arr[i];
            
        }
        arr[index] = value;
        cursor++;
    }
    
    public Iterator iterator() {
        
        return new MyIterator();
        
    }
    
    class MyIterator implements Iterator<Object>{

        int index;
        
        @Override
        public boolean hasNext() {
            
            if(index < cursor) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            
            return arr[index++];
        }
        
    }
    
}
