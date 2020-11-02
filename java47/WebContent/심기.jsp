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
Cookie c1 = new Cookie("name", "홍길동");
response.addCookie(c1);

Cookie c2 = new Cookie("age", "100세");
response.addCookie(c2);

%>
</body>
<h1>브라우저에 쿠키를 심었음</h1>
<a href="가지고오기.jsp">브라우저에서쿠기가져오기</a>
</html>