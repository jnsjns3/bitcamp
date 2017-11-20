package kr.co.bitcamp.java100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args)throws Exception {
		
		Socket socket = new Socket("localhost", 9999);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("계산기> ");
			String command = sc.nextLine();
			out.println(command);
			out.flush();
			
			String str = in.readLine();
			System.out.println("결과값: "+str);
			
		}
		
	}
	
}
