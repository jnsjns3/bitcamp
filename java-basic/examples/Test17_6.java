package bitcamp.java100;



public class Test17_6{
    //values 배열을 이용해서 여러개의 값을 리턴하기!
    
    
    static int[] m1() {
        
        int[] values = {100, 90, 80};
        int[] values2 = new int[] {100, 90, 80};
        
        
        return new int[] {100,90,80}; 
        
        
    }
    
    
    
    public static void main(String[] args) {
    
    int[] arr = m1();
    System.out.println(arr[0]);
    
    for(int i : arr) {
        System.out.println(i);
            
    }
    
    
        
}
   
}

   