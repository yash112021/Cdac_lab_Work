// 4) Write a Node program that prints all the numbers between 1 and 100, each on a separate line.
// A few caveats:
// o if the number is divisible by 3, print "foo"
// o if the number is divisible by 5, print "bar"
// o if the number is divisible by both 3 and 5, print "foobar"
function conditi(){
    for(let i=1;i<=100;i++){
        if(i%3==0 && i%5==0){
            console.log(`${i}--->"foobar"`);
            
        }
        else if(i%3==0){
            console.log(`${i}-->"foo"`);
            
        }
       
        else if(i%5==0){
            console.log(`${i}--->"bar"`);
            
        }
        else{

        }
    }
}

// call to function 
conditi(); 