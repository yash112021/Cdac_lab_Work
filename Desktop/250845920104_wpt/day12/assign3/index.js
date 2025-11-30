// 1) get  -  hostname:port/users
// 2) get with specific id  - hostname:port/users/:id 
// 3)get data with id and email  - hostname:port/users/:id/:email
// 4) and delete operation  - hostname:port/users

//    generate your own data  from 
// 	https://www.mockaroo.com/

let express=require('express');
let app=express();

const port=6060;
const userdata=require("./MOCK_DATA");  // getting the data

// by using the param parameters
//sending all the data
app.get('/:user',(req,res)=>{
        let {user}=req.params;
        console.log(user);
        res.send(userdata);
})
// app.get('/user',(req,res)=>{
//         let {user}=req.params;
//         console.log(user);
//         res.send(userdata);
// })


// 2) get with specific id  - hostname:port/users/:id 
// app.get('/:id',()=>{
//     let {id}=req.params
//     if(id==)
// })
// creating the object
const ab={
    
}

// // 3)get data with id and email  - hostname:port/users/:id/:email
app.get('/users/:id/:email', (req, res) => {
    const id = Number(req.params.id);  // 15
    // console.log(id);
    const user = user.find(
        user => user.id === id
    )
    // console.log(user)
    return res.json(user);
});
app.listen(port);

//delete
//req param    string 

//sircode
app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);  // 15
    // console.log(id);
    const userIndex = userdata.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = userdata.splice(userIndex, 1);
    return res.json("Dae ");
});
 


// app.delete('/users/:id', (req, res) => {
//     const id = Number(req.params.id);
//     if (isNaN(id)) {
//         return res.status(400).json({ error: 'Invalid user id' });
//     }
//     const userIndex = user.findIndex(user => user.id === id);
//     if (userIndex === -1) {
//         return res.status(404).json({ error: 'User not found' });
//     }
//     const deletedUser = user.splice(userIndex, 1)[0];
//     return res.json({ message: 'User deleted successfully', user: deletedUser });
// });
