<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
   
   $(function() { // body를 먼저 읽고 함수 실행
    $('#b1').click(function() {
    	$('#d1').empty()
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1",
			data:{
				url : 'http://health.chosun.com/site/data/rss/rss.xml',
				api_key : 'ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1',
				count : 20
			},
				success: function(result) {
				//alert('성공')				
				items = result.items
				console.log(items.length)
				if (items.length > 0) {
					$(items).each(function(index, news) {
						title = news.title
						pubDate = news.pubDate
						link = news.link	
						console.log(news.title)
						console.log(news.pubDate)
						console.log(news.link)
						total = "<a href=" + link +">" + title + "</a> - " + pubDate + "<br>" + link + "<hr>"
					$('#d1').append(total)
					
					                     $.ajax({
                        url: "chosun.jsp", //db1.jps파일을 실행함
                        data: { //db에 전송할 데이터
                        	title : news.title,
    						pubDate : news.pubDate,
    						link : news.link	
                        },
                        success: function(result) {
                        	if(index == 19) {
                        		console.log('성공적으로 전송함.!!')
                                alert('chosun.jsp의 결과: ' + result)
                            	
							}
                            }
                     })
					
					})//for each
				}//if
			}//success
		})//ajax
	})//b1버튼 클릭
	
	$('#b2').click(function() {
		//d1에 이미 출력된것 지워야함
		$('#d1').empty()
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1",
			data:{
				url : 'http://travel.chosun.com/site/data/rss/rss.xml',
				api_key : 'ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1',
				count : 20
			},
				success: function(result) {
				//alert('성공')				
				items = result.items
				console.log(items.length)
				if (items.length > 0) {
					$(items).each(function(index, news) {
						title = news.title
						pubDate = news.pubDate
						link = news.link	
						console.log(news.title)
						console.log(news.pubDate)
						console.log(news.link)
						total = "<a href=" + link +">" + title + "</a> - " + pubDate + "<br>" + link + "<hr>"
					$('#d1').append(total)
					})//for each
				}//if
			}//success
		})//ajax
	})//b2버튼 클릭
	
	$('#b3').click(function() {
		//d1에 이미 출력된것 지워야함
		$('#d1').empty()
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fart.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1",
			data:{
				url : 'http://art.chosun.com/site/data/rss/rss.xml',
				api_key : 'ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1',
				count : 20
			},
				success: function(result) {
				//alert('성공')				
				items = result.items
				console.log(items.length)
				if (items.length > 0) {
					$(items).each(function(index, news) {
						title = news.title
						pubDate = news.pubDate
						link = news.link	
						console.log(news.title)
						console.log(news.pubDate)
						console.log(news.link)
						total = "<a href=" + link +">" + title + "</a> - " + pubDate + "<br>" + link + "<hr>"
					$('#d1').append(total)
					})//for each
				}//if
			}//success
		})//ajax
	})//b3버튼 클릭
	
	$('#b4').click(function() {
		//d1에 이미 출력된것 지워야함
		$('#d1').empty()
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1",
			data:{
				url : 'http://travel.chosun.com/site/data/rss/rss.xml',
				api_key : 'ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1',
				count : 20
			},
				success: function(result) {
				//alert('성공')				
				items = result.items
				console.log(items.length)
				if (items.length > 0) {
					$(items).each(function(index, news) {
						title = news.title
						pubDate = news.pubDate
						img = news.thumbnail
						console.log(news.title)
						console.log(news.pubDate)
						console.log(news.thumbnail)
						total =  title + "</a> - " + pubDate + "<br><img src=" + img + "><hr>"
					$('#d1').append(total)
					})//for each
				}//if
			}//success
		})//ajax
	})//b4버튼 클릭
	
	
	$('#b5').click(function() {
		//d1에 이미 출력된것 지워야함
		$('#d1').empty()
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_photo.xml&api_key=ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1",
			data:{
				url : 'http://rss.hankyung.com/new/news_photo.xml',
				api_key : 'ibu4hmjm9venqdhzknppcuhsjptuzckq59w8sjj1',
				count : 20
			},
				success: function(result) {
				//alert('성공')				
				items = result.items
				console.log(items.length)
				if (items.length > 0) {
					$(items).each(function(index, news) {
						title = news.title
						pubDate = news.pubDate
						link = news.link	
						console.log(news.title)
						console.log(news.pubDate)
						console.log(news.link)
						total = "<a href=" + link +">" + title + "</a> - " + pubDate + "<br>" + link + "<hr>"
					$('#d1').append(total)
					})//for each
				}//if
			}//success
		})//ajax
	})//b5버튼 클릭
	
	
   })
</script>
</head>
<body>
<button id= "b1">헬스연결</button>
<button id= "b2">트래블 연결</button>
<button id= "b3">아트 연결</button>
<button id= "b4">연예 연결</button>
<button id= "b5">포토 연결</button>


<hr color="red">
<div id="d1"></div>

</body>
</html>