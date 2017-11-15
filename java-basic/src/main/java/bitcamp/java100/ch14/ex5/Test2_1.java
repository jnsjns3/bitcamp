package bitcamp.java100.ch14.ex5;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Test2_1 {

    public static void main(String[] args) throws Exception {
        
      //cmd창 인코딩 명시 방법 java -cp -Dfile.encoding=UTF-8 클래스명
        FileWriter out = new FileWriter("test3.txt");
       
        String str = "ABC가각";
        out.write(str);
       
        
        out.close();
        
        System.out.println("출력 완료");
        
    }
    
}
