<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="/header.jsp"></jsp:include>

<h1>회원 상세 정보</h1>
<form action="add" method='post'>
<div class='form-group row'>
<label for='name' class='col-sm-2 col-form-label'>이름</label>
<div class='col-sm-10'>
<input class='form-control' id='name' type='text' name='name'>
</div>
</div>
<div class='form-group row'>
<label for='email' class='col-sm-2 col-form-label'>이메일</label>
<div class='col-sm-10'>
<input class='form-control' id='email' type='text' name='email'>
</div>
</div>
<div class='form-group row'>
<label for='pwd' class='col-sm-2 col-form-label'>암호</label>
<div class='col-sm-10'>
<input class='form-control' id='pwd' type='text' name='pwd'>
</div>
</div>
<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>추가</button>
</div>
</div>
</form>

<jsp:include page="/footer.jsp"></jsp:include>

</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
    