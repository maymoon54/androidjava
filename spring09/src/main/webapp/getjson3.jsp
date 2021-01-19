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
	$.ajax({
		url: "json.do",
		dataType: "json",
		success: function(result) {
			console.log(result)
			no = result.no
			title = result.title
			content = result.content
			writer = result.writer
		}		
	})
})

</script>
<h3>json으로 받아온 값</h3>

</body>
</html>