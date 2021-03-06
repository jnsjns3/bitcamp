package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;

// 파일 읽기 : FileInputStream 바이너리 파일을 읽을떄 사용한다 (바이트 단위로 읽는다)
public class Test2_5 {

    public static void main(String[] args) throws Exception {
        
        //랜덤 메서드를 사용하요 임의이 값을 400만개 준비한다.
        
        int[] data = new int[4000000];
        
        for(int i=0; i<data.length; i++) {
            data[i] = (int) Math.random()*100000;
            
        }
        FileOutputStream out = new FileOutputStream("./test2.dat");
        MyBufferedOutputStream2 out2 = new MyBufferedOutputStream2(out);
        
        long start = System.currentTimeMillis();
        for(int b : data) {
           
           out2.write(b);
        }
        out2.flush();
        
        long end = System.currentTimeMillis();
        System.out.printf("걸린시간 = %d\n", end - start);
        out.close();
    
    }
    
}
