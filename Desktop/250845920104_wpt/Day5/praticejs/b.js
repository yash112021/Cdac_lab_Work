console.log("To check whethter link or not");

// to Conditional Statements
// 1 if-else Statement
let age=14;
if(age>18){
    console.log("You are Eligble -->");
}
else {
    console.log("you are not Eligible");
}

let name="yash";
if(name=="yash"){
    console.log(`welcome to ${name} Js Tutorial `); // here we have used the template literal
}

// now we are going to traffic light System


let color="green";

if(color=="red"){
    console.log("Stop now ")
}
if(color=="yellow"){
    console.log("Slow Down")
}
if(color=="green"){
    console.log("Now you can Go");
}


// now we are going to see the else if statment
// in these we are only one part execute it will not check the other conditions
let m=45;
if(m>18){
    console.log("You are eligble for Voting");
}
else if(m>18){
    console.log("you can vote ")
}
else{
    console.log("your cannot vote or");
}


// now we will create a system like popcorn prices with their prices
let a="L";

if(a=="XL"){
    console.log(`The ${a} price is--> 250`);
}

else if(a=="L"){
    console.log(`The ${a} price is--> 200`);
}

else if(a=="M"){
    console.log(`The ${a} price is--> 100`);
}

else{
    console.log(`The ${a} price is--> 50`);
}



// now we are going to see the Nested if-else
let marks=95;
if(marks>33){
    console.log("you are passed");
    if(marks>80){
        console.log("Congraulation for Secouring A+")
    }
    else{
        console.log("B++");
    }
}
else{
    console.log("Better Luck Next Time ");
}


// now we are going to check whehter a string is a good string or not
// good string -->starts with a letter a or has length >3
let ame="ppple";
if(ame.length>3 && ame[0]==='a' ){
    console.log("Good String");
}
else {
    console.log("Bad String ")
}


// now we are going to see the truthy and falsy value 

// false 0,flase,-0,emptystring"",null undefined ,NaN
// true -->" " Everything

// now we are going to see the  switch case
let day=5;
switch(day){
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
        console.log("Saturdaty");
        break;
    case 7:
        console.log("Sunday");
        break;
    default:
        console.log("Invalid Input");

}




// now we are going to learn about the  alert and prompt 
// alert Msg Have ok But button with a window 


//alert("Somethnig went Wrong");
//alert("Hello to CDAC");

// a Dialog box with a MSG

//console.error("This is  a Error MSG"); // this will be on console
//console.warn("This is  a Warning MSG");// this will be on warning on console

// bascially prompt are used to take the input from the user

// code is working just uncomment it
//let aba =prompt("Enter your Name-->");
//let b =prompt("Enter your phone Number");

// console.log(aba);
// console.log(b);

// now a task take the firstname and lastname and concat it with and print
let fname=prompt("Enter the first Name");
let lname=prompt("Enter the Second Name");

// now performing the concat part
console.log(`Welcome to CDAC ${fname+lname} Hope that so that you are fine`)













