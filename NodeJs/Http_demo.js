const http = require('http');

//create server object
http.createServer((req,res)=>{
    //write response
    res.write('<h1>hello node </h1>');
    res.end();
}).listen(5000,()=>console.log('server running....'));