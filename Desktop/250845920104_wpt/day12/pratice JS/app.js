//  now we are going to see the "This Keyword int the Javascript"


// this keyword refers to an object that is executing the current piece of the code

const stude={
    name:"yash",
    age:23,
    math:92,
    phy:56,
    chem:59,
    getavg(){(this.math+this.phy+this.chem)/3;   // here in this we cannot access directlyt the value
    console.log(`${this.name}---> got the avg marks ${getavg}` )
    }

}

stude;
console.log(stude.getavg);

function getavg(){
    console.log(this)
}
// we will see the try and catch block here


console.log("hello");
console.log("hello");
console.log("hello");
try{
console.log(a);  // after this remainin part of the code will not work so will handle this }}with the help of the try and  catch
}catch(e){
    console.log("Error Occured-->");
}
console.log("hello");


// now we are going to see the arrow functions
// syntx 
// const fun= (arg1,arg2)=>{function definition}


// now we will make the function for the add]
let a=(a,b)=>{console.log((a+b))};

console.log(a(56,3));

// now making the arrow for cube and power
let cube=a=> console.log(a*a*a);
console.log(cube(5));

let pow=(a,b)=> console.log(a**b);
pow(2,3);

// but when we have single argument the parathesis compulsory

// when we want to return a single there is no need of typing the return keyword
// mul fucntion
let mul= (a,b) => a*b;
console.log(mul(5,5));

// now we are going to see the timeout function
// after a certain time that think is going to happen
console.log("sdjkfjkf");
// setTimeout(()=> (console.log("hello world"),2000));
// setTimeout(()=> (console.log("yash patil"),2000));
console.log("sdjkfkdn");


// // now the setInterval
// let ag=setInterval(()=> console.log("Apna Cllg"),2000);
// // now the above thing has being started now we need to stop this so record this in a variable
// setTimeout(()=>clearInterval(ag),10000);

console.log("djkfjkdbn");

// now we are to see this keyword with arrow fucntion
const stude1={
    name:"delliop",
    age:23,
    prop:this,
    getName:function(){
        return this.name;
    },
    getmarks:()=>{
        console.log(this);
        return this.marks;
    }
} 


// now using the getname method of the student 
console.log(stude1.getName());
console.log(stude1.getmarks());

console.log("write an array fucntion to find the squrar");
// pratice que 01
let sq=n=> n*n;
console.log(sq(4));
//pratice que02
// write a fucntion to print a hellowordk 7 times and the stop it after time
let id =setInterval(()=>console.log("yash patil"),2000);
setTimeout(()=>clearInterval(id),14000);























