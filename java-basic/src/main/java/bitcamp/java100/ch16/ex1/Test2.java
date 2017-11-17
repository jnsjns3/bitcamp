package bitcamp.java100.ch16.ex1;

public class Test2 {

    static class MYThread extends Thread {
        
        @Override
        public void run() {
           for(int i=0; i < 10000; i++) {
               System.out.println("MyThread => " +i);
           }
        }
        
    }
    
    public static void main(String[] args) {
        
    MYThread t = new MYThread();
    t.start(); // run() 메서드를 main 스레드와 별개로 실행한다.
        
        
    for(int i=0; i < 10000; i++) {
        System.out.println(i);
    }
    
    }
    
}
