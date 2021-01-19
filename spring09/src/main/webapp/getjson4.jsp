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
		url: "json2.do",
		dataType: "json",
		success: function(result) {
			console.log(result)
			
			for (var i = 0; i < result.length; i++) {
				no = result[i].no
				title = result[i].title
				content = result[i].content
				writer = result[i].writer
			}
		}		
	})
})

</script>
<h3>json으로 받아온 값</h3>

</body>
</html>