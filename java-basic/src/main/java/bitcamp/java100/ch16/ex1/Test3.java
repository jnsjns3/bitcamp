package bitcamp.java100.ch16.ex1;

public class Test3 {

    static class MYRunnable implements Runnable {
        
        @Override
        public void run() {
           for(int i=0; i < 10000; i++) {
               System.out.println("MyThread => " +i);
           }
        }
        
    }
    
    public static void main(String[] args) {
        
    //<스레드 사용하기>
    // - 객체 생성할 떄 Thread가 실행할 코드가 들어있는
    //   Runnable 구현체를 생성자의 파라미터 값으로 넘겨야 한다.
    Thread t = new Thread(new MYRunnable());
    t.start(); // run() 메서드를 main 스레드와 별개로 실행한다.
        
        
    for(int i=0; i < 10000; i++) {
        System.out.println(i);
    }
    
    }
    
}
