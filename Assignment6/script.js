
var user = firebase.auth().currentUser;
// If the user is logged in or not
if (user) {
    // Logged In
    activateLoggedIn();
} else {
    // Logged Out
    activateLoggedOut();
}


var lnkLogOut = document.querySelector("#lnkLogOut");
var lnkLogIn = document.querySelector("#lnkLogIn");
var lnkSignUp = document.querySelector("#lnkSignUp");

lnkLogIn.addEventListener("click", function() {
    clearSections();
    sectionLogIn.style.display = "block";
});
lnkLogOut.addEventListener("click", function() {
    firebase.auth().signOut();
    activateLoggedOut();
});
lnkSignUp.addEventListener("click", function() {
    clearSections();
    sectionSignUp.style.display = "block";
});


// Sections
var sectionSignUp = document.querySelector("#signup"); 
var sectionLogIn  = document.querySelector("#login");  

// Action Buttons
var btnLogIn = document.querySelector("#btnLogIn");
var btnSignUp = document.querySelector("#btnSignUp");

btnLogIn.addEventListener("click", function() {
    var email = document.querySelector("#emailLogin").value;
    var pass = document.querySelector("#passLogin").value;
    if (email.length<6 || pass.length <6) {
        alert("Invalid login data");
    } else {
        // We are ok to login the user
        firebase.auth().signInWithEmailAndPassword(email, pass)
            .then(function() {
            	alert("logged in");
            	document.getElementById("userName").innerHTML = email;
                activateLoggedIn();
                clearSections();
            })
            .catch(function(error) {
                alert(error.message);
            })
    }
});

btnSignUp.addEventListener("click", function() {
    var name = document.querySelector("#name").value;
    var email = document.querySelector("#email").value;
    var pass = document.querySelector("#pass").value;
    var pass2 = document.querySelector("#pass2").value;
    if (name.length<3 || email.length<6 || pass.length<6) {
        alert("You need to enter your Full Name, E-mail address and password -6 characters min-");
    } else {
        if (pass!=pass2) {
            alert("Passwords must match");
        } else {
            // We are ok to register the user
            firebase.auth().createUserWithEmailAndPassword(email, pass)
                .then(function() {
                    // The user was registered
                    document.getElementById("userName").innerHTML = email;
                    alert("User registered");
                    clearSections();
                    activateLoggedIn();
                    var user = firebase.auth().currentUser;
                    user.updateProfile({
                        displayName: name
                    });
                })
                .catch(function(error) {
                    alert("We couldn't register the user. " + error.message);
                })
        }
    }
});


// Functions
function clearSections() {
    var sections = document.querySelectorAll("main>section");
    for (var section of sections) {
        section.style.display = "none";
    }
    var Calculator = document.querySelector("#Calculator");
    Calculator.style.display = "block";
}

function activateLoggedIn() {
   document.querySelector("#loggedIn").style.display = "flex";
   document.querySelector("#loggedOut").style.display = "none"; 
}

function activateLoggedOut() {
   document.querySelector("#loggedIn").style.display = "none";
   document.querySelector("#loggedOut").style.display = "flex"; 
}


function dis(val) { 
	document.getElementById("result").value+=val 
} 
			   
function solve() {  
	let y = eval(document.getElementById("result").value) 
	document.getElementById("result").value = y 
} 
		   
function clr() { 
	document.getElementById("result").value = "" 
} 
