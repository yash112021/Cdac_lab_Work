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
import FromViewToCompClass from './Assign4'
import Assign2counter from './day17/Assign2counter';
import Assign3_useEffect from './day17/Assign3_useEffect';
import Assign4_onBlur  from './day17/Assign4_onBlur';
import Assign2_loadJson from './day18/Assign2_loadJson';
import Assign3_pass_gen from './day18/Assign3_pass_gen';
import Assign4_forms from './day18/Assign4_forms';

import  PassGen_Callback from './Day19/PassGen_Callback';



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

        {/* day 16 */}
    {/* <Cal_Assign1/>
    <Grad_comp/>
      <Assign3/>
      <FromViewToCompClass/> */}


      {/* day 17 */}
       {/* <Assign2counter/>
      <Assign3_useEffect title="useEffect"/> 
      <Assign4_onBlur/>  */}


      {/* day18 */}
      {/* <Assign2_loadJson/>
      <Assign3_pass_gen agname={"password Generator Assign 3"}/>
      <Assign4_forms title={"Forms Assign 4"}/> */}

      {/* Day 19 */}
      < PassGen_Callback/>


  </React.StrictMode>

  
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
