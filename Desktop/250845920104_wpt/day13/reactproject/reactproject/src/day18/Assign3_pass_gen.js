// 3)  write code for random password generator 
//     as per discuss in Lecture depends on length 
// 	need to change 

import React, { useState } from 'react';

export default function Assign3_pass_gen({ heading ,agname}) {
  const [password, setPassword] = useState('');
  const [length, setLength] = useState(8);

  let gen = () => {
    const chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?';
    let password = '';
    for (let i = 0; i < length; i++) {
      const randIndex = Math.floor(Math.random() * chars.length);
      password += chars[randIndex];
    }
    setPassword(password);
  };

  return (
    <div className='classBox'>
        <h5>{agname}</h5>
      <h6>{heading}</h6>
      <label>Enter a number length for password</label>
      <input
        type="number"
        value={length}
        onChange={(e) => setLength(Number(e.target.value))}
      /><br />
      <button onClick={gen}>generate password</button>
      <div className="display">
        <p><b>Your password is::-- {password}</b></p>
      </div>
    </div>
  );
}





//generating a random password 
// import React from 'react'

// export default function Assign3_pass_gen({heading}) {
  
//     let gen=(length=8)=>{
//         // let characters = ["A","B","c","D"];
//         // let length = 123456789;
//         //     let data = "";
//         //     for(let i=0; i<length;i++){
//         //         data = data+ characters.charAt( Math.floor(Math.random()*characters.length));
//         //     }
           
//         //    // let total = data + char.random() ;          
//         //      console.log(data);
//         //      //console.log(total);
//         const chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?';
//   let password = '';
//   for (let i = 0; i < length; i++) {
//     const randIndex = Math.floor(Math.random() * chars.length);
//     password += chars[randIndex];
//     document.querySelector("b").innerHTML = password;
//   }
 
//         }
 

//   return (


    

//     <div>
//         <h6>{heading}</h6>
//         <label for="">Enter a  number length for password</label>
//         <input type="number"></input><br></br>
//         <button onClick={gen}> generate password</button>
//         <div className="display">
//             <p><b>Your pasword is::--</b></p>
//         </div>
      
//     </div>
//   )
// }
