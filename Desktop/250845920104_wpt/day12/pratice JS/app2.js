// now we are going to see the more array Methodsl
let arr1=[1,2,4,23 ,123,354,214];
// now by using the foreact loop printing those things
 
let print=function (el){
    console.log(el);
}
arr1.forEach(print);

arr1.forEach((el)=> console.log(el))

// we can user thisfor object also 
let arr=[{
    name:"shraddha",
    age:30,
    marks:50
},{
     name:"nayan",
    age:30,
    marks:60
}]

arr.forEach((mn)=> console.log(mn));

// now we are going to see the Map function
// it will give us the new array but with the updation same like the foreach]

// now we will take the above array and try double it 
let dou=arr1.map(el=> el*2);
console.log(arr1);
console.log(dou);
// we can magic type of js 
console.log("finding the square-->");
let sqaure=arr1.map(el=> el*el);
console.log(arr1);
console.log(sqaure);

// console.log("your")

// now we are calcuating the cgpa of studen
let arrg=[{
    name:"shraddha",
    age:30,
    marks:57
},{
     name:"nayan",
    age:30,
    marks:98

}]


let cgpa=arr.map((el)=> el.marks/10);
console.log(cgpa);


// now we are going to see the filter the one that is true that will come outside and reamining will remain there only

let ar=[12,11,15,78,56,82,85,15,35,9,57,53,101];
// now from the above array we want the only numbers so we will use the filter method
let even=ar.filter((el)=> (el%2==0));
console.log(ar);
console.log(even);
console.log("now for the odd->");
let odd=ar.filter((el)=> (el%2!=0));
console.log(odd);

// now we are going to see the every fucntion
let everfun=ar.every((el)=> el<=100);
console.log(everfun);
let everfun1=ar.every((el)=> el>=100);
console.log(everfun1);

// now we are going to see the reducer fucntion  means it reduce the value also and give us the output also

let ar8=[12,11,15,78,56,82,85,15,35,9,57,53,101];
let b=[1, 2  ,3 ,4].reduce(((res,el)=>res+el));
console.log(b);

// to find the maximum element 
let a=[12,68,45,35,02];
let bmax=a.reduce((el,al)=> {
    if(el>al){
        return el;
    }
    else{
        return al;
    }
    })

    console.log(a+" -->max element is "+bmax);


// to solver pratice question to check in the array-->
// check if they are multiples are not
console.log([10,30,22].every((el)=> el%10==0));
console.log([10,30,20].every((el)=> el%10==0));

// to find the miniumn  form the array
let bmin=a.reduce((el,al)=>{
    if(el<al){
        return el;
    }else{
        return al;
    }
})
console.log(a+" minimum from the array is--> "+bmin);

// now we are going to see the default opar






