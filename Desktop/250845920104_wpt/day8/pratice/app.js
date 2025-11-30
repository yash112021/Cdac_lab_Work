// now we are going to see the array Methods on we have seen the c 
// indexOf , and includs indexof will return us vlaue 1 ,-1 and includes return us the true and false
let cars=["bmw","mercedes","Mclaren","buggati"];
console.log(cars.includes("bmw"));
console.log(cars.includes("BMW"));

// now we are going to merge the array
let primary=["r","g","b"];
let secnodday=["ra","ga","ba"];

console.log(primary);
console.log(secnodday);
// merger the above two array
// concat method
console.log(primary.concat(secnodday));
primary.concat(secnodday);
console.log(primary);

// now we are going to performt the reverses with the help of the reverse method
primary.reverse();
console.log(primary)

let a=[52,12,35,63,25,26];
// now we are going to perform the reverse of the arrya
console.log("Initial array-->"+a)
a.reverse();
console.log("after reverse-->"+a);


// now we are going to see the array Methods like the slice,splice,sort Method 

let colors=["red","orange","yellow","green","black"];
// slice the array
console.log("before slice-->"+colors);
colors.slice(1);
console.log(colors);
console.log("after slice-->"+colors.slice(1));
console.log(colors)



// now we are going to see the splice Method
// it is all in one Method delete add slice
colors.splice(0,0,"nayan");
console.log("after performig the splice opt adding nayan-->"+colors);

// now adding the multiple elements in the n index
colors.splice(-2,0,"a","df","df");
console.log("after performig the splice opt adding nayan-->"+colors);

// now deleting the the 
console.log("delting 3 elemnts from 1 index");
console.log(colors);
colors.splice(1,3);
console.log("After deleting the colors arraty-->"+colors);
console.log(colors);





// now we are going to learn about the sort Methods
let days=["mon","tues","sun","satu","frida"];
// now performing the sort operations
console.log("before sort-->"+days);
days.sort();
console.log("after sort-->"+days);














