package bitcamp.java100.ch20.ex15;

import org.springframework.stereotype.Component;

@Component("bitengine") // 스프링 IoC컨테이너 에게 이 클래스를 객체로 만들어 달라고 요청
public class Engine {

    private String name;
    private int valve;
    private int cc;
    
    
 

    @Override
    public String toString() {
        return "Engine [name=" + name + ", valve=" + valve + ", cc=" + cc + "]";
    }

    public Engine() {
        System.out.println("Engine() ");
    }
    
    public String getName() {
        return name;
     
    }
    public void setName(String name) {
        
        this.name = name;
        System.out.println("setName()");
    }
    public int getValve() {
        return valve;
    }
    public void setValve(int valve) {
        this.valve = valve;
        System.out.println("setValve()");
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
        System.out.println("setCc()");
    }
    
    
    
    
}
