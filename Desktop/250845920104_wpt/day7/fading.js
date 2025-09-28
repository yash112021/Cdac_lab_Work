// $(documnet).ready(function(){
//     $("btn1").click(function(){
//         $("div1").fadeIn();
//     })
// })


$(function(){
    $("#btn1").click(()=>{
        $("#div1").fadeIn();   //for display the div
    })

    $("#btn2").click(()=>{
        $("#div1").fadeOut(500);  //for hiding the div
    })

     $("#btn3").click(()=>{
        $("#div1").fadeToggle(500);  //for both hide and display
    })
})