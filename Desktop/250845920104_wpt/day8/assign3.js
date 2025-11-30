$(document).ready(function(){
    let ab=new XMLHttpRequest();  // this line is for creating the object
    ab.open("GET","https://jsonplaceholder.typicode.com/posts"); //this line is to set the path and the location 
    ab.send();   //for sending purpose
  
    ab.onload=function(){    //event is being handle by the function and it shold be writeen as it is
       
   //converting the jsonf file into object
        // now here they not given us the file instead of that link so will use
        var data = JSON.parse(ab.responseText); // if link then you should type like this
         //  $("#p1").text(data);
            $("button").click(function(){
            let tablebodyl;
                       let ip =parseInt($("#ip").val());   ///reading the id from the user

            // for(let i=0;i<data.length;i++){
            //     tablebodyl=tablebodyl+`<tr><td> ${data[i].id} </td><td> ${data[i].title} </td></tr>`;
            //     // tablebodyl+=tablebodyl;
            // }

             // now we are going to insert the data
            let abc =`<tr><td> ${data[ip-1].userId} </td><td> ${data[ip-1].id} </td><td> ${data[ip-1].title} </td><td> ${data[ip-1].body} </td></tr>`;
            
            // access the element and print it 
            document.getElementById("id1").innerHTML=abc;

            })
    }

})