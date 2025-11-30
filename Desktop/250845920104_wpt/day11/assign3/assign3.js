// 3)   Try File Handling Write and Read data synchronous method 
//    and try asynchronous method 

const f = require('fs');

//file writing
let d = "data";
f.writeFile("write.txt", d, (err) => {
    if (err) {
        console.log("error writing file");
    } else {
        console.log("Write complete.");
    }
});

//read the file
//  const f = require('fs');
f.readFile("read.txt", "utf8", (err, data)=>{
    if(err){
        console.log("error")
    }
    else{
        console.log(data);
    }
  
})





