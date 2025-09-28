


// const stud={
//     fname:"",
//     lname:"",
//     age:""
// };



const stud={
    aFName:"",
    blname:"",
    clname:""
};
function submit(){
let aFName1=document.getElementById("fName").value;
let blname1=document.getElementById("lName").value;
let clname1=document.getElementById("age").value;

stud.aFName=aFName1;
stud.blname=blname1;
stud.clname=clname1;

console.log(stud);
console.log(JSON.stringify(stud))
let s=JSON.parse(JSON.stringify(stud))

// const stud={
//     aFName,
//     blname,
//     clname
// };



const table1= document.getElementById("d1");
const newRow = table1.insertRow(table1.rows.length);

newRow.insertCell(0).textContent= s.aFName;
newRow.insertCell(1).textContent = s.blname;
newRow.insertCell(2).textContent=s.clname;
//converting the students object to the json

const myJson = JSON.stringify(stud);
document.getElementById("jsonop").textContent = myJson;







//  const tableBody = document.getElementById("dataTable").querySelector("tbody")
//         const newrow = tableBody.insertRow();
//         newrow.insertCell(0).textContent = userData.fname;
//         newrow.insertCell(1).textContent = userData.lname;
//         newrow.insertCell(2).textContent = userData.age;



//reading data from the json file , first we will convert it into string format
const myFile=JSON.stringify(myJson);

let str = "";
for(const x in myFile){
    str += x + ",";
}






// let c=`firstname: ${aFName}  lastname: ${blname}  age:  ${clname}`;
// console.log(c);
}