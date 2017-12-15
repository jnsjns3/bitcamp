package step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//GET과 HEAD 요청

//[HEAD 요청]
// - 콘텐츠의 부가정보만 보낸다
// - 콘텐츠는 보내지 않는다.
// - 용도 : 콘텐츠의 변경 여부를 검사하기 위해 요청한다.
public class Servlet05 {

    public static void main(String[] args) throws Exception {
        try(
                Socket s = new Socket("localhost", 9999);
                PrintStream out = new PrintStream(s.getOutputStream());
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())) ) {
            
       
            out.println("GET /java-web/step8/Servlet01_GET.html HTTP/1.1");
            out.println("Host: localhost");
            out.println();
            
            String str = null;
            while ((str = in.readLine()) != null) {
               
                System.out.println(str);
                
            }
        
        } catch (Exception e) {
           
        }
         System.out.println("-------------------------------------------------------------------------");
         
         
        try(
                Socket s = new Socket("localhost", 9999);
                PrintStream out = new PrintStream(s.getOutputStream());
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())) ) {
            
       
            out.println("HEAD /java-web/step8/Servlet01_GET.html HTTP/1.1");
            out.println("Host: localhost");
            out.println();
            
            String str = null;
            while ((str = in.readLine()) != null) {
               
                System.out.println(str);
                
            }
        
        } catch (Exception e) {
           
        }
        
    }
    
    
}
