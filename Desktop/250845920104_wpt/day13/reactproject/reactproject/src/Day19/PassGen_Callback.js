// 1) use CallBack in password Generator program 

// in these function we are going to use the callback  and the useEffect to the generator fucntion

// import  {useSate, useEffect, useCallback} from 'react'
// import React from "react"; 
// import {useSate} from 'react'
import React, { useCallback, useEffect, useState } from 'react';


export default function PassGen_Callback() {
    //making the 4 useSatate

    let [pass, setPass]=useState(''); //  for setting the password
    let [len, setLen]=useState(14);   // now we are setting default length as 12 to track the length enter by the user
    let [num, setNum]=useState(true);   // This function is if the userwant the number  in password or not initially ifalse becz no num initially
    let [symbol, setSymbol]=useState(false); // This function is if the userwant the ssymbol  in password or not initially ifalse becz no symbol initially


    let genPassword=() =>{

    //  let regex = /[A-Za-z]/; //alpbhabets from A to Z
     let regex = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'; //alpbhabets from A to Z
     
     if(num) { regex += "0123456789"}
     if(symbol) { regex += "@#$%^&*+_"}


     let newpass = '';
     
        for (let i =0; i<len;i++){
         newpass += regex.charAt(Math.floor(Math.random()*regex.length));
      }
       
     //}
      setPass(newpass);

    }
    
    // useEffect(genPassword, [len,num,symbol]);


  return (
    <>    
    <div>
        <label for="len">Password length</label>
        <input type="number" min="1" max="64`" id="len" value={len} onChange={(event)=>{setLen(parseInt(event.target.value))}}/>

        <label for="">
        <input type="checkbox" checked= {num} onChange={()=>{setNum(!num)}} />       
         select checkbox Number</label>

        <label for="">
        <input type="checkbox" checked= {symbol} onChange={()=>{setSymbol(!symbol)}} />       
        select checkbox symbol</label>

        <button onClick={genPassword}>Generate password</button>
        <br/><br/>
        <h6>Your password is : {pass}</h6>
    </div>
    </>

  )
}
