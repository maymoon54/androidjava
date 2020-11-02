<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫페이지</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css" />
</head>
<script src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(function() { //dom tree로딩 후
		//alert("환영합니다!")	

		$('#b1').click(function() {
			replyValue = $('#reply').val()
			$.ajax({
				url: "reply.do",
				data: {
					reply : replyValue
				},
				success: function(result) {
					alert(result)
					$("#d1").append(result)
				}//success
			})//ajax
		})//b1버튼 클릭
		
		$('#b2').click(function() {
			idValue = $('#id').val()
			//https://blog.naver.com/pgrm214/222069539835 
			$.ajax({
				url: "idChk.do",
				data: {
					id : idValue
				},
				success: function(result) {
					//alert(result)
					$("#d2").html(result)
				}
				
			})
		})

	})
</script>
<body>
	<form action="movie.do">
		영화제목 :<input type="text" name="title"> <br>영화관람료 : <input
			type="text" name="price">
		<button type="submit">예매하기</button>
	</form>

	<hr color="Red">
	댓글 :
	<input type="Text" id="reply">

	<button id="b1">댓글달기</button>
	<div id="d1"></div>
	
	<hr color="red">
	가입할ID 입력 : <input type="text" id="id">
	<button id="b2">중복체크</button>
	<div id="d2"></div>

</body>
</html>