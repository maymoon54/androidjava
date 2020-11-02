<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   session.setAttribute("id", "root"); 
   // id라는 항목에 값을 넣어줄 수 있다 값: 아무거나넣고싶으면 object/ String, arraylist 다 가능
   // 업캐스팅해서 Object로 넣을꺼면, 꺼낼때는 String 강제형변환(다운캐스팅) 해야함
   %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<a href="세션보기1.jsp">세션보기1</a>
<a href="세션보기2.jsp">세션보기2</a>
<a href="세션보기3.jsp">세션보기3</a>
<body>

</body>
</html>