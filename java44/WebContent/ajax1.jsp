<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
   //콜백함수(call-back함수)
   //특정한 이벤트를 기다렸다가 그 이벤트가 발생하면
   //함수가 정의되어있는 곳으로 돌아가 자동 호출되는 함수
   //body의 하위 엘리먼트(태그)를 
   //먼저 브라우저가 dom-tree를 구성한 후
   //콜백함수를 정의하게 되어있음.
   //브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라
   //body부분을 먼저 읽어서 dom-tree를 만들도록 해야함.
   $(function() { // body를 먼저 읽고 함수 실행
      $('#b1').click(function() {//b1버튼을 클릭했을때 실행
         $.ajax({//ajax함수 호출
            url: "data/member.xml", //가져올 xml문서의 주소
            success: function(doc) { //xml문서와 연결 성공시 실행할 함수
               console.log('XML요청 성공!!')
               console.log('XML결과: ' + doc)
               list = $(doc).find('record') //record를 찾아서 list에 저장함
               console.log('레코드의 개수: ' + list.length)
               console.log(list[0])
               if(list.length > 0){//list에 저장된 record 수만큼 반복 (100번)
                  $(list).each(function(index, item) {//자바의 for each 문과 동일 : record에서 각 항목을 하나씩 꺼내온다 
                     id = $(item).find('id').text() //list에서 찾은 id의 text를 변수에 저장
                     first_name = $(item).find('first_name').text()//list에서 찾은 first_name의 text를 변수에 저장
                     last_name = $(item).find('last_name').text()//list에서 찾은 last_name의 text를 변수에 저장
                     email = $(item).find('email').text()//list에서 찾은 email의 text를 변수에 저장
                     gender = $(item).find('gender').text()//list에서 찾은 gender의 text를 변수에 저장
                     ip_address = $(item).find('ip_address').text()//list에서 찾은 ip_address의 text를 변수에 저장
                     total = 'id: ' + id + 
                        ', first_name: ' + first_name +
                        ', last_name: ' + last_name +
                        ', email: ' + email +
                        ', gender: ' + gender +
                        ', ip_address: ' + ip_address //가져온 값들을 total이라는 변수에 저장함
                     console.log(total)
                     $('#d1').append(total + '<br>') //div id="d1"에 tatal에 저장된 값을 출력
                     
                     $.ajax({
                        url: "db1.jsp", //db1.jps파일을 실행함
                        data: { //db에 전송할 데이터
                           id : id,
                           first_name : first_name,
                           last_name : last_name,
                           email : email,
                           gender : gender,
                           ip_address : ip_address
                        },
                        success: function(result) {
                           console.log('db1.jsp를 통해서 db에 넣기!- 성공적으로 전송함.!!')
                           console.log('db1.jsp의 결과: ' + result)
                        }
                     })
                  })
               }
            }
         })
      })
      $('#b2').click(function() {
         $.ajax({
            url: "data/member.json",
            success: function(doc) { 
               //alert('JSON요청 성공!!')
               console.log(doc)
               //for-each로 하나씩꺼내 오기 
               $(doc).each(function(index, item) {
            	   id = item.id, //접근연산자로 가져옴
                   first_name = item.first_name,
                   last_name = item.last_name,
                   email = item.email,
                   gender = item.gender,
                   ip_address = item.ip_address
                total = 'id: ' + id + 
                   ', first_name: ' + first_name +
                   ', last_name: ' + last_name +
                   ', email: ' + email +
                   ', gender: ' + gender +
                   ', ip_address: ' + ip_address //가져온 값들을 total이라는 변수에 저장함
                console.log(total)
                $('#d1').append(total + '<br>') //div id="d1"에 tatal에 저장된 값을 출력
                

			})//each
            }//success
         })//ajax
      })//b2클릭
      $('#b3').click(function() {
         
      })
   })
</script>
</head>
<body>
<button id= "b1">XML읽어오기</button>
<button id= "b2">JSON읽어오기</button>
<button id= "b3">DB에 넣기</button>
<hr color="red">
<div id="d1"></div>

</body>
</html>