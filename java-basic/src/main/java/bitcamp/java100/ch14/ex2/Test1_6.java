package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

// 파일 읽기 : 자바에서 제공되는 BufferedInputStream (다른 종류의 인풋스트림을 쓰기위해 주로 이것을 사용한다)
public class Test1_6 {

    public static void main(String[] args) throws Exception {
        
        FileInputStream in = new FileInputStream("sample/jls9.pdf");
        
        BufferedInputStream in2 = new BufferedInputStream(in);
        
        
        int count = 0;
        int b = 0;
        
        
        long start = System.currentTimeMillis();
        while((b = in2.read()) != -1) {
            count++;
        }
        long end = System.currentTimeMillis();
        
        
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린시간 = %d\n", end - start);
        
        in.close();
    }
    
}

/*
 * <입출력을 다루는 클래스의 분류>
 *  Data Sink Stream 클래스
 *  - 데이터를 저장소에 저장하고 읽는 클래스이다.
 *  - 예) FileInputStream/FileoutputStream
 *  -     ByteArrayInputStream/ByteArrayOutputStream 등
 *  
 *  
 *  Data Processing Stream 클래스
 *  -읽은 데이터 또는 출력할 데이터를 가공하여 리턴하는 클래스이다.
 *  -예) BufferedInputStream/BufferedOutputStream
 *       DataInputStream/DataOutputStream
 *       ObjectInputStream/ObjectOutputStream
 *       
 * 캐릭터 스트림 클래스
 * 예) BufferedReader/BufferedWriter
 *     FileReader/FileWriter
 */
