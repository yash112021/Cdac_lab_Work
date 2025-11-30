// now we are going to display the timer with the hepl of the js


setInterval(displaytime,1000);

function displaytime(){
    // creating the object
    let d=new Date();
    document.getElementById("df").innerHTML=d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
}



