// 1) add post and put functionality in yesterday Rest API 

const exp=require("express");
const app=exp();
const port=3000;
const info=require("./MOCK_DATA.json");
const fs = require("fs");


app.get("/users",(req,res)=>{
    res.send(info);
})

// by using the put we can update our cocde
app.use(exp.urlencoded({extended:false}));
app.post('/adddata', (req, res)=>{
    const data = req.body;
    console.log("data" + data.email);
    info.push( {data, id:info.length+1});


    fs.writeFile('./MOCK_DATA.json', JSON.stringify(info), (err)=>{
            console.log(err);
     });
    
    return res.json("Data added");
})


app.post("/updata",(req,res)=>{
    res.send(info)
})


app.listen(port,()=>{
    console.log("port is listenning")
})




// app.use(express.urlencoded({ extended: false }))

// app.post('/adduser', (req, res) => {
//     const data = req.body;// 
//     console.log("data " + data.email);
//     users1.push(
//         { data, id: users1.length + 1 });
//     f.writeFile('./MOCK_DATA.json',
//         JSON.stringify(users1), (err) => {
//             console.log(err)
//         });

//     return res.json("data added ");


// })
