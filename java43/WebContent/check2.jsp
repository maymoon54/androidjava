<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
String id = request.getParameter("id");// 받아온 아이디값
MemberDAO dao = new MemberDAO();
int result = dao.read(id);
String idchk = "<font color=red>아이디 중복</font>";
if (result ==0) {
	idchk = "<font color=green>아이디 사용 가능</font>";
}
%><%= idchk %>