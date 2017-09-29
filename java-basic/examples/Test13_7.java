package bitcamp.java100;
public class Test13_7{
    
    
   public static void main(String[] args){

    int a = 100; //값을 저장하는 변수
    int b; 

    b=a; //a의 값을 b에 저장
    b=200; //a와 b는 다른 메모리이기 때문에 b 변수의 값을 바꾸더라도 
           //a변수는 영향을 받지 않는다.

    System.out.printf("a=%d,b=%d\n",a,b);
    
    int[] arr1 = {100,200,300};
    int [] arr2;

    arr2 = arr1;
    arr2[1] = 50;
    System.out.printf("%d,%d,%d\n", arr1[0],arr1[1],arr1[2]);
    
}
}

    

   