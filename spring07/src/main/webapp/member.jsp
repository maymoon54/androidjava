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

<h3>회원검색</h3>
<a href="list2.do">전체회원검색</a>
<form action="one2.do">
아이디:<input type="text" name="id"><br>
<button>회원검색</button>
</form>



<h3>회원등록</h3>
<form action="create2.do">
아이디:<input type="text" name="id"><br>
패스워드:<input type="text" name="pw"><br>
이름:<input type="text" name="name"><br>  
전화번호:<input type="text" name="tel"><br>
<button>회원등록하기</button>
</form>

<hr>
<h3>회원정보 수정</h3>
<form action="update2.do">
아이디:<input type="text" name="id"><br>
전화번호:<input type="text" name="tel"><br>
<button>수정하기</button>
</form>

<hr>
<h3>회원탈퇴</h3>
<form action="delete2.do">
아이디:<input type="text" name="id"><br>
<button>탈퇴하기</button>
</form>
</body>
</html>