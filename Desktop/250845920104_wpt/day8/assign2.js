// in this code we are given the link of ajax and we have to get the data from there and display in the html format in the table form

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
            // now we are going to insert the data
            for(let i=0;i<data.length;i++){
                tablebodyl=tablebodyl+`<tr><td> ${data[i].id} </td><td> ${data[i].title} </td></tr>`;
                // tablebodyl+=tablebodyl;
            }
            

            // access the element and print it 
            document.getElementById("body").innerHTML=tablebodyl;

            })
    }

})