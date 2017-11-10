package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.channels.FileLock;
import java.util.ArrayList;

//재귀호출이 아닌 방법으로 디렉토리 내용 호출
public class Test9 {
    
    static ArrayList<File> fileList = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        
        File file = new File(".");
        fileList.add(file);
        
        while(fileList.size() > 0 ) {
            printFiles(fileList.remove(0));
        }
        
        printFiles(file);
        // 디렉토리에 들어 있는 파일이나 디렉토리 이름을 알아낼 때 
        // 특정 조건에 부합하는 이름만 꺼내고 싶을 때가 있다.
        // 그럴 때 list()의 파라미터로 필터 기능을 수행하는 객체를 
        // 전달하라! 이름을 꺼낼 때 그 필터를 사용하여
        // 리턴하는 배열에 포함할지 여부를 결정한다.
        //
        // ver 5: list()에서 사용할 필터 클래스를 익명 클래스로 만든다.
        // => 단 저 위에 멀리 익명 클래스의 코드를 두지 말고,
        //    그 익명 클래스를 사용하는 코드 가까이에 두어라.
        //
        
        
    

}
    static void printFiles(File dir) throws Exception {
       
        
        File[] files = dir.listFiles();
       
       
        for (File f : files) {
            
            if(f.isFile() && f.getName().endsWith(".class")) {
                System.out.println(f.getName());
            }
            if(f.isDirectory()) {
               printFiles(f);
            }
            }
        }
      
    }
    
