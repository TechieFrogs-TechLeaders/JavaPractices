function validation(){
    //First Name
    var fname=document.forms["myform"]["FirstName"].value.trim();
    if(fname == ""){
        //alert("City must be filled out");
        document.getElementById("name").innerHTML="Name must be filled out";
        document.getElementById("name").style.color="red";
        //return false;
    }
    //Last Name
    var lname=document.getElementById("lname").value.trim();
    if(lname == ""){
        //alert("City must be filled out");
        document.getElementById("error").innerHTML="Name must be filled out";
        document.getElementById("error").style.color="red";
        //return false;
    }
     //email
     var email=document.getElementById("emaile").value;
     let emailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
     if(!emailformat.test(email))
     {
      //alert("Valid email address!");
      document.getElementById("emailerr").innerHTML="Please Enter a valid email";
      document.getElementById("emailerr").style.color="red";
      //return false;
     }
     //Phone Number
    var num=document.getElementById("pnum").value;
    let phone=/^[0-9]{10}$/;
    if(!phone.test(num))
    {
     document.getElementById("phonenum").innerHTML="Please Enter a valid Mobile Number";
     document.getElementById("phonenum").style.color="red";
     //return false;
    }
    //Radio button Gender
    var gen=document.getElementsByName("gender");
    var gendernErr=false;
    for(let i=0;i<gen.length;i++){
        if(gen[i].checked){
            gendernErr=true;
            break;
        }
    }
    if(!gendernErr==true){
        document.getElementById("rgender").innerHTML="Please Select one Gender";
        document.getElementById("rgender").style.color="red";
    }
    //Address
    let add=document.forms["myform"]["Adress"].value.trim(); //(or)document.getElementById(---name).value //to check value is there and to get the value
    if(add == "") {
        //alert("City must be filled out");
        document.getElementById("adderr").innerHTML="Please enter your address";
        document.getElementById("adderr").style.color="red";
        //return false;
    }
    //city
    let x=document.forms["myform"]["City"].value.trim(); 
    if(x == "") {
        //alert("City must be filled out");
        document.getElementById("city").innerHTML="City must be filled out";
        document.getElementById("city").style.color="red";
        //return false;
    }
    //pin code
    let y=document.forms["myform"]["Pin Code"].value.trim();
    if(y==""){
       //alert("Pin Code must be filled out");
        document.getElementById("pincode").innerHTML="pin code must be filled out";
        document.getElementById("pincode").style.color="red";
        //return false;  (return is to stop the submission while using onsubmit without filling the fields and not required for onclick )
    }
    //State
    let country=document.forms["myform"]["State"].value.trim();
    if( country ==""){
        document.getElementById("stateerr").innerHTML="Field is empty Enter your current State";
        document.getElementById("stateerr").style.color="red";
        //return false;  
    }
    //Country
    let state=document.forms["myform"]["Country"].value.trim();
    if(state ==""){
        document.getElementById("countryerr").innerHTML="Field is empty Enter your current Country";
        document.getElementById("countryerr").style.color="red";
        //return false;  
    }
    //checkbox Hobbies
    var hobbie=document.getElementsByName("Drawing");
    var hobbiesErr=false;
    for(var i=0;i<hobbie.length;i++){
        if(hobbie[i].checked){
            hobbiesErr=true;
            break;
        }
    }
    if(!hobbiesErr==true){
        document.getElementById("hoo").innerHTML="Please select atleast one Hobbie";
        document.getElementById("hoo").style.color="red";
    }
    //checkbox Qualification
    var val=false;
    if(document.getElementById("high").checked){
        val=true;
    }
    else if(document.getElementById("school").checked){
        val=true;
    }
    else if(document.getElementById("graduate").checked){
        val=true;
    }
    else if(document.getElementById("post").checked){
        val=true;
    }
    else if(document.getElementById("phd").checked){
        val=true;
    }
    else{
       //alert("Please select atleast one Qualification");
       document.getElementById("checkbox").innerHTML="Please select atleast one Qualification";
       document.getElementById("checkbox").style.color="red";
       console.log("pls enter qual");
       //val=false;
    }
    
    //radio button Course
    var btn=document.getElementsByName("drown");
    var buttonerr=false;
    for(let i=0;i<btn.length;i++){
        if(btn[i].checked){
            buttonerr=true;
            break;
        }
    }
    if(!buttonerr==true){
        document.getElementById("radio").innerHTML="Please Select one course";
        document.getElementById("radio").style.color="red";
    }
   
    
    //Pin Code
    var pcode=document.getElementById("pin").value;
    let code=/^[0-9]{6}$/;
    if(!code.test(pcode))
    {
     document.getElementById("pincode").innerHTML="Please Enter a valid Pin Code";
     document.getElementById("pincode").style.color="red";
     //return false;
    }
   
    //dropdown day month year

    var daydropdown=document.forms["myform"]["dropdown"][0];
    var monthdropdown=document.forms["myform"]["dropdown"][1];
    var yeardropdown=document.forms["myform"]["dropdown"][2];
    console.log("dropdown "+daydropdown );
     if(daydropdown.value ==="none"){
        console.log("down");
        document.getElementById("date").innerHTML="Select Date";
        document.getElementById("date").style.color="red";
     }
     if(monthdropdown.value ==="none"){
        document.getElementById("month").innerHTML="Select month";
        document.getElementById("month").style.color="red";
    } 
    if(yeardropdown.value ==="none"){
        //console.log("down");
        document.getElementById("year").innerHTML="Select year";
        document.getElementById("year").style.color="red";
       }
      
}