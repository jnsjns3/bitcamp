package bitcamp.java100;


public class Test15_8{
 

    public static void main(String[] args) {
        
        System.out.printf("true && true ? %b\n", true && true);
        System.out.printf("true && true ? %b\n", true && false);
        System.out.printf("true && true ? %b\n", false && true);
        System.out.printf("true && true ? %b\n", false && false); 
       
        System.out.printf("true && true ? %b\n", true || true);
        System.out.printf("true && true ? %b\n", true || false);
        System.out.printf("true && true ? %b\n", false || true);
        System.out.printf("true && true ? %b\n", false || false);

        System.out.printf("true & true ? %b\n", true | true);
        System.out.printf("true & true ? %b\n", true | false);
        System.out.printf("true & true ? %b\n", false | true);
        System.out.printf("true & true ? %b\n", false | false);

        
        boolean b1 = false;
        boolean result = false && (b1 = true);
        System.out.printf("b1=%b, result=%b\n", b1, result);

        b1 = false;
        result = false && (b1 = true);
        System.out.printf("b1=%b, result=%b\n", b1, result);
        

   
    }
    
    
    

}

    

   