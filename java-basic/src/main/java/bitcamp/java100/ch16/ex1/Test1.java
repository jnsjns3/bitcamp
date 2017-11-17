package bitcamp.java100.ch16.ex1;

//멀티 태스킹 : CPU가 여러개의 프로그램을 돌아가면서 일정 시간 분량으로 명령어를 처리한다.
public class Test1 {

    public static void main(String[] args) {
        
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
    
       ThreadGroup g1 = t1.getThreadGroup();
       System.out.println(g1);
       ThreadGroup g2 =g1.getParent();
       System.out.println(g2.getName());
    
       ThreadGroup g3 = g2.getParent();
       System.out.println(g3);
       System.out.println("------------------------------------------------");
       ThreadGroup[] groups = new ThreadGroup[10];
       
       int len =g2.enumerate(groups, false);
       for(int i=0; i< len; i++) {
           System.out.println(groups[i].getName());
       }
       
       System.out.println("------------------------------------------------");
       
       len =g1.enumerate(groups, false);
       for(int i=0; i< len; i++) {
           System.out.println(groups[i].getName());
       }
       
       Thread[] threads = new Thread[10];
       len = g2.enumerate(threads, false);
       for(int i=0; i<len; i++) {
           System.out.println(threads[i].getName());
       }
       
       System.out.println("------------------------------------------------");
      
       len = g1.enumerate(threads, false);
       for(int i=0; i<len; i++) {
           System.out.println(threads[i].getName());
       }
       
       /*
        Reference Handler 스레드
        Finalizer 스레드
        Signal Dispatcher 스레드
        Attach Listener 스레드
        */
       
    }
    
}
