//console.log('first page')

var http = require('http')
var data = "<a href='http://naver.com'>to naver</a>"
var form = "<form action='ok'>" + 
    "id : <input type='text' name='id'/><br/>"+
    "pw: <input type='text' name='pw'/><br/>"+
    "<input type='submit' value='submit'/><br/>";

http.createServer(function(req,res){
    res.writeHead(200, {'Content-Type':'text/html'})
    res.end('<h3 style=color:blue>hello nodespace!!!</h3>' + 
            data + 
            "<hr color=red>" + 
            form
    );
}).listen(4000)