let data = "sample"
function call(){
    let myPromise = new Promise(function(myResolve, myReject){
       let x=0;
       if(x==0){
        console.log("ok");
         data =  ("https://jsonplaceholder.typicode.com/posts");
         myResolve(data);
       }
       else{
        console.log("error");
       }
    });
    myPromise.then(
        function(value){
            console.log("in then");
            // display(value);
            display(value);
        },
        function(error){
            console.log("error in then");
        });
    
}
let a=()=>{console.log(a);};
function display(a){
     console.log(a);
}