<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시물 등록 정보입니다</h3>
<hr color="red"> <!--컨트롤러에서 값 넘겨줄때 모델 설정 수동으로 해줬었는데 / 객체이름 원칙 지키면  get 메서드 적용 바로 가능-->
no: ${bbsVO.no}<br>
title: ${bbsVO.title}<br>
content: ${bbsVO.content}<br>
writer: ${bbsVO.writer}<br>
<a href="index.jsp">첫페이지</a>
<a href="update.do">수정 페이지로</a><!-- 디비에서 검색먼저 해야하므로, 컨트롤러 주소를 거쳐야함 -->
<a href="delete.do">삭제 페이지로</a>
</body>
</html>