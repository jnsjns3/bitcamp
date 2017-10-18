package bitcamp.java100;

import java.awt.Label;
import java.lang.reflect.Array;

public class Test16_5{
 

    public static void main(String[] args) {
        
    for(int i=0; i < 5; i++) {
        System.out.println(i);
    }
        
    System.out.println("------------------------------------------");
    for(int i=0, j=0; i < 5; i++, j += 2) {
        System.out.printf("%d, %d\n",i, j);
    }
        
    System.out.println("------------------------------------------");
        
    int sum = 0;
    for(int i=1; i <= 10; i++) {
        sum += i;
        System.out.println(sum);
       
    }
    System.out.println("------------------------------------------");
   
    for(int i=0; i <= 10; i++) {
        System.out.print("=>");
        System.out.println(i);
        
        
    }
    for(int i=0; i < 9; i++) {
        if(i==5)
        break;
        System.out.println(i);
    }
    
    for(int i=0; i < 9; i++) {
        if(i==5)
        continue;
        System.out.println(i);
    }
    System.out.println("------------------------------------------");
    int i=0;
    for(; i < 5; i++) {
        System.out.println(i);
    }
    System.out.println("------------------------------------------");
    i=0;
    for(; i<5;) {
        System.out.println(i);
        i++;
    }
    
    System.out.println("------------------------------------------");
    i=0;
    for(;;) {
        System.out.println(i);
        i++;
        if(i == 5) {
            break;
        }
    }
    
    String[] names= {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
    for(int index=0; index < names.length; index++) {
        System.out.println(names[index]);
    }
    
    System.out.println("------------------------------------------");
    
    for(int a=1; a <= 5; a++) {
        for(int b=0; b < a; b++) {
            System.out.print("*");
        }
       System.out.println();
    }
    
System.out.println("------------------------------------------");
    
    Label1:{
    for(int a=1; a <= 5; a++) {
        for(int b=0; b < a; b++) {
            System.out.print("*");
            if(b == 2)
                break Label1;
        }
       System.out.println();
    }
}
    int c;
for(int a=1; a <= 9; a++) {
    for(int b=2; b <= 9; b++) {
        c = a*b;
        System.out.println(a+"x"+b+"="+c);
    }
   
}

System.out.println("------------------------------------------");

int v = 98761234;
for(; v > 0; v /= 10) {
    System.out.printf("%d " ,v%10);
}


    
}
}
    

   