package bitcamp.java100.ch11.ex2;

public class Truck {

    String model;
    int cc;
    float weight;
    
    public void move() {
        
        System.out.println("간다!");
    
    }
    public void stop() {
    
    System.out.println("멈춘다!");

    }

    
    public void dump() {
        weight = 0f;
        System.out.printf("물건을 내렸다! (%.1f톤)\n", this.weight);
    
    }
    
    public void load(float weight) {
        this.weight = weight;
        System.out.printf("물건을 실었다! (%.1f톤)\n", this.weight);
    
    }
    
}
