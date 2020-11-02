<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String product = request.getParameter("product");
ArrayList<String> list = null;
if(product != null){
//넘어오는 값을 받아서
//새로고침 할 경우 null값 받음 (앞페이지에서 넘어온 값이 없음)								
//ArrayList<String> list = new ArrayList<>(); //리스트만들기 , 어레이리스트 초기화
if(session.getAttribute("basket") != null) { 
	//null이 아니라는 의미는 이미 장바구니가 만들어져 있다는 이야기
	list = (ArrayList<String>)session.getAttribute("basket");//세션 잡을땐 odject 가지고 올때는 형변환 해야함
	list.add(product);
}else{
	// null이라는 의미는 장바구니 목록이 안만들어져 있다는 의미
	// 기존에 있던 세션으로 잡아둔 장바구니 목록을 가지고 와서
	// 거기에다가 새로운 장바구니 물건을 추가한다
	list = new ArrayList<>();
	list.add(product);
}
}else{
	list = (ArrayList<String>)session.getAttribute("basket");	
}
list.add(product); //리스트에 담기 
session.setAttribute("basket", list); //세션잡기, 추가된 목록도 다시 저장

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



장바구니 개수 <%=list.size() %>개 들어있음.
<h3>장바구니 목록</h3>
<% 
for(String s : list){
%>
<%= s %>
<%
}
%>
<!--  -->
</body>
</html>