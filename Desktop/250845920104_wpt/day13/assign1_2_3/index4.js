const exp = require("express");
const app = exp();
const port = 3030;

app.use((req,res,next)=>{
     console.log('Time:', Date.now());
     next();
     app.set("data","from user");
});






app.listen(port, ()=>{
    console.log("port is running");
})