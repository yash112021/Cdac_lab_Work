// 2) create Counter Application with useState

import './App_day17.css'

import React, { useState } from 'react'

export default function Assign2counter() {
    let handle=()=>{
        setText(count+1);
    }
    let [count,setText]=useState(0);
    return (
    <>
    <div>
            
        <div class="container my-3">
                <h1> <b>The Conter is :{count}</b></h1><br/>
                <button onClick={handle}>Click Me to increase the counter</button>
        </div>
    </div>
    </>
  )
}
