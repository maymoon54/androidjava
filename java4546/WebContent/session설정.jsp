<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
session.setAttribute("id", "park"); //로그인 성공시 세션으로 설정
session.setAttribute("name", "박길동"); //로그인 성공시 세션으로 설정

application.setAttribute("count", 100);
%>
<a href="세션보기.jsp">세션보기</a>
<a href="세션보기2.jsp">세션보기2</a>

</body>
</html>