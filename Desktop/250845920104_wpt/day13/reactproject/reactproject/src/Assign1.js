//  1) Create Function Component  with parameters
//      	 a) Factorial ==  pass number as parameter 
//                   b) Calculator ==  pass 2 numbers as attribute 
//                         and display 

// 		addition , subtraction , division , multiplication 
// 	c) in point b  =  accept 1 more argument operation and then 
//                      display data for that operation only 

// in above assignments display output On Html Page 

// use state management 

import React, { useState } from 'react'

//   const ClickGetData = () => {
   
//     let output;

//     switch (inputs.operation) {
//       case 'add':
//         output = n1 + n2;
//         break;
//       case 'sub':
//         output = n1 - n2;
//         break;
//       case 'mul':
//         output = n1 * n2;
//         break;
//       case 'div':
//         output = n2 !== 0 ? n1 / n2 : 'Division by zero!';
//         break;
//       default:
//         output = 'Select operation!';
//     }
//     setResult(output);
//   };






export default function Assign1() {



    
let ClickGetData=(e)=> {
   console.log("You have click the button");
   const n1 = parseFloat(data.num1);
   const n2 = parseFloat(data.num2);
    setData({ ...data, [name]: value });
   console.log(n1, n2);
    
   let output;


};

    // const [ data, setData] = useState({num1})
      const [data, setData] = useState(0)
  return (
    <>
     <div>
      

      <label for="" >first Number</label>
      <input type="number" placeholder='Numebr' value={data.num1}></input>
      <br></br>
      <label for="" >second Number</label>
      <input type="number" placeholder='number' value={data.num2}></input>
         <br></br>
         <button input="submit" onClick={ClickGetData} >Calculate</button>




    </div>
    </>
  )

}