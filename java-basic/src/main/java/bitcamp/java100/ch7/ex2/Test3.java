package bitcamp.java100.ch7.ex2;

public class Test3 {

    
    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB();
        
        calc.result = 1;
        
        calc.multiple(10); // 수퍼 클래스에서 찾음
        calc.multiple(17); // 수퍼 클래스에서 찾음
        calc.divide(0); // 수퍼 클래스에서 찾음
        calc.remainder(5); //현재 클래스B에서 찾음
        
        
        System.out.println(calc.result);
        
    }
}
