$(document).ready(function(){
    $("button").click(function(){
        let z=parseInt($("#inpul").val());  // reading of the data
        function na(pq){
            if(pq==0||pq==1){
                return 1;
            }
            return pq*=na(pq-1);
            
        }  
        let a = na(z);
        console.log(a);
       
    });
    
});
