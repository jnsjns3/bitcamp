package bitcamp.java100;


public class Test15_4{
 

    public static void main(String[] args) {
        
        float f1 = 3.141592f, f2=5432.123f;
        int i1 = 7654321;
        System.out.printf("f1=%f, f2=%d\n", f1, i1);
    

        double r1 = f1 + i1;
        // float 과 int는 서로 타입이 다르기 때문에 연산 불가!
        //3.141592 + 7654321 = 7654324.141592 이지만 앞의 7자리
        //까지는 유효하고 뒤의 수는 반올림되어 짤린다.
        System.out.println(r1);

        // 명시적 형변환으로 위의 문제를 해결하자
        
        r1 = (double)f1 + (double)i1;
        r1 = (double)f1 + i1;
        r1 = f1 + (double)i1;
        
        System.out.println(r1);
        // 형변환 : Type conversion 이라 부른다.
        // 형변환 : Type casting 이라 부른다.
        
    }
    
    
    

}

    

   