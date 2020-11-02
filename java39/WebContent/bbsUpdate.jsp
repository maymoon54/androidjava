<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. int no 값 받아와야 함. -->
    <!-- 2. dao와 연동하여 결과 받아와야 함. -->
    <!-- 3. html로 만들어서 전송해야함. -->
<%
int no = Integer.parseInt(request.getParameter("no"));
BbsDAO dao = new BbsDAO();	
BbsVO vo = dao.one(no);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= vo.getNo() %> 번 글의 수정 페이지입니다.</h3>
<hr color="red">
<form action="bbsupdate2.jsp">
<table>
	<tr align="center">
		<td width="100" bgcolor="yellow">글번호</td>
		<td width="200" bgcolor="pink"><%= vo.getNo() %>
			<input type="hidden" name="no" value="<%= vo.getNo() %>" >
		 </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">글제목</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="pw" value="<%= vo.getTitle() %>"> </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">글내용</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="name" value="<%= vo.getContent()%>"> </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">작성자</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="tel" value="<%= vo.getWriter() %>"> </td>
	</tr>
	<tr align="center">
		<td colspan="2">
			<button type="submit" style=width:300px;background:red;color:white;>수정 처리 요청</button>
		</td>
	</tr>
</table>
</form>
<hr color="green">
[ 	<a href="index.html"><button style=background:green>처음페이지로</button></a> |
	<a href="one2.jsp?no=<%= vo.getNo() %>"><button style=background:gold>검색</button></a> |
	<a href="delete2.jsp?no=<%= vo.getNo() %>"><button style=background:lime>삭제</button></a> 
]  








</body>
</html>