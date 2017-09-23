import java.util.Scanner;

class gugudan {

public static void main(String[] args) {
    

    Scanner scan = new Scanner(System.in);

    int a;
    int b;

    int c;

    System.out.println("구구단을 하고싶은 숫자를 입력하시오!"); 
    a = scan.nextInt();
    b = 1;

    c = a;
    
    while(a<100){

        a+=c;
        b++;
        System.out.println(c+" X "+b+"="+a);

    }

    


}



}