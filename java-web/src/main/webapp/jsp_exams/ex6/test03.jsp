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

<h1>jsp:useBean</h1>
JSP페이지에 이 태그를 넣으면
자바 객체를 생성하는 코드를 삽입한다.

<h2>주요 속성</h2>
객체를 생성한후 저장할떄 사용할 이름

<h3>class</h3>
객체를 생성하기 위한 클래스명
반드시 Fully-quailfied class Name을 줘야한다 (패키지명 포함)

<h3>type</h3>
변수를 선언할 때 사용할 타입명
인스턴스를 만드는 용도가 아니기 때문에 인터페이스나 추상클래스도 가능하다.
물론 이 이름도 반드시 Fully-Quailfied Name 이어야 한다.
만약 이 속성이 생략되면 class 속성 값을 변수선언하는데 사용한다.

<h3>Scope 속성</h3>
<p>
객체를 생성한 후 저장할 보관소를 지정한다.
이 속성을 생략하면 기본적으로 PageContext 보관소에 저장된다.
서블릿은 총 4개의 보관소를 제공한다.


</body>
</html>

