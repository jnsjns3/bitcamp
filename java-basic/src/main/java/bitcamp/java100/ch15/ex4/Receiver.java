package bitcamp.java100.ch15.ex4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//수신 전용 프로그램
public class Receiver {

    public static void main(String[] args) throws Exception {
        
        Socket socket = new Socket("192.168.0.58", 9999);
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println("receiver");
        
        Scanner in = new Scanner(socket.getInputStream());
        
        
        while(true) {
            System.out.println(in.nextLine());
            
        }
        
    }
    
}
