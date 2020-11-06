<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
스프링 5 프로젝트입니다.@@@
<h3 style=color:red>게시판 내용입니다.</h3>
<form action="insert.do">
	번호: <input type="text" name="no"><br>
	제목: <input type="text" name="title"><br>
	내용: <input type="text" name="content"><br>
	글쓴이: <input type="text" name="writer"><br>
	<button type="submit">글쓰기 완료</button>
</form>
<h3>게시물 검색</h3>
<a href="one.do?no=1">1번 게시물 검색</a><br>
<a href="one.do?no=2">2번 게시물 검색</a><br>
<a href="one.do?no=3">3번 게시물 검색</a><br>
<!-- / 태그사이에 내용(contents)이 비어있음. 빈태그  -->
<sql:setDataSource
	url="jdbc:mysql://localhost:3366/shop"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="1234"
	scope="application"
	var="db" 
/>

<!--select 결과 받아서 저장할 변수 list -->
<sql:query var="list" dataSource="${db}">
	select * from reply
</sql:query>
<c:forEach items="${list.rows}" var="vo">
${vo}<br>
</c:forEach>

<sql:query var="ea" dataSource="${db}">
	select count(no) from reply
</sql:query>
<c:forEach items="${ea.rows}" var="c">
${c}<br>
</c:forEach>
</body>
</html>