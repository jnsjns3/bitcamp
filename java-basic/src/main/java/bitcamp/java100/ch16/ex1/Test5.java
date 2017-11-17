package bitcamp.java100.ch16.ex1;

public class Test5 {

    static class Result{
        int sum;
        
    }
    static Result result = new Result();
    
    static class MyThread extends Thread{
        
        public MyThread(String name) {
            super(name);
        }
        
        @Override
        public void run() {
            //result 객체를 사용하는 경우
            // 한번에 한 스레드만이 접근하도록 제한 한다.
            synchronized (result) {
                for(int i=1; i<=10; i++) {
                    System.out.printf("%s(%d)\n",this.getName(), i);
                    result.sum += i;
                        try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {}
                     
                // 작업이 완료되면 result 객체를 사용하기 위해 기다리고 잇는 스레드에게 이제 사용해도 된다고 알린다.
                 // 이 객체를 기다리는 스레드에게 다시 실행할 것을 알린다.
                
            }
                result.notify();  
            }
            
        }
    }
    public static void main(String[] args)throws Exception {
        
        MyThread t =new MyThread("꽃님이");
        t.start();
       
        // t 객체의 잠금 상태에 따라 다음 블록을 실행한다.
        synchronized (result) {
            result.wait(); // t 객체가 notify() 또는 notifyAll()을 호출하여 알려줄 떄까지 기달려라!
                      // t 스레드가 끝날 떄까지 
            System.out.println("합계= " + result.sum);
            
        }
        
        
        
        }
   
    
}
    