package myTest;

public class testTest {

    
    public static void main(String[] args) {
        
        int su = 151863338;
        int ent;
        int su2 = 1;
        
        int[] arr = new int[10];
        
        
        
        for(int i=0; i <= 9; i++) {
            
            ent = su % 10;
            arr[ent] += su2;
            System.out.println("["+i+"]"+" = "+arr[i]);
            su = su / 10;
            
            
        }
        
        
        
        
        
    }
}
