<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>제품검색 결과 입니다</h3>
<hr color="red"> 
<c:forEach var="vo" items="${list}">
no: ${vo.no},
name: ${vo.name},
content: ${vo.content},
price: ${vo.price}<br>
</c:forEach>
</body>
</html>