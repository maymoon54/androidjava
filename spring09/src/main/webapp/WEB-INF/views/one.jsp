<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#reply').click(function() {
		contentValue = $('#content').val()
		
		$.ajax({
			url : "create.do",
			data : {
				content : contentValue,
				original : '${one.no}', //one.get~~
				writer : '${id}' //따옴표없으면 변수로 인식한다, 스트링으로 인식해야함!
			},
			success : function(result) {
				//alert(result);
				$('#result').append(result)
				location.reload()
			}
		})
	})
})
</script>
</head>
<body>
<h3>게시물 검색 화면</h3>
<hr color="red">
게시물번호: ${one.no}<br>
제목 : ${one.title}<br>
내용 : ${one.content}<br>
작성자: ${one.writer}<br>
<c:set var="dayTime" value="<%= new Date() %>" />
작성일 : <fmt:formatDate value="${dayTime}" type="date" dateStyle="full"/>
 
<hr color="green">
댓글 : <input id="content"><button id="reply">댓글달기</button>
댓글수(${total})<br>
<hr>
<c:forEach items="${list}" var="vo" varStatus="status">
${status.index + 1} <!-- 순번 -->
${vo.writer}님 댓글 : ${vo.content}
<!--one.do?no=1  -->
<a href="delete3.do?no=${vo.no}&original=${vo.original}"><button>삭제</button></a>
<hr>
</c:forEach>
<div id="result">
</div>
</body>
</html>





