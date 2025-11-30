

$(function(){
    $("#btn1").click(()=>{
        $("#div1").slideDown(1000);
    })
    // This is for slide down the div
    
    
    $("#btn2").click(()=>{
        $("#div1").slideUp(1000);
    })
     // This is for slide up the div


    $("#btn3").click(()=>{
        $("#div1").slideToggle(1000);
    })
     // This is for slide up the div

})