console.log("Hello world");


//reading the data

function validate(){
        let a = document.getElementById("fname").value;
        let b = document.getElementById("Lname").value;
        let c = document.getElementById("emailId").value;
        let d = document.getElementById("DOB").value;


        let table = document.getElementById("t1");
        let newRow = table.insertRow(table.rows.length);


        newRow.insertCell(0).innerHTML=a;
        newRow.insertCell(1).innerHTML=b;
        newRow.insertCell(2).innerHTML=c;
        newRow.insertCell(3).innerHTML=d;
        newRow.insertCell(4).innerHTML=
        '<button onclick="editData(this)">Edit</button>' + '<button onclick="deleteData(this)">Delete</button> ';


        //clear inputs
        function clearData(){
            document.getElementById("fname").value= "";
            document.getElementById("Lname").value= "";
            document.getElementById("emailId").value = "";
            document.getElementById("DOB").value = "";
        }
         clearData();

         
}

//edit data button
         function editData(button){
            //we are accessing the location of the button
            let row = button.parentNode.parentNode;

            //we are taking the previous data and inserting it into the new variable
            let fnamecell = row.cells[0];
            let lnamecell = row.cells[1];
            let emailcell = row.cells[2];
            let dobcell = row.cells[3];
            
            //taking input from user using prompt and showing the previous data
            let l= prompt("Write the updated data for firstname", fnamecell.innerHTML);
            let m= prompt("Write the updated data for lastname",lnamecell.innerHTML);
            let n= prompt("Write the updated data for emailid", emailcell.innerHTML);
            let o= prompt("Write the updated data for DOB", dobcell.innerHTML);

            //updating the new data that has been collecting from prompt
            fnamecell.innerHTML = l;
            lnamecell.innerHTML = m;
            emailcell.innerHTML = n;
            dobcell.innerHTML = o;
         }

         function deleteData(button){
            let row = button.parentNode.parentNode;

            row.parentNode.removeChild(row);
         }








