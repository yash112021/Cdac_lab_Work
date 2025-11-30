const f =  require('http');
const server = f.createServer((req,res)=> {
    console.log("Method" + req.method)
    if(req.method === 'POST'){
        res.write("post method demo");
    }

    if(req.method === 'GET'){
        res.write("GET method demo");
    }

});
server.listen(4000);