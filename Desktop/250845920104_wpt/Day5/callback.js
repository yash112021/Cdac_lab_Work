// using of the callback fuction
let num1=0;
let num2=0;
let result=0;
// making of another function
function res(some){
    document.getElementById("hh").innerHTML=some;
}
function accept(){
 num1=document.getElementById("one").value;
num2=document.getElementById("two").value;


}
// for addition
function add(hello){
    accept();
    result=parseInt(num1)+parseInt(num2);

    hello(result);  //callback function
}
function sub(hello){
    result=num1-num2;

    hello(result);
}
function div(hello){
    result=num1/num2;

    hello(result);
}
function mul(hello){
    result=num1*num2;

    hello(result);
}


function calcualte(){

}
