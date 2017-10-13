package bitcamp.java100;

import java.util.ArrayList;
import java.util.Scanner;

import bitcamp.java100.Testme4.Student;

public class Testme9{
    
    String name;
    int su;
    int sa=100;
    public static void Testme9(int sa){
        Scanner sc = new Scanner(System.in);
       
       
        int cho;
        int a = sa+100;
        
        System.out.println(a);
        sa = a;
        
        System.out.println("또 반복하시겠습니까? 1.예, 2.아니오");
        cho = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(sa);
        
        
        
        switch (cho) {
        case 1: Testme9(sa);
        case 2: Testme10.main(null);
        default:
            break;
        }
            
        
        
        
        
    }
    
    
    
    
}