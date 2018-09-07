
function validateEmail(){
	var email = document.forms["register"]["Email"].value;
	var atPosition = email.indexOf("@");
	var dotPosition = email.indexOf(".");


	if(atPosition<1 || dotPosition<atPosition+2 || dotPosition+1>=email.length){
		document.getElementById("Email").style.borderColor = "red";
		document.getElementById("Email").style.backgroundImage ="url('images/wrong.jpg')";
		document.getElementById("Email").style.backgroundImageRepeat ="noRepeat";
		document.getElementById("Email").style.backgroundImagePosition = "right";

	}
	else{
		document.getElementById("Email").style.borderColor = "green";

	}
	
}


