// 4) Accept Data in textfield and onBlur event display that 
//    data as List Order List in webpage

import { useState } from "react"



export default function Assign4_onBlur(){
let jk;
    function handler(event){
        update(event.target.value);
    }
    function updatedWhileEntering(e){
         update(e.target.value);
    }
    function display(){
         document.querySelector("#ya").innerHTML=data;
    }

    

    const [data,update]=useState("");
    return (
    <>
    <div>
            <label for="tarea" > Enter the text</label>
            <br/><br/>
            <textarea id="tarea"  onBlur={handler} onChange={updatedWhileEntering}  rows={20} cols={100}></textarea>
            <br/><br/>
            <button type="submit" onClick={display}>Click me to display list</button>
            
    </div>
  
   <div>
        <ul>
            <li typeof="1" id="ya"><b>The Data you entered is :--{}</b></li>
        </ul>
    </div>
    </>
  )

}