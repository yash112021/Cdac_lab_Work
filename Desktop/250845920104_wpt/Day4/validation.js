// validation the data by making the js file and with the help of the function
function validate()
{
    console.log("validate ")
   var name=document.forms["form"]["stdname"].value;
var age=document.forms["form"]["age"].value;
console.log(name,age);
if(name.trim()==""){
    document.getElementsByClassName("ErrorMSg")[0].style.visibilty="visible";
}
else{
    document.getElementsByClassName("ErrorMSg")[0].style.visibilty="hidden";
}
}

