
// 3) using hbs module -  Display Dynamic HTML page 

// 	calc.hbs   -  accept 2 numbers and display output 

//   npm install hbs --- to get hbs module 

const exp = require("express");
const app = exp();
const port = 5050;
const bodyParser = require('body-parser'  )
app.set("view engine", "ejs");

app.get("/form", (req, res)=> {
   
    res.render("calc");

})


app.use(bodyParser.urlencoded({ extended: true })); 

app.post("/form", (req, res)=> {
    let a = req.body.n1;
    let b = req.body.n2;
    let sum = parseInt(a) + parseInt(b);
    res.render("calc", {result:sum});
})


app.listen(port, ()=>{
    console.log("port is listening");
})