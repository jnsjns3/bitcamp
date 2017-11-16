package bitcamp.java100.ch15.ex6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 The Method  token indicates the method to be performed on the
   resource identified by the Request-URI. The method is case-sensitive.

       Method         = "OPTIONS"                ; Section 9.2
                      | "GET"                    ; Section 9.3
                      | "HEAD"                   ; Section 9.4
                      | "POST"                   ; Section 9.5
                      | "PUT"                    ; Section 9.6
                      | "DELETE"                 ; Section 9.7
                      | "TRACE"                  ; Section 9.8
                      | "CONNECT"                ; Section 9.9
 */

public class HTTPServer {

    public static void main(String[] args)throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버 시작!");
        
        
       
        try {
           
            while(true) {
            
        Socket socket =ss.accept();
        BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        String line;
        while(true) {
            line = in.readLine();
            System.out.println(line);
            if(line.length() == 0) 
                break;
          
        }
        
         PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
         out.println("HTTP/1.1 200 OK");
                
         out.println("Server: Simple http Server");
         out.println("Content-Type: text/html; charset=UTF-8");
         out.println();
         out.println("<html><head><title>하하하</title></head>");
         out.println("<body><h1>안녕하세요!!</h1></body></html>");
         out.flush();
                
         in.close();
         out.close();
         socket.close();
        
      
        
        }
        }catch (Exception e) {
            // TODO: handle exception
        }
        
        }
        
        
    }
    

