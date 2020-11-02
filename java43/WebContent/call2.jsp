<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
String result = "보통";
String p = request.getParameter("p");
if(Integer.parseInt(p) >= 90){
	result="최우수";
}else if(Integer.parseInt(p) >= 80){
	result="우수";
}
%><%= result %>