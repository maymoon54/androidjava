<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${param.color}색 자동차!!
<a href="car.do?color=red">빨간 자동차를 보러가자!</a> <!--요청 & color라는 파라메터 넘김  -->
<img src="resources/img/car.jpg">
</body>
</html>