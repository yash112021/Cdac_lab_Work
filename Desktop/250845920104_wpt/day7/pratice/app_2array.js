// now we are going to learn array in the js
// declarin the student array
let students=["yash","Shradda","Nayan"];

console.log("this is our array-->  "+students);
console.log("zero index data-->"+students[0]);
console.log("first index data-->"+students[0]);
console.log("second index data-->"+students[0]);

// now we can calculate the length also  of the array

console.log("Length of the array students-->"+students.length);

// now we explore to create the array by different ways
let marks=[58,65,78,89,98]; // marks

//now array of different datatype this only possible in js
let info=["yash",56,89.99];
console.log("Mix data--> in the array  "+info);


// now we can declare the empty array also
let empty4=[];
// accesing the empty array
console.log(empty4[8]);  /// you will get the undefinec

// now acessing the two value inner value like


console.log(students);
console.log("Zero Index Value--> "+students[0]);
console.log("Zero Index Value(and the value zero index)--> "+students[0][0]);
console.log("Zero Index Value(and the value first index)--> "+students[0][1]);


// now we are going to see the concept of array are mutable
// whenver the changes get reflected in the original one

let fruits=['mango','apple','pineapple','litchi'];
console.log("Orignal  array printing of the fruits array--> "+fruits);

fruits[0]="watermelon";
console.log("printing of the fruits array--> "+fruits);

fruits[1]="pineapple";
console.log("printing of the fruits array--> "+fruits);


// now we can store at some index also by lefting the some spaces
fruits[10]="helloworld";
console.log("printing of the fruits array--> "+fruits);

console.log("findding the array length-->"+ fruits.length)



// now performing the array  operations
// push pop shift unshift 


// now we will create the cars array and perform the operations
let cars=["Audi","BMW","MClaren","Bugati"];
console.log(cars);
cars.push("totoyat"); // push method add at the end
console.log("Toytao has being pushed -->"+cars);

// pop method remove element from  the last
cars.pop();
console.log("last element from the cars has being popped -->"+cars);

cars.pop();
console.log("last element from the cars has being popped -->"+cars);

// now adding the element form the start unshift method
cars.unshift("nano");
console.log("Nano has being added in the first of the cars array-->"+cars);

cars.unshift("mercedes");
console.log("Nano has being added in the first of the cars array-->"+cars);

// now deleting the element from the the start
cars.shift();
console.log("now deleteing the cars element from the pop-->"+cars);
cars.shift();
console.log("now deleteing the cars element from the pop-->"+cars);



// now we are going to solve the pratice question-->
// start-> jan,july,march,august
// finaloutput-> july,june,march,august

let month=["jan","july","march","august"];
console.log("before-->"+month);
// first we need to pop two elements from the start and add the elements
month.shift();
month.shift()


month.unshift("june");
month.unshift("july");
console.log("after-->"+month);


// Array Method  
// ..1
// now in array also there is indexof Method
console.log(cars);
// if found then index element or -1
console.log(cars.indexOf("mercedes"));  //-1 not found
console.log(cars.indexOf("BMW"));  //1  found

console.log(month.indexOf("august"));  //3  found

// 2.. includes it will return true or false
let colors=["red","blue","green"];
console.log(colors.includes("red"));  // it will return true 
let b=colors.includes("ghgkdk");
console.log(b);


// 3.. concatation of two array
let a=[1,2,2,45,89,556];
let ab=[11,22,33,44,55,66,77,88,99];


// pe











































