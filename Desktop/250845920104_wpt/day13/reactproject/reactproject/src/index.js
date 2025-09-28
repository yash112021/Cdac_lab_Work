import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import Hello from './App';
import Project1 from './project1';
import reportWebVitals from './reportWebVitals';
// import Factorial_assign1 from './Factorial_assign1';
import Calculator from './Factorial_assign1';
import ComponentExample from './ClassCompo_assign3';
import Factorial from './Factorial_assign1'
import { Header, Content, Footer } from "./Components_assign2";
// import Assign1 from './Assign1';
import Cal_Assign1 from './Cal_Assign1';
import Grad_comp from './Components/Grad_comp';
import Assign3 from './Components/Assign3';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
   {/* <Factorial num="5"></Factorial> */}
    {/* <Calculator num1="10" num2="20"></Calculator>1 */}
{/* <Factorial_assign1/> */}
 {/* <Hello /> *1/}
{/* <ComponentExample/1> */}
    {/* <Project1 /> */}
    {/* 
     <Header />
    <Content />
    <Footer />
    <Hello/>*/}
    {/* <Assign1/> */}
    <Cal_Assign1/>
    <Grad_comp/>
      <Assign3/>
  </React.StrictMode>

  
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
