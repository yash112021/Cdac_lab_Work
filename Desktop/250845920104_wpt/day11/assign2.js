// 2) create array like todo as shown in lecture  say todos
// 	display array data depends on path param 
// 	<url>/todos  --  display data in json format 
// 	<url>/todos/<id> -- display specific id data on web page 


const http=require('http');
const {URL}=require('url');

// this array havving object data stored in it
let todo=[{id:1,name:"yash",task:"To Reading"},{id:2, name:"nayan",task:"play Cricket"}];
 //now task after creating the server


 const serv=http.createServer(function (req,res){
    const {method, url}=req;

    const parsedUrl=new URL(url,`http://${req.headers.host}`);
    //   const parsedUrl =new URL(url, `http://${request.headers.host}`);
    const pathname = parsedUrl.pathname
    if(method == 'GET' && pathname == '/todos'){
        res.writeHead(200, {'content-Type' : 'application/json'});
        res.end(JSON.stringify(todo));
    }

   

})

serv.listen(8005,() => (console.log("server started")));