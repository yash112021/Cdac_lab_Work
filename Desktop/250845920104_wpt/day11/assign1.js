// 1) in http server pass data as query parameter 
//   and use that data to display on HTML Page 
//   fName=ABC&lName=XYZ

// 	o/p Hello <fName>


// reading the url 
let h=require('http');
let url=require('url');


// now after fetching creating the server
const server=h.createServer(function(req,res){

    // now when the server will start that part of the code is done here in this part 

   // request for the url 
   let fetchurl=req.url;  // it will fetch the url
   console.log(fetchurl);  // /?key=value
   let d1=url.parse(fetchurl,true).query;//parsed Object Format 
   console.log(d1);

   res.writeHead(200,{'content-type':'text/html'});
   console.log("Request Header")
    res.write("<h1>"+d1.name+"</h1>");  //to append the data 
    res.end();  //close the server
   

})

server.listen(4000);