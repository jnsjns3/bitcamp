package step5;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//GET 요청
//- URL에 붙여서 보낸다.
//예) 
/*
GET /bitcamp-java-web/step5/Servlet03?name=hong&age=20&working=true HTTP/1.1
Host: localhost:9999
Connection: keep-alive
Pragma: no-cache
Cache-Control: no-cache
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng
Referer: http://localhost:9999/bitcamp-java-web/step5/Servlet03.html
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
*/
//POST 요청
//- 요청 헤더 다음에 message-body 순서에서 보낸다.

//서블릿 컨테이너는 클라이언트가 보낸 데이터가 
// ISO-8859-1이라고 간주하고 이 데이터를 자바 유니코드로 변환한다.
// 변환 방법(MS949로 서버에 보낼 때)
// - 클라이언트가 보낸 데이터 
//   => "ABC가각"
// - 네트웍으로 전송할 때는 바이트로 바꾼다. 
//   => 41 42 43 b0 a1 b0 a2
// - 서버에서는 이 바이트 배열을 유니코드로 바꾼다. 
//   - ISO-8859-1을 유니코드로 바꿀 때는 무조건 앞에 00 1바이트를 붙인다.
//   - 0041 0042 0043 00b0 00a1 00b0 00a2
// 
// 변환방법(한글을 UTF-8로 인코딩 하여 서버에 보낼 때)
// - 클라이언트가 입력한 데이터
//   => "ABC가각"
// - 웹브라우저는 네트웍으로 전송하기 전에 UTF-8 바이트 배열로 변환
//   => [41 42 43 ea b0 80 ea b0 81]
// - 웹브라우저는 이 데이터 중에서 7비트를 넘어가는 바이트에 대해 
//   데이터를 잃어버리지 않고 전송될 수 있도록 
//   URL 인코딩(7비트화시킨다) 하여 보낸다.
//   => "ABC%EA%B0%80%EA%B0%81"
// - 서버는 받은 데이터를 다시 URL 디코딩한다. 
//   => [41 42 43 ea b0 80 ea b0 81]  
// - 서버는 이 바이트 배열을 다시 유니코드로 변환하여 String 객체로 만든다.
//   문제는 이 바이트 배열을 ISO-8859-1이라고 간주한다는 것이다.
//   그래서 각각의 바이트 앞에 00 1바이트를 붙여 유니코드로 만든다.
//   - 0041 0042 0043 00ea 00b0 0080 00ea 00b0 0081
//   - ea bo 80 이 세 바이트는 UTF-8 코드이므로 
//     한 문자로 취급하여 유니코드 문자 '가(ac00)'으로 바꿔야 하는데
//     그냥 각각의 바이트를 하나의 영문자로 간주하고 유니코드로 
//     바꾸기 때문에 한글이 깨지는 문제가 발생한다.
//



@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step5/Servlet04")
public class Servlet04 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    
    //다음과 같이 명시를 해줘야 HTTP 서버에서 UTF-8 방식의 문자로 받아들임.
    req.setCharacterEncoding("UTF-8");
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
 

   Enumeration<String> names = req.getParameterNames();
    while(names.hasMoreElements()) {
        String name = names.nextElement();
        out.printf("%s: %s\n", name, req.getParameter(name));
    }
   
}
    
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        byte[] bytes = {0x41,0x42,0x43,
                        (byte)0xea,
                        (byte)0xb0,
                        (byte)0x80,
                        (byte)0xea,
                        (byte)0xb0,
                        (byte)0x81};
        
        // HTTP서버에서 UTF-8방식값을 ISO 방식으로 전환을 해버려서 이런 문제가 생김
        String str = new String(bytes, "ISO-8859-1");
        
        System.out.println("HTTP서버에서 변환된 값: "+str);
        
        
    }
    
    
}

