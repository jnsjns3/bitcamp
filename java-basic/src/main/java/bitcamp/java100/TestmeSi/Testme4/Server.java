package bitcamp.java100.TestmeSi.Testme4;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args)throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버가동!");
        Socket socket = ss.accept();
        System.out.println("서버에 연결되었습니다.");
        
        while(true){
        Scanner in = new Scanner(socket.getInputStream());
        String str = in.nextLine();
        System.out.println(str);
       
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(str);
        }
        
      
    }
    
}
