
// 1) declare function calculate(...a) 
// 	and display addition of data 
// 	display only odd numbers from given data 

//   call calculate function with multiple parameters 


function calculate(...a){
    let sum=0;
     for(let i=0;i<a.length;i++){
        sum=sum+a[i];
        if(a[i]%2!=0){
            console.log(a[i]);
        }
        
     }
     console.log("Addition of numbers are: "+ sum);

}
calculate(10,30,24,3,7);
calculate(10,30,24,6,5,7,1,9);
