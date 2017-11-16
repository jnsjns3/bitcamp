package bitcamp.java100.TestmeSi.Testme4;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("localhost", 9999);
        
        while(true) {
        PrintStream out = new PrintStream(socket.getOutputStream());
        System.out.println("입력할 문장 : ");
        out.println(sc.nextLine());
        
        
        
        
        Scanner in = new Scanner(socket.getInputStream());
        String str = in.nextLine();
        System.out.println("서버에서 다시 받은 문장: "+str);
        
       
        }
        

        
       
        
        
        
        
        
    }
    
}
