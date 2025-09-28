

$(document).ready(function(){
    $("button").click(function(){
//    let a =  document.getElementById("user").checkValidity();
//     document.getElementById("pass").checkValidity();
    let a = $("#user");
    let b =  $("#pass");
    
    if(a[0].checkValidity()){
        let str = `<i><b><u>${a.val()}</u></b></i>`;
 let str1 = `<i><b><u> your password length is ${b.val().length}</u></b></i>`;

          $("#div1").html( str.concat(str1));
          $("#msg").html("");
        //   $("#div1").html(str1);
    }
    else{
      
        $("#msg").html("Please enter a valid value.").css("color", "red");
    }
    })
});



// $(document).ready(function(){
//     $("button").click(function(){
//         let a = $("#user");
//         let b = $("#pass");
        
//         if(a[0].checkValidity() && b[0].checkValidity()){
//             let str = `<i><b><u>${a.val()}</u></b></i>`;
//             let str1 = `<i><b><u> your password length is ${b.val().length}</u></b></i>`;
//             $("#div1").html(str + "<br>" + str1); // display both
//             $("#msg").html(""); // clear any previous error
//         } else {
//             $("#msg").html("Please enter a valid value.").css("color", "red");
//         }
//     })
// });