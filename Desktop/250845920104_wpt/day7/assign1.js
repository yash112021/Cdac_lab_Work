

$(document).ready(function(){
    $("button").click(function(){
        let a = $("#field").val();
           $("#p1").html("para1-->"+'<i>'+a+'</i>');
        //    $("#p1").html("para2-->");
           $("#p2").html("para3-->"+'<u>'+a+'</u>');
    })
    

})
console.log("hello");