var http = require('http')
var fs = require('fs')

http.createServer(function(req,res){
    
    console.log('no 4000 port server started!!');
    fs.readFile('html1.html', function (err, data) {
        res.writeHead(200, {'Content-Type':'text/html'})        
        res.write(data)
        return res.end();   
    });

}).listen(4000)