<%@page import="java47.BasketVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
   String product = request.getParameter("product");
   String price = request.getParameter("price");

   ArrayList<BasketVO> list = null;

   BasketVO vo = new BasketVO();
   vo.setPrice(price);
   vo.setProduct(product);
   
      if (session.getAttribute("basket2") != null) {
         //null이 아니라는 의미는 이미 장바구니가 만들어져있다는 얘기
         //기존에 있던 세션으로 잡아둔 장바구니 목록을 가지고 와서
         //거기에다가 새로운 장바구니 물건을 추가한다.
         list = (ArrayList<BasketVO>)session.getAttribute("basket2");
         list.add(vo);
      } else {
         //null이라는 의미는 장바구니 목록이 안만들어져있다는 얘기
         list = new ArrayList<>();
         list.add(vo);
      }
      session.setAttribute("basket2", list);   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   if(session.getAttribute("basket2") == null){
%>
      <h3>장바구니가 비어있음.</h3>
   <%
   }else{
   %>
      <h3>장바구니의 개수<%=list.size()%>개 들어있음.</h3>
   <h3>장바구니 목록</h3>
   <hr color="blue">
   <%
      for(BasketVO s: list){
   %>
      상품이름 : <%= s.getProduct() %> 상품가격 : <%= s.getPrice() %><br>
      
   <%      
      }
   }
   %>
   <hr color="green">
   <a href="null.jsp">장바구니 비우기</a>
</body>
</html>