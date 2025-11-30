console.log("hii welcome to the Js Pratice");
// now we are going to explore the default paramters in js

// declare a function with a sum;
let ab=(a,b=10)=> a+b;

console.log(ab(2));  // here we have added only one paramter and the default paramter is taken
console.log(ab(2,5));

// now we are going to explore the Spread expand something into iterable
// (..arr) like these way

let arr=[20 ,56,78,45,12,12,1,2];
 console.log(Math.min(...arr)); // this will give us themin
// let str="yashpatil";
// function m((...arr)=>{
//     console.log(arr);
// });
// m();


let newarr=[...arr];   // it will make copy of the array]
let odd=[1,3,5,7,9];
let even=[2,4,6,8,10];
let com=[...odd,...even];
console.log(com);

// we can use the object literals in the case of the objects also

let data={
    email:"yp9447005@gmail.com",
    pass:"kjsdfn",
    age:23
}


// now copying the object into another one
let datacopy={...data,id:45,country:"india"};  //here we are adding the new properyt also 
console.log(datacopy);

// now we are making the array and converting it to the object we will take arr
let newarr1={...arr};
console.log(newarr1);   // now here the index becomes the key


//now we are going to use the rest concepty means it allows you take multiple input and then and then store the data


function ha(...argf){
    for(let i=0;i<argf.length;i++){
        console.log(argf[i]);
    }
}

ha(12 ,12,1,2,45,11,21,5,12,4,25);


//now we are going to see the destructting 

let name=["sdklfk","yash","spidernma","mtoto","dfkbnf"];
console.log(name);
let [winner,looser,...others]=name;

console.log(winner,looser,others);


// now we will see the destructing of the object
let student={
    name:"sandesh",
    lastnaem:"patil",
    age:20,
    gender:"male"
}

let usernmae=student.name;
let pass=student.lastnaem;
console.log(usernmae,pass);






