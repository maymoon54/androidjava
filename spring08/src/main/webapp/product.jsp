<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>

<h3>상품검색</h3>
<a href="list.do">전체상품검색</a>
<form action="one.do">
넘버 :<input type="text" name="no"><br>
<button>상품검색</button>
</form>

<h3>제품등록</h3>
<form action="create.do">
넘버:<input type="text" name="no"><br>
이름:<input type="text" name="name"><br>
내용:<input type="text" name="content"><br>  
가격:<input type="text" name="price"><br>
<button>제품등록하기</button>
</form>

<h3>제품정보수정</h3>
<form action="update.do">
넘버:<input type="text" name="no"><br>
가격:<input type="text" name="price"><br>
<button>제품등록하기</button>
</form>

<hr>
<h3>제품정보삭제</h3>
<form action="delete.do">
넘버:<input type="text" name="no"><br>
<button>제품삭제하기</button>
</form>
</body>
</html>