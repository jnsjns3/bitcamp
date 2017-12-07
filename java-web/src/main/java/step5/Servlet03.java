package step5;

import java.io.IOException;
import java.io.PrintWriter;
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
//예)
/*
POST /bitcamp-java-web/step5/Servlet03 HTTP/1.1
Host: localhost:9999
Connection: keep-alive
Content-Length: 31
Pragma: no-cache
Cache-Control: no-cache
Origin: http://localhost:9999
Upgrade-Insecure-Requests: 1
Content-Type: application/x-www-form-urlencoded
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng
Referer: http://localhost:9999/bitcamp-java-web/step5/Servlet03.html
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
name=hong2&age=30&working=false
*/

//데이터를 보내는 형식
//- GET과 POST 모두 같다.
//- 이름=값&이름=값&이름=값...
//
//Query String(쿼리 스트링)
//- GET 요청처럼 URL에 붙어서 보내는 데이터를 말한다.
//
//Message-Body = entity
//- POST 요청처럼 요청 헤더 다음에 보내는 데이터를 말한다.
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step5/Servlet03")
public class Servlet03 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    
    //URL에 포함된 데이터를 꺼내기
  //http://localhost:9999/java-web/step5/Servlet03.html
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
 
    // GET 요청으로 데이터가 넘어 왔뜬 ,POST요청으로 데이터가 넘어왔든 모두 같은 메서드(getPrameter())로 꺼낼수 있따
   Enumeration<String> names = req.getParameterNames();
    while(names.hasMoreElements()) {
        String name = names.nextElement();
        out.printf("%s: %s\n", name, req.getParameter(name));
    }
}
    

    
    
    
}

