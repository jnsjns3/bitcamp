package bitcamp.java100;



public class Test17_4{

    //void : 값을 리턴하지 않음을 표시한다.
    //String name을 파라미터 라고 한다.
    static void m1(int... Values) {
        System.out.printf("아규먼트 개수: %d\n", Values.length);
        for(int v : Values) {
            System.out.println(v);
        }
    System.out.println("-------------------------------");
    }
    
    //static void m2(int...values, int...is values) {
        
    static void m3(String name, int age, int... values) {}
    
    static void sum(int... values) {
        int s=0;
        for(int v : values) {
            s += v;
        }
        System.out.printf("합계 %d\n",s);
    }
    
    
    
    
   public static void main(String[] args) {

       m1();
       m1(10);
       m1(10, 20);
       
       m1(10, 20, 30);
       
       sum();
       sum(1,2,3,4,5);
 
       
       
}
   
}

   