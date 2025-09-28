let adata=require('./math.js');  // now we have taken the proerty and stroe it int the vairable a
// now we will read the arguments from the user and perform the operations
let abgh=()=>{
    let arr=process.argv;  // reading all the arguments and stroring the array
        
    function juy(){   
        let a=arr[2];
        let b=arr[3];

                        
            console.log("addtion of two Numbers--> "+adata.mathe.add(2,5));
            console.log("subtratctino of two Numbers--> "+adata.mathe.sub(2,5));
            console.log("multiplication of two Numbers--> "+adata.mathe.mul(2,5));
            console.log("divide of two Numbers--> "+adata.mathe.div(2,5));

            console.log("program run succesfully");

    }
    juy();
}


abgh(); // call to the function