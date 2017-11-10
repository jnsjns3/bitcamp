package java100.app.controll;

import java.util.ArrayList;
import java.util.Scanner;



public abstract class GenericController<T> implements Controller {

    
    static Scanner sc = new Scanner(System.in);
    protected ArrayList<T> list = new ArrayList<>();
   
    //이 클래스에서는 공통 메서드의 규격(prototype)만 정의한다
    //자바에서는 이런 메서드 규격을 메서드 시그너쳐(method signature) 라 부른다
 // 추상 메서드로 선언하여 서브 클래스가 반드시 오버라이딩하도록 강제할수 있다.
    
    //추상메서드를 물려받앗기 떄문에 또 선언할 필요는 없다.
    //public abstract void excute();
    
}
