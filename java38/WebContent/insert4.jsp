<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--  넘어오는 4개의 값을 받아서 vo에 넣어준다-->    
<jsp:useBean id="vo" class="bean.BbsDAO"></jsp:useBean>    
<jsp:setProperty property="*" name="vo"/>


<%
BbsDAO dao = new BbsDAO();
dao.create(vo);

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>글쓰기 성공</hr>
</body>
</html>