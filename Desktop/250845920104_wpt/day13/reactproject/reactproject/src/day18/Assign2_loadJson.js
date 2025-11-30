
// 2) load the data from json url 
// and display data in Table Format in page 
// on Button Click 

import React from 'react'
import {useState} from 'react'
import axios from "axios";

export default function Assign2_loadJson() {

  let [jsonData, setData]=useState([]);
 // const [error, setError]=useState();
const onLoad=()=>{
  
  let p =axios.get("https://jsonplaceholder.typicode.com/posts")
  .then((response)=>{
    console.log(response.data)
    setData(response.data);
  
    
  })
}


  // making the functino to display the data on click
  //  const loadData = () => {
  //   axios.get("https://jsonplaceholder.typicode.com/posts")
  //     .then((response) => {
  //       setData(response.data);
  //       setShowTable(true);
  //     });
  // };

  // let up=()=>{
  //   document.querySelector("#div1").innerHTML= jsonData.map((post) => (
  //                   <li key={post.id}>{post.title}</li>
  //               ))>
  //             }





  // .catch((error)=>{
  //   setError(error.message);
  // })
  return (
     <>
    <div>
     
        <h1><i><b>loading the data From the Json</b></i></h1>
       {/*  <p>{jsonData[0]}</p> */}
        {/* loading the json data with the help of the Axios frst  */}
        <button type='button' onClick={onLoad}>Click Me</button>
        <div id="div1"> 

        </div>
        {jsonData.map((post) => (
                    <li key={post.id}>{post.title}</li>
                ))}
    </div>
       </>
  )
}


// export default function DemoAjax() {
//     let [jsonData, setData] = useState([]);
//     let p = axios.get("https://jsonplaceholder.typicode.com//posts");

//     p.then((response) => {
//         //console.log(response.data);
//         setData(response.data);
//     })


// }