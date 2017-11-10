package bitcamp.java100.ch13.ex2;

//예외의 종류:
// 1) try...catch... 사용을 강제하는 예외
//    -> Exception 계열의 예외
//    -> 즉 try...catch로 예외처리를 하지 않으면 컴파일 오류 발생
// 2) try...catch... 사용을 강제하지 않는 예외
//    ->Error와 RuntimException 계열의 예외

public class Test1 {

    
    public static void main(String[] args) {
        
        
        //예) 0으로 나눌 떄 발생하는 ArithmeticException 
        //    예외가 대표적인 try...cathc...를 사용하지 않아도 되는 예외이다.
        
            
        System.out.printf("%d / %d = %d\n",20, 0, 20/0);
        
       
    }
    
}
