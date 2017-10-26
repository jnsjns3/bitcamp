package bitcamp.java100.ch7.ex4;

// 다음 클래스는 수퍼 클래스를 지정하지 않았다.
// 그러먼 켬파일러가 Object를 수퍼클래스로 지정한다.
// 즉 extends Object를 자동으로 추가한다

public class Test1 /*extends Object*/ {

    
    public static void main(String[] args) {
       //해당 클래스가 어떤 클래스의 자손인지 검사하기
       // => instanceof 연산자를 사용하라!
        
        Test1 obj = new Test1();
        if(obj instanceof Test1) {
            System.out.println("obj는 Test1의 인스턴스이다.");
        }
        if(obj instanceof Object) {
            System.out.println("obj는 Object의 인스턴스이다.");
        }
        
        Class c = Test1.class;
        Class sc = c.getSuperclass(); //Test1의 수퍼 클래스 정보를 얻는다.
        
        System.out.println(sc.getName()); // Test1의 수퍼클래스 이름
    
    }
    
    
}
