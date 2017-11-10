package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test2 {

    
    
    static void m1(int i) throws Exception,SQLException,IOException,FileNotFoundException {
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        
        }
    }
   
    public static void main(String[] args) throws IOException, Exception {
        
      
            try {
                m1(2);
            } catch (FileNotFoundException e) {
                
            } catch (SQLException e) {
                
            } catch (IOException e) {
                
            } catch (Exception e) {
                
                
            }
           
            try {
                m1(1);
            } catch (Exception e) {
                
            }
            
            //matin 호출자에게 예외를 전달하는것은 바람직 하지 않다.
            //프로그램이 진행도중 멈춘다.
            try {
                m1(3);
            } catch (SQLException e) {
               
            }catch(FileNotFoundException e) {
                
            }
            
    }
    
}
