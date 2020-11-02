<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
BbsVO vo = new BbsVO();
int no = Integer.parseInt(request.getParameter("no"));
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

vo.setNo(no);
vo.setTitle(title);
vo.setContent(content);
vo.setWriter(writer);

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