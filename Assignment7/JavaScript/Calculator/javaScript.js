function fun(){
	
	var a,numb1,numb2;
	numb1=Number(document.getElementById('num1').value);
	numb2=Number(document.getElementById('num2').value); 
	
	if(document.getElementById('a').checked){
		an=numb1+numb2;
	}else if(document.getElementById('s').checked){
		an=numb1-numb2;
	}else if(document.getElementById('m').checked){
		an=numb1*numb2;
	}else{
		an=numb1/numb2;
	}
	document.getElementById('k').innerHTML=an;
} 