package bitcamp.java100.ch7.ex5;

public class A {

    //생성자
    /*
    
    A() {
        
        //모든 생성자는 첫 뻔재 문장으로 수퍼 클래스의 기본 생성자를 호출한다.
        //다음은 Object의 기본 생성자를 호출하는 문장이다.
        super();
    } 
    
    */
    
    A(){
        //수퍼클래스의 기본 생성자를 호출하는 문장을 생략하게 되면,
        // 컴파일러가 자동으로 첫 번째 문장으로 다음을 추가한다.
        // super();
        // 따라서 반드시 수퍼 클래스의 생성자가 호출된다.
        System.out.println("A() 생성자 실행");
   
    }
   
   A(String str){
       super();
       System.out.println("A(string) 생성자 실행");
   }
   
   A(int i){
       System.out.println("A(int) 생성자 실행");
       //super(); 첫번쨰 문장이 아니면 컴파일 오류이다.
   }
   
   
   
   
   
}
