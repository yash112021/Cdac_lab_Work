function move(){
    let id = null;
    const element=document.getElementById("d1" );
        let pos  =0;
        id = setInterval(frame,30);
        function frame(){
            if(pos==350){
                clearInterval(id);
            }
            else{
                pos++;
                element.style.position = "absolute";
                element.style.top=pos+ "px";
                element.style.left = pos + "px";
            }
        }
}
// console.log("Hii");