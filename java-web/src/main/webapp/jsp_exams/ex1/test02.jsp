<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP란? </h1>
<p>
    클라이언트가 test02.jsp를 요청한다
    서블릿 컨테이너는 test02.jsp에 대한 서블릿 클래스가 잇는지 조사한다
    있다면 해당 서블릿을 실행한다
    없다면 test02.jsp에 작성된 명령에 따라 서블릿 클래스를 만든다.
    어디에? tmpX/work/..../test02_jsp.java 톰캣서버의 경우
    서블릿소스를 컴파일 한다.
    tmpX/work/..../test02_jsp.class 톰캣서버의 경우
   
</p>
<h2>결론</h2>
<p>HTML 콘텐츠를 출력하기 위해 자바 코드를 작성하지 않는 것 만으로
이미 JSP이 가치는 충분하다!</p>
<p>지금까지 그냥 편안하게 작성한 이 모든 텍스는 SErvlet 클래스를 만들때 그대로 출력문 코드로 바뀐다.</p>
</body>
</html>