function display(){
        let read=new XMLHttpRequest();
        read.open("GET","helo.txt");
        read.send();
        read.onload=function(){
            console.log(this.responseText);
        }
    }



// function display(){
//         $(document).ready(function (){
//     $("button").click(function(){
//         let read=new XMLHttpRequest();
//         read.open("GET","helo.txt");
//         read.send();
//         read.onload=function(){
//             $("#dis").val(this.responseText);
//         }
//     })
// })
// }
