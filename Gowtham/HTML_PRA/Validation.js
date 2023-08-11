
function validation() { 
let err=document.getElementById("FirstName")
if(err==""){
document.getElementById("err").innerHTML="first name must be filled"
document.getElementById("err").style.color="red"
}
let hr=document.getElementById("LastName")
if(hr==""){
document.getElementById("hr").innerHTML="Last name must be filled"
document.getElementById("hr").style.color="red"
}
let ir=document.getElementById("Email")
if(ir==""){
document.getElementById("ir").innerHTML="Email must be filled"
document.getElementById("ir").style.color="red"
}
let kr=document.getElementById("MobileNumber")
if(kr==""){
document.getElementById("kr").innerHTML="mobile number must be filled"
document.getElementById("kr").style.color="red"
}
let rr=document.getElementById("Adress")
if(rr==""){
document.getElementById("rr").innerHTML="Adress must be filled"
document.getElementById("rr").style.color="red"
}
let x=document.getElementById("city").value;   
if (x==""){
    document.getElementById("x").innerHTML="city must be filled";
    document.getElementById("x").style.color="red"
}
var y=document.getElementById("PinCode").value;
let code=/^[0-9]{6}$/;
if(!code.test(y)){
    document.getElementById("lr").innerHTML="pincode must be filled";
    document.getElementById("lr").style.color="red"
}
let cr=document.getElementById("State")
if(cr==""){
document.getElementById("cr").innerHTML="Adress must be filled"
document.getElementById("cr").style.color="red"
}
let tr=document.getElementById("Country")
if(tr==""){
document.getElementById("tr").innerHTML="Country must be filled"
document.getElementById("tr").style.color="red"
}


 
var val=false;
    if(document.getElementById("highschool").checked){
        val=true;
    }
    else if(document.getElementById("inter").checked){
    val=true;

    }
    else if(document.getElementById("college").checked){
    val=true;
    
    }
    else if(document.getElementById("university").checked){
        val=true;
        
    }
     else if(document.getElementById("phd").checked){
    val=true;

    }
    else{
    document.getElementById("checkbox").innerHTML="select a qualification";
    console.log("please enter qualification")
    document.getElementById("checkbox").style.color="red"
    }
    var cnn=document.getElementsByName("grad")
    var knn=false;
    for(let i=0;i<cnn.length;i++){
        if(cnn[i].checked){
            knn=true;
            break;
        }
    }
    if(!knn==true){
        document.getElementById("cap").innerHTML="please select a course";
        document.getElementById("cap").style.color="red"
    }
        
}                   
