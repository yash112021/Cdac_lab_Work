
$(document).ready(function(){
    $("#b1").click(function(){
        $("#div1").animate({"left":250, "height":300,"opacity":0.7}, 1000)
        $("#div1").animate({"left":0, "height":200,"opacity":0.7}, 1000)
        $("#div1").animate({"left":250, "height":300,"opacity":0.7}, 1000)
        $("#div1").animate({"left":0, "height":200,"opacity":0.7}, 1000)
    })
})