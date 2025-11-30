// now creating the animation effect
function name1(){
    let id =null
    let element1=document.getElementById("d1");
    let pos=0;
    id=setInterval(moveon,20);
    function moveon(){
        if(pos==400){
            clearInterval(id);
        }
        else{
            pos++;
           
            element1.style.top=pos+"px";
            element1.style.left=pos+"px";
        }
    
    }


          // making another functino for the div2
    let id2=null;
    let pos2=880;
    let z = 0;
    let element2=document.getElementById("d2");
     id2=setInterval(move,20);

    function move(){
        if(pos2==400){
            clearInterval(id2)
        }
        else{
            pos2--;
            z++;
            element2.style.top=z+"px";
            element2.style.left=pos2+"px";
        }
    }






}
name1();

// function name2(){

//     // making another functino for the div2
//     let id2=null;
//     let pos2=0;
//     let element2=document.getElementById("d2");
//      id2=setInterval(move,20);

//     function move(){
//         if(pos2==380){
//             clearInterval(id2)
//         }
//         else{
//             pos2++;
//             element2.style.bottom=pos2+"px";
//             element2.style.left=pos2+"px";
//         }
//     }

    
// }
// name2();