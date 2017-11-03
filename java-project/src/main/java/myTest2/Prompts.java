package myTest2;

import java.util.Scanner;

public class Prompts {

    
   public static String input(String message) {
        
    Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
        
    }

   public static boolean confirm(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String response = sc.nextLine().toLowerCase();
        
        if(response.equals("y") || response.equals("Y") || response.equals("") ) {
            return true;
        }
            return false;
        
    }
   public static boolean confirm2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String response = sc.nextLine().toLowerCase();
        
        if(response.equals("n") || response.equals("no") || response.equals("") ) {
            return false;
        }
            return true;
        
    }
    
}
