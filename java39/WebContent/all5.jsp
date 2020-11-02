<%@page import="bean.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
String title = request.getParameter("title"); //글 제목으로 검색
BbsDAO dao = new BbsDAO();
ArrayList<BbsVO> list = dao.all(title);
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제목으로 글 검색</title>
</head>
<body>
<h3>검색결과는 <%=list.size()%>개입니다.</h3>
<!--테이블로 출력하기-->
<table border="1">
<tr>
<td class="td">글번호</td>
<td class="td">글제목</td>
<td class="td">글내용</td>
<td class="td">작성자</td>
</tr>
<%
//vo에서 하나씩 꺼내기
for(int i=0; i<list.size(); i++){
BbsVO vo = list.get(i);
%>

<tr>
<td><%=vo.getNo() %></td>
<td><%=vo.getTitle() %></td>
<td><%=vo.getContent() %></td>
<td><%=vo.getWriter() %></td>
</tr>
<%} %>

</table>


</body>
</html>