// use http package and create server in node js 

//now in this program we are going to create a client server http protocol but we are not going to use the index page og html we(with the hlp of node.js httpmodule)

const http = require ('http');
const server = http.createServer((req, res)=>{
    res.writeHead(200, { 'content-type': 'text/html'})
    res.end('Hello, from node js');
})
server.listen(8080);



