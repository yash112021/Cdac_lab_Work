//Ques. To Find max number from array write code in 3 ways as shown in lecture 


// 1......largest element by sorting method
//this will sort in ascending order and find largest element
let arr=[10,20,5,25,30]
function findlargest(arr){
    arr.sort((a,b)=>a-b);
    return arr[arr.length-1];
}
console.log("Largest element in array list is:", findlargest(arr));

//this will sort in descending order and find largest element
let arr2=[10,50,55,25,30]
function findlargest(arr2){
    arr2.sort((a,b)=>b-a);
    return arr2[arr2.length-5];
}
console.log("Largest element in array list is:", findlargest(arr2));

// 2..... Lrgest element by forEach method
let num=[25,89,65,45,10,89,96];
let largest = num[0];
num.forEach(function(max){
    if(max>largest){
        largest=max;
    }
});
console.log("The largest number is:" +largest);



