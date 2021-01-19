<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$('#one').click(function() {
		$.ajax({
			url: "json5.do",
			data: {no : $('#no').val()},
			dataType: "json",
			success: function(result) {
				console.log(result)
				no = result.no
				title = result.title
				content = result.content
				writer = result.writer
			$('#d1').append(no +"," +title +","+content+"," +writer )
			}		
		})
	})

})

</script>
<h3>json으로 받아온 값</h3>

<input type="text" id="no"></input>
<button id="one">게시물번호로 검색</button>
<div id="d1"></div>
</body>
</html>