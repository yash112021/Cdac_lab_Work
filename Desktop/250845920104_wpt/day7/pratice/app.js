// now we are going to perform the String operations
// 1.. method String Trim
let a="    yash  patil     ";
let b="   hello world  ";

// now on the above string we are going to perform the string operations
console.log(a.trim());
console.log(b.trim());

// we have perfomr the trim operations

// now take ninput from the user with the helpf of the promp and take the input diplay with the help of alert
// let ab=prompt("Enter your name ");]
let ab="yashpatil";
console.log("before trim -->",ab);
console.log("after trim -->",ab.trim());

//2.. now we are going to see the uppper case
console.log(ab.toUpperCase());

//3.. now we are going to see the lower case
console.log(ab.toLowerCase());

let name="ApnaCollege";
let error="Hello";


console.log(error.toUpperCase());

// now  we are going to see the string operations with the parameter one]


// 4..indexof {now this will return us the index or negative -1 if not found}
let str="ILoveCoding";
let abc=str.indexOf('z');
let template=`we are retun the the index for lo--> ${abc} `;
let template1=`we are retun the the index for Coding--> ${str.indexOf("Coding")} `;
console.log(template);
console.log(template1);


// now we will see about the method chaining
 //5 .. Method chaining  the tern method chaining means implementing the multiple method at one time

 let msg="         Welcome to IET     ";
 // performing the method chaining
 let newMsg=msg.trim().toUpperCase();
 console.log(newMsg);

//  in above approach we are going from left to right


// now we are going to see the slic method
// 6.. slice (means cutting the string)  varname(strtindex,endindex);

let str5="welcometocdac";
console.log(str5.slice(0,6));

// if we will give only one value  the from that value the remaing part will  get pringt


console.log(str5.slice(3));

// we can aslo pass the neagative value and length
console.log("String length->"+str.length);
console.log("when we pass the (string length-3)-->"+str5.slice(str5.length-3));
console.log("When we pass the Neagative value(-2)-->"+str5.slice(-2));


// now we are going to see the replace method
//7.. replace Method


let str6="Rohit";
let new1=str6.replace('R','M');
console.log("Repalce of the String rohit with mohti-->"+new1);


let an="IloveCoding";
console.log("Succesfully replaced-->"+an.replace("love","do"));


//8.Repeat Method now suppose i want to repeat the string multiple then Repeat Method


let str9="mango  ";
console.log(str9.repeat(4));  // the mango will print 4 times;



// now we will solve the pratice Question
// repalce the ourcollege to ourcottege

let str7="ourcollege";
console.log(str7+" to "+str7.replace('l','t').replace('l','t'));






























