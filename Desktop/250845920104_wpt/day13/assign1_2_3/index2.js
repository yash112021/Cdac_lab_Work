// 2) in above rest api 
// 	/users/aboutus ----- display aboutus.html page 


const exp=require('express');
const app = exp();
const port = 4000;


app.set("view engine", "ejs");

app.get("/about", (req, res)=>{
    res.render("indexabout.ejs");
})


app.listen(port, ()=>{
    console.log("server is performing the listening work");
})
