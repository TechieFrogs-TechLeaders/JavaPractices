
function validation() {
  
    document.getElementById("err").hidden = false; 
    document.getElementById("err").style.color ="red" ; 
    document.getElementById("hr").hidden = false;
    document.getElementById("hr").style.color = "red";
    document.getElementById("kr").hidden = false;
    document.getElementById("kr").style.color = "red";
    document.getElementById("ir").hidden = false;
    document.getElementById("ir").style.color = "red";   
    document.getElementById("rr").hidden = false;
    document.getElementById("rr").style.color = "red";
    document.getElementById("tr").hidden = false;
    document.getElementById("tr").style.color = "red";
    document.getElementById("cr").hidden = false;
    document.getElementById("cr").style.color = "red";  

 let x=document.getElementById("city").value;   
if (x==""){
    document.getElementById("x").innerHTML="city must be filled";
    document.getElementById("x").style.color="red"
}
let y=document.getElementById("PinCode").value;
if(y==""){
    document.getElementById("lr").innerHTML="pincode must be filled";
    document.getElementById("lr").style.color="red"
    document.getElementById("lr").hidden=false;
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
        
}                   