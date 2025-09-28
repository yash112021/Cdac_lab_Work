// Javascript Tutorial Pefroming it  reading the data from the user by using the Jquery
$(document).ready(function(){

    $("button").click(function(){
    
     $("#display").load("data.txt"); // code loading the data from the file 
     $("#display1").load("https://jsonplaceholder.typicode.com/posts"); // code loading the data from the the url

    })
})