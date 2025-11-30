// 4) create Login Form using HTML Form 
//  on submit click display data on page
import React, { useState } from 'react'
import './App1.css'
export default function Assign4_forms({title}) {
//  function Info(){

    let [data,set]=useState("Empty");
    let [data1,set1]=useState("Empty");
    let [data2,set2]=useState("Empty");

// let value="yashpatil";
     let read=(e)=>{
        //  value=e.target.value;
        set(e.target.value);
        console.log(e.target.value);
    }
     let read1=(e)=>{
        //  value=e.target.value;
        set1(e.target.value);
        console.log(e.target.value);
    }
     let read2=(e)=>{
        //  value=e.target.value;
        set2(e.target.value);
        console.log(e.target.value);
    }
  //}

  return (
    <div className='classBox'>
        <h6>{title}</h6>
      <h5>Login Form</h5>
      <label for="">Enter name</label>
      <input type="text" onBlur={read} onChange={read}></input>
      <label for="">Enter Email id</label>
      <input type="text" onBlur={read1} onChange={read1}></input>
      <label for="">Password</label>
      <input type="password"  onBlur={read2} onChange={read2}></input>
      <button type="submit" >Submit</button>
        <p>display data Username:{data}</p>
        <p>display data Email:{data1}</p>
        <p>display data Email:{data2}</p>
    </div>
  )
}
