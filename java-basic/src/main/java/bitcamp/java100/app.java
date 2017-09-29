package bitcamp.java100;



public class app{
    
    
    public static void main(String[] args) {
     
        String[] arr = {"이순신","임꺽정","유관순"};
        int[] kor = {100,100,20};
        int[] eng = {80,80,90};
        int[] math = {100,70,90};

        int sum;
        float ave;

        for(int i=0; i<arr.length; i++){
        
        sum = kor[i]+eng[i]+math[i];
        ave = sum/3;
        System.out.printf("%-4s, 4%d, 4%d, %4d, %4d, %4.1f\n",
        arr[i], kor[i], eng[i], math[i], sum, ave);
        }

    }
}