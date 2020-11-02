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
Cookie c1 = new Cookie("sub", "스프링");
response.addCookie(c1);

Cookie c2 = new Cookie("class", "709호");
response.addCookie(c2);

Cookie c3 = new Cookie("num", "100명");
response.addCookie(c3);

%>
</body>
<h1>브라우저에 쿠키를 심었음</h1>
<a href="쿠키가지고오기.jsp">브라우저에서쿠기가져오기</a>
</html>