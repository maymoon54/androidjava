var http = require('http')
var url = require('url')
//import

//http://localhost:4000/?year=2021&month=july get방식으로 
http.createServer(function(req,res){
    res.writeHead(200, {'Content-Type':'text/html'})
    var query = url.parse(req.url, true).query;
    var year = query.year;
    var month = query.month;

    res.end('<font color=red size=6>your url>>>' + req.url + '</font><br>' + 
            '<font color=blue size=6>req year: ' + year + '</font><br>' + 
            '<font color=blue size=6>req month: ' + month + '</font>'  
    );    
    console.log('no 4000 port server started!!');
}).listen(4000)