var http = require('http');
var dt = require('./myfirstmodule');

var data = dt.myDateTime();

http.createServer(function(req,res){
    res.writeHead(200, {'Content-Type':'text/html'})
    res.write('now : ' + data + '<br>')
    res.end('<font color:red size=6>its lasttime!!!</font>');
    console.log('no 4000 port server started!!');
}).listen(4000)