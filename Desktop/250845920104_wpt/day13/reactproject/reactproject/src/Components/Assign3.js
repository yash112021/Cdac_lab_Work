// accept the data in text field and 3 radio button for the uppercase lowecase and title case
 import './Helo.css';


 import React, { useState } from 'react'


 export default function Assign3() {
   const [data,setData]=useState(0);
            let a="Enter your data"
        
        let uppercaseHandling=(e)=>{

            const upperText = this.state.data.toUppercase();
            this.setData({text.upperText})
            setData(e.target.value);
        }
        console.log(setData);





    return (
    <>       <div>
        
        <div class="textfiel" style={{display:"inline-block", marginLeft: "300px"}}>
            <h1><b>{a}</b></h1>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label"></label>
                     <textarea class="form-control" id="exampleFormControlTextarea1" rows="10" cols="50" value={data.text}></textarea>
                </div>
                <div class="buttns my-3">
                <button onClick={uppercaseHandling}>UpperCase</button>
                <button  onClick={lowercaseHandling}>Lowercase</button>
                <button  onClick={titlecaseHandling}>Title Case</button>
                </div>
        </div>
     </div>
     <div id="para">
        <p>


        </p>
     </div>
     </>

   )
 }
 