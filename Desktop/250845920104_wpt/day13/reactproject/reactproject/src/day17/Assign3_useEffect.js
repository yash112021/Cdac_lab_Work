import './App_day17.css'

import React,  { useContext, useState} from 'react'
import { useEffect } from 'react'

export default function Assign3_useEffect(props) {
    let handle=()=>{
        setA(a+1);
    }

    // useEffect(setInterval(()=>{
    //     console.log("useEffect");
    // },1000))

   let [a , setA] = useState(0);
    let [count,setText]=useState(0);
    //  useEffect(()=>{  // {our code }
    //     // setInterval(setText(count+1),1000)},[])
    //     setTimeout(setText(count+1),1000)},)
    
   //  useEffect(()=>{    // Sir code
      //   setInterval(setText(count+1),1000)},[])

          useEffect(()=>{ console.log("in useeffect     ")
            setText(count+1)  ;// Sir code
         },[a])
      
    

    return (
    <>
    <div >
            
        <div class="container my-3">
            <h6>Now we are using {props.title}</h6>
                <h1> <b>The Conter is :{count}</b></h1><br/>
                <button onClick={handle}>Click Me to increase the counter</button>
        </div>
    </div>
    </>
  )
}
