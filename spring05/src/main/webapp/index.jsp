<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
스프링5 프로젝트입니다.
<h3>게시판</h3>
<form action="insert.do">
번호:<input type="text" name="no"><br>
제목:<input type="text" name="title"><br>
내용:<input type="text" name="content"><br>
작성자:<input type="text" name="writer"><br>
<button>글작성하기</button>
</form>
</body>
</html>