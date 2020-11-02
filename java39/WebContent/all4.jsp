<%@page import="bean.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!-- DAO를 이용해서 결과를 리스트로 받아온 후 HTML을 만든다  -->    

<%
BbsDAO dao = new BbsDAO();
ArrayList<BbsVO> list = dao.all();
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 전체 글 검색</title>
</head>
<h3>전체글의 개수는 <%=list.size()%>개입니다.</h3>
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


<%-- <%
//vo에서 하나씩 꺼내기
for(int i=0; i<list.size(); i++){
BbsVO vo = list.get(i);
%>
글번호: <%=vo.getNo() %> <br> 
글제목: <%=vo.getTitle() %> <br>
글내용: <%=vo.getContent() %> <br>
작성자: <%=vo.getWriter() %> <br><br>

<%} %> --%>


<body>
<li>
<form action="all5.jsp"><!--java  -->
검색(글제목) <input type="Text" name="title">
<button type="submit">조건검색시작(항목전체일치)</button>
</li>
</form>
<hr>
<form action="all6.jsp"><!--fun  -->
검색(내용) <input type="Text" name="content">
<button type="submit">조건검색시작(항목부분일치)</button>
</li>
</form>
</ul>


</body>
</html>