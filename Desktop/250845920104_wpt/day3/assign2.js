// Write a Program to use Different Array Library Functions using switch case

let a=["yash" ,48, 65, 52 ,"nayan","shubham" ];

console.log(a);
console.log("****************");
console.log("Enter your choice: 1=push, 2=unshift, 3=shift, 4=pop, 5=replace");
let z=1;

switch (z) {
    case 1:
        console.log("please Enter the element to perform the push method (it will added in the end):");
        let usr=45;
        a.push(usr);
        console.log(a);
        
        break;
    case 2:
         console.log("please Enter the element to perform the unshift method (it will added in the start):");
        let l=100;
        a.unshift(l);
                console.log(a);
        break;
    case 3:
       console.log("rmemove element form the first index with the help of shift")
             a.shift(); 
                console.log(a);
        
        break;
    case 4:
         console.log("rmemove element form the last index with the help of pop")
         a.pop(); 
                console.log(a);
        
        break;
    case 5:
        console.log("we are removing replacing the element -->")
        let o=3,m=1;
        a.splice(o,m); 
                console.log(a);
        
        break;

    default:
        break;
}
