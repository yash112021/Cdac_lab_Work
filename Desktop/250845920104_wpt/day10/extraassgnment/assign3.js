// 3)   accept command line args input from user 
//  between 1 -  5 
//  if input is valid then display * pattern output 
 
//  if input is 3 then display
//  * * *
//  * *
//  *
//   if number is not other that 1 to 5 then throw the error 
//   and display error message 

function patter(){
     let a=process.argv[2];  
    if(a>=1&&a<=5){   // reading the input for the given condition
           
            for(let i=0;i<a;i++){
                let str="";
                for(let j=1;j<=a-i;j++){
                    str+="* ";
              
                }
                      console.log(str);
            }
            console.log("jkfdnhkjnh");
    }
    else{
        console.log("error")
    }

}
patter();

