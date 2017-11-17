package bitcamp.java100.ch16.ex1;

// new Thread() --start()--> Runnable 상태 -- sleep()/wait()--> Not Runnable
// Runnable 상태?
// - CPU 사용권을 얻어 실행하는 상태가 아니라,
//   CPU 사용권을 얻을 수 있는 상태이다.
public class Test4 {

   static class MyThread extends Thread{
       
       public MyThread(String name) {
      super(name);
    }
       @Override
    public void run() {
           int count = 0;
           while(true) {
               System.out.printf("\n%s(%d)\n",this.getName(), ++count);
              
               
               if(count == 500) {
                   count = 0;
                   try {
                    Thread.sleep(5000); //5초동안 Not Runnable 상태가 됨
                } catch (InterruptedException e) {
                   
                }
               }
               
           }
    }
       
       
   }
   public static void main(String[] args) {
    
       
       new MyThread("꽃님이").start();
       
       while(true) {
           System.out.println("...");
           
           double v1 = 3.141592;
           double v2 = 0.1234543;
           for(int i=0; i< 1000000; i++) {
               v1 = Math.random() * v1;
               v2 = Math.random() / v2;
               
           }
       }
       
       
       
       
       
       
}
        
 
    
}
