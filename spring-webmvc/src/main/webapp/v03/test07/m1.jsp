<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Welcome!</title>
</head>
<body>

<h1>모델값 확인</h1>
이름: ${requestScope.name}<br>
나이: ${requestScope.age}<br>
직장: ${requestScope.working}<br>
<hr>

<h1>HtppSession 보관소</h1>
이름: ${sessionScope.name}<br>
나이: ${sessionScope.age}<br>
직장: ${sessionScope.working}<br>
<hr>

</body>
</html>