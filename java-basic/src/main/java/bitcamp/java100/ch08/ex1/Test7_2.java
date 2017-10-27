package bitcamp.java100.ch08.ex1;


// Gym 회원을 추상화 해보자

class Member2{

    private String name;
    private int age;
    private float weight;
    private float height;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        if(age <=0 || age > 150) {
            return;
        }
        
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setWeight(int weight) {
        if(weight <=0 || weight > 200) {
            return;
        }
            this.weight = weight;
        
    }
    public float getWeight() {
        return this.weight;
    }
    public void setHeight(int height) {
        if(height <=0 || height > 250) {
            return;
        }
            this.height = height;
        
    }
    public float getHeight() {
        return this.height;
    }
    
}


public class Test7_2 {

    
    public static void main(String[] args) {
    
    Member2 m = new Member2();
   m.setName("홍길동");
   m.setAge(300);
   m.setWeight(500);
   m.setHeight(-200);
   

   System.out.printf("%s, %d, %f, %f\n", m.getName(), m.getAge(), m.getWeight(), m.getHeight());
    /*
    m.name = "홍길동";
    m.age = 20;
    
    // 다음 코드는 몸무게와 키를 저장한다.
    // 문법으로는 아무런 문제가 없다 하지만 내용 측면에서는 괴물데이터이다.
    // 이런 경우가 바로 캡슐화를 무너뜨리는 예이다.
    // 이런경우 변수나 메서드의 접근 범위를 조정하면 된다.
    
    m.weight = 900.7f;
    m.height = 16.0f;
    */
        
        
    }
}
