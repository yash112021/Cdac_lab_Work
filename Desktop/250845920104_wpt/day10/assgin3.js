
// 3) Write a recursive function in Node.js to print factorial of number 

// number accept by command line Args

function recordArgu(){
    

         console.log("Arguments Recorded-->",process.argv);
        //  accepting the element
        let a=process.argv[2];
        let sum=1;
        function fact(a){
            for(let i=1;i<=a;i++){
                 sum=sum*i;
            }
            return sum;
        }

        // call to  the function
        console.log(`factorial of the first argument is -->`+fact(a));
   

}

// call to function   
recordArgu();
