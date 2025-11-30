// 1) Create Function Component  with parameters
//      	 a) Factorial ==  pass number as parameter 
//                   b) Calculator ==  pass 2 numbers as attribute 
//                         and display 

// 		addition , subtraction , division , multiplication 
// 	c) in point b  =  accept 1 more argument operation and then 
//                      display data for that operation only 
import React from 'react';

function Factorial({ number }) {
  const fact = (n) => (n <= 1 ? 1 : n * fact(n - 1));
  return <p>Factorial of {number}: {fact(number)}</p>;
}

function Calculator({ num1, num2 }) {
  return (
    <div>
      <p>Add: {num1 + num2}</p>
      <p>Sub: {num1 - num2}</p>
      <p>Mul: {num1 * num2}</p>
      <p>Div: {num2 !== 0 ? num1 / num2 : "Err"}</p>
    </div>
  );
}

function SingleOpCalc({ num1, num2, op }) {
  const result = op === "add" ? num1 + num2 :
                 op === "sub" ? num1 - num2 :
                 op === "mul" ? num1 * num2 :
                 op === "div" ? (num2 !== 0 ? num1 / num2 : "Err") :
                 "Invalid";
  return <p>{op} result: {result}</p>;
}

export default function App() {
  return (
    <div>
      <Factorial number={5} />
      <Calculator num1={10} num2={2} />
      <SingleOpCalc num1={10} num2={2} op="mul" />
    </div>
  );
}
