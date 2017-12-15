<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    
    %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='common.css'>
</head>

<body>

<h1>JSP 코드 - tagib</h1>
JSP 에서 제공하는 태그 외에 외부에서 확장 태그를 가져올 때 사용한다.
확장 태그의 예로 JSTP 태그 라이브러리가 있다.
또한 개발자가 추가로 정의한 태그를 가져올 떄도 사용한다.

<pre class="jsp">
&lt;%@ taglib url="URL" prefix="네임스페이드명"&>
   
    
</pre>
<h3>language 속성</h3>
JSP 스크립트릿에서 사용할 프로그래밍 언어를 저장한다.<br>
원래는 java 뿐만 아니라 다른 프로그래밍 언어도 수용하려 하였다.<br>
즉 JSP를 자바에 종속된 기술이 아니라 언어에독립된 기술로 만들려 하였다.<br>
그러나 지금까지 java만 지원하고 있다.<br>
한 때 개발자들이 java 이외의 언어도 지원하도록 오픈 프로젝트를 진행한 것이 있다.<br>
그러나 지금은 모두 페기되었다.<br>

<h3>contentType 속성</h3>
<pre class="java">
response.setContentType("contentType 속성에 들어있는 값");
    }
</pre>
<h3>trimDirectiveWhitespaces="true" 속성</h3>
<p>
지시부 태그들 사이에 삽입된 공백(스페이스, 줄바꿈, 탭 등)을 출력문으로 바꾸지 않는다.

</p>
<h3>autoFlush 속성</h3>
<p>
출력한 콘텐츠가 버퍼에 꽉찼을 때 자동으로 클라이언트에게 출력하게 한다.<br>
true 이면 자동으로 출력한다. true가 기본값이다. false로 설정하면 버퍼가 찼을 때 실행 오류를 발생시킨다.<br>
즉 false로 설정했ㅇ르 대는 개발자가 버퍼가 차기 전에 flush()를 호출하여 버퍼의 내용을 출력해야 한다.<br>

</p>
<h3>buffer 속성</h3>
<p>
출력 버퍼의 크기를 지정한다. 기본이 8kb이다.<br>
버퍼의 크기가 넘으면 autoFlush 속성에 지정된 대로 동작한다.<br>
클라이언트로 보낼 페이지의 콘텐츠 양이 크고. 한번에 보내고 싶다면 버퍼의 크기를 증가시켜라!<br>

</p>
<h3>errorPage 속성</h3>
<p>
JSP 페이지를 실행하다가 오류가 발생하면 서블릿 컨테이너에 설정된 페이지가 출력된다 <br>
이를 바꾸고 시팓면 이 속성에 다른 페이지의 URL을 입력하라!<br>
그러면 에러가 발생했을떄 해당 URL의 섭르릿이나 JSP로 포워딩 할 것이다.<br>

</p>
</body>
</html>

