console.log("From start script");

const express=require('express');
const app=express();

const fs = require('fs');

const user=require('./MOCK_DATA.json'); // picking up the data from the file
const port=3000;




app.get('/',(req,res) => {
    res.send("hello from experss");
});


app.get('/users1',  (req, res) => {
    res.json(user);
})

app.get('/users1',  (req, res) => {
    res.json(user);
})
app.get('/users2',  (req, res) => {
    //let obj = JSON.parse(user)
    // res.json(user.pop());
     res.json(user[1].id);
})
//         for(i=0;i<user.length;i++){
//             if(i%2==0){
//                 let b=`user[i]`;
               
//             }
//         }
//     }); 

// })


// app.get('/hello', (req,res)=>{
//     res.send("jyoti");
// })

app.post('/hello', (req,res)=>{
    res.send("jyoti");
})

// param path
app.get("/:user/:id", (req,res) => {
    // console.log("Path module");
    // res.send("Path module");
    let {user, id}=req.params;
    console.log(user);
    let str = `Hello ${user} Welcome to express. now you are going to deal with backend`;
    res.send(str);
})
// app.get("/*", (req,res) => {
//    res.send("Does not exist");
// })

app.listen(port);
