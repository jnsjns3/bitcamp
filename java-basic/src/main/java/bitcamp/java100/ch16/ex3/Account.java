package bitcamp.java100.ch16.ex3;

public class Account {

    long balance;
    
    //한번에 한스레드만 진입할 수 있도록 동기화 표시를 한다.
    synchronized public long depostit(long money) {
        
        long temp = balance;
        temp += money;
        this.balance = temp;
        return this.balance;
        
    }
    
    synchronized public long withdraw(long money) {
        long temp = this.balance;
        delay();
        
        if((temp - money) < 0) {
            return 0;
        }
        delay();
        
        temp -= money;
        delay();
        
        this.balance = temp;
        delay();
        
        return money;
    }
    
    private void delay() {
        double value = 1;
        for(int i=0; i<10; i++) {
            value *= Math.random();
        }
        
    }
    
    
}
