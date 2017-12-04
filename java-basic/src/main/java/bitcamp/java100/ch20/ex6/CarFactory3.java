package bitcamp.java100.ch20.ex6;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import bitcamp.java100.ch08.ex7.C;

public class CarFactory3 implements FactoryBean<Car> {

    private Tire[] tires;
    private String model;
    
    
    public void setModel(String model) {
        this.model = model;
    }


    public void setTires(Tire[] tires) {
        this.tires = tires;
    }
    
    @Override
    public Class<?> getObjectType() {
       
        return Car.class;
    }
    
    @Override
    public boolean isSingleton() {
      
        return true; //한번 Car 객체를 만들면 그객체를 리턴한다.
    }
    
    @Override
    public Car getObject() throws Exception {
 
     
        Car car = null;
        
        switch (this.model) {
        case "티코": 
            car = createTico();
                      break;
                      
        case "티코 골드": 
            car = createTicoGold();
            break;
        
        case "소나타": 
            car =createSonata();
            break;
        
        case "에쿠스":
            car = createEquus();
            break;

        default: 
            car = createBasic();
        }
        
        return car;
        
    }

    private Car createSonata() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(1980);
        engine.setName("비트표준엔진");
        engine.setValve(16);
        c.setEngine(engine);
        return c;
    }

    private  Car createTicoGold() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("비트엔진");
        engine.setValve(16);
        c.setEngine(engine);
        
        Map<String, String> options = new HashMap<>();
        options.put("sunroof", "yes");
        options.put("airbag", "yes");
        options.put("blackbox", "yes");
        c.setOptions(options);
        
        return c;
    }

    private Car createBasic() {
        
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(1500);
        engine.setName("비트엔진");
        engine.setValve(16);
        c.setEngine(engine);
        return c;
    }

    private Car createEquus() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(3500);
        engine.setName("비트스페셜엔진");
        engine.setValve(32);
        c.setEngine(engine);
        return c;
    }

    private static Car createTico() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("비트엔진");
        engine.setValve(16);
        c.setEngine(engine);
        return c;
    }


   

  

    
    
    
    
}
