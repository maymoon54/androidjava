<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
나는 수정하는 페이지 입니다.........<br>
검색결과 : ${bbsVO2} <!-- 세션이름 --><br>
<hr>
no: ${bbsVO2.no}<br>
title: ${bbsVO2.title}<br>
content: ${bbsVO2.content}<br>
writer: ${bbsVO2.writer}<br>

<a href="delete.do">삭제하기</a>
</body>
</html>