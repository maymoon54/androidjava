<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String tel = request.getParameter("tel");

%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 처리</title>
</head>
<body>
<h3>당신이 입력한 정보</h3>
<hr color = "red">
아이디 :<%=id %><br>
패스워드 :<%=pw %><br> 
이름 : <%=name %><br>
연락처 : <%=tel %><br>
</body>
</html>