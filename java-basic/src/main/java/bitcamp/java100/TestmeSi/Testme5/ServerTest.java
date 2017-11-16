package bitcamp.java100.TestmeSi.Testme5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

    public static void main(String[] args)throws Exception {
        
        ServerSocket ss = new ServerSocket(9998);
        
        Socket socket = ss.accept();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        
        
    }
    
}
