var Tstorage = '{' + 
                '"employees" :' +
                            '[' +
                                '{ "name":"Shivani" , "dob":"19/11/1998" , "sex":"Female" },' +
                                '{ "name":"Shreya" , "dob":"31/1/1999" , "sex":"Female" },' +
                                '{ "name":"Riya" , "dob":"25/06/2000" , "sex":"Female" },' +
                                '{ "name":"Shambhavi" , "dob":"06/13/2003" , "sex":"Female" }' +
                            ']' +
           '}';

var storage = JSON.parse(Tstorage);

var lnkAdd = document.querySelector("#lnkAdd");
var lnkShow = document.querySelector("#lnkShow");
var lnkFind = document.querySelector("#lnkFind");

lnkAdd.addEventListener("click", function() {
    clearSections();
    sectionAdd.style.display = "block";
});
lnkShow.addEventListener("click", function() {
   clearSections();
   sectionShow.style.display = "block";
    var tbody = document.querySelector("#showEmployees tbody");
    tbody.innerHTML = "";
    var x;
    for(x=0 ; x<storage.employees.length ; x++){
        var tr = "<tr>";
         tr+= "<th scope='"+"row"+"'>"+(x+1)+"</th>";
         tr+= "<td>"+storage.employees[x].name +"</td>";
         tr+= "<td>"+storage.employees[x].dob+"</td>";
         tr+= "<td>"+storage.employees[x].sex+"</td>";
         tr+= "</tr>";
         tbody.innerHTML += tr;
    }

});
lnkFind.addEventListener("click", function() {
    clearSections();
    sectionFind.style.display = "block";
});


// Sections
var sectionAdd = document.querySelector("#addEmployee"); 
var sectionShow  = document.querySelector("#showEmployees");
var sectionFind  = document.querySelector("#findEmployee");

// Action Buttons
var btnAdd = document.querySelector("#Add");
var btnFind = document.querySelector("#Find");

btnFind.addEventListener("click", function() {
    var name = document.querySelector("#fname").value;
    var tbody = document.querySelector("#findEmployee tbody");
    var error = document.querySelector("#findEmployee h3");
    error.innerHTML = "";
    tbody.innerHTML = "";
    var found = false;
    var x = 1
    for(var employee of storage.employees){
        if(employee.name == name){
         var tr = "<tr>";
         tr+= "<th scope='"+"row"+"'>"+x+"</th>";
         tr+= "<td>"+employee.name +"</td>";
         tr+= "<td>"+employee.dob+"</td>";
         tr+= "<td>"+employee.sex+"</td>";
         tr+= "</tr>";
         tbody.innerHTML += tr;
         found=true;
         x+=1;
        }
     
    }
    if(!found){
        error.innerHTML = "The employee with name " + name + " does not exist."    
    }
});

btnAdd.addEventListener("click", function() {
    var name = document.querySelector("#name").value;
    var dob = document.querySelector("#dob").value;
    var sex = document.querySelector("#sex").value;
    if (name.length<3) {
        alert("You need to enter your Full Name");
    } else {
       storage.employees.push({"name":name , "dob":dob , "sex":sex , "salary":salary});  
    }
});


// Functions
function clearSections() {
    var sections = document.querySelectorAll("main>section");
    for (var section of sections) {
        section.style.display = "none";
    }
    var tbody = document.querySelector("#findEmployee tbody");
    var error = document.querySelector("#findEmployee h3");
    error.innerHTML = "";
    tbody.innerHTML = "";
}