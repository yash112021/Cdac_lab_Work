// 4)Accept 10 munbers  from Command Line Args and store in array 
//   then display 
//   1) addition of even numbers only 
//   2) addition of even index numbers
//   3) addition of prime numbers 

function Array(){
    // let a =  Process.argv;
    let arr=[];
     let sum = null;
        let sumevenindex = 0;

  for(let i=0; i<10;i++){
    arr[i]=process.argv[i+2];
  }
  for(let i=0; i<10;i++){
   console.log(`Array elements. Index no. ${i}-->${arr[i]}`);
  }

//function for addition og even numbers
function AddEven(a){
    //    for(e of a){
    //     if(e % 2 ==0){
    //         sum = sum + e;
    //     }
    //     return sum;
    //    }

   for(let i=0;i<a.length;i++){
        if(a[i]%2==0){
            sum= sum + parseInt(a[i]);
        
        }
   }
      console.log("Sum of arr = ", sum);
   
   
}


// function for addition og even index NUmbers
    function AddEvenindexNO(a){
        for(let i=0;i<a.length;i++){
                if(i%2==0){
                    sumevenindex += parseInt(a[i]);
                }
        }
        console.log("sum of even index array-->" +sumevenindex);
}
// //function for addition og even numbers
// function AddEven(a){
//     let sum = 0;
//    for(e of a){
//     if(e % 2 ==0){
//         return sum+=e;
//     }
//    }
// }
//

 AddEven(arr);
console.log("Addition of even index numbers  in the array is "+ AddEvenindexNO(arr));
 
}
 Array();
 