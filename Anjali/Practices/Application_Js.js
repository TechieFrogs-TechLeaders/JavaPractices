function application(){
    //First Name
    var fname=document.forms["myform"]["fname"];
    if(fname.value == ""){
        document.getElementById("firstname").innerHTML="First Name is empty please fill it";
        document.getElementById("firstname").style.color="red";
        fname.style.borderColor = "red";
       // document.getElementById("firstname").textbox.style.borderColor = 'green';
        //return false;
    }
    //last Name
    var lname=document.forms["myform"]["lname"];
    if(lname.value == ""){
        document.getElementById("name").innerHTML="Last Name is empty please fill it";
        document.getElementById("name").style.color="red";
        lname.style.borderColor = "red";
        //return false;
    }
     //Phone Number
     var num=document.getElementById("pnum");
     if(num.value==""){
        document.getElementById("phonenum").innerHTML="Mobile Number is empty please fill it";
        document.getElementById("phonenum").style.color="red";
        num.style.borderColor = "red";
     }
     else{
        let phone=/^[0-9]{10}$/;
        if(!phone.test(num))
        {  
            document.getElementById("phonenum").innerHTML="Please Enter a valid Mobile Number";
            document.getElementById("phonenum").style.color="red";
            num.style.borderColor = "red";
            //return false;
        }
    }
    //Fax
    var fax=document.getElementById("faxid");
    if(fax.value ==""){
       document.getElementById("faxing").innerHTML="Fax field is empty please fill it";
       document.getElementById("faxing").style.color="red";
       fax.style.borderColor = "red";
    }
    else{
       let faxnum=/^[\d- ]*$/;
       if(!faxnum.test(fax))
       {  
           document.getElementById("faxing").innerHTML="Please Enter a valid Fax Number";
           document.getElementById("faxing").style.color="red";
           //return false;
       }
   }
     //email
     var email=document.getElementById("email").value;
     if(email==""){
        document.getElementById("emailerr").innerHTML="Email is empty please fill it";
        document.getElementById("emailerr").style.color="red";
     }
     else{
        let emailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
        if(!emailformat.test(email))
        {
            document.getElementById("emailerr").innerHTML="Please Enter a valid email";
            document.getElementById("emailerr").style.color="red";
            //return false;
        }
    }
    //company Name
    var cname=document.forms["myform"]["company"].value.trim();
    if(cname == ""){
        document.getElementById("cname").innerHTML="Company Name is empty please fill it";
        document.getElementById("cname").style.color="red";
        //return false;
    }
    //Address
    var add=document.forms["myform"]["adress"].value.trim();
    if(add == ""){
        document.getElementById("erradd").innerHTML="Address is empty please fill it";
        document.getElementById("erradd").style.color="red";
        //return false;
    }
    //city
    var city=document.forms["myform"]["city"].value.trim();
    if(city == ""){
        document.getElementById("cityerr").innerHTML="City field is empty please fill it";
        document.getElementById("cityerr").style.color="red";
        //return false;
    }
    //Region
    var region=document.forms["myform"]["region"].value.trim();
    if(region == ""){
        document.getElementById("regionerr").innerHTML="Region field is empty please fill it";
        document.getElementById("regionerr").style.color="red";
        //return false;
    }
    //postal code  
    let postalerr=document.getElementById("pin").value.trim();
     if(postalerr == ""){
        document.getElementById("postalerr").innerHTML="Postal code is empty please fill it";
        document.getElementById("postalerr").style.color="red";
     }
     else{
        let pinformat = /^\d{6}$/;
        if(!pinformat.test(postalerr))
        {
            document.getElementById("postalerr").innerHTML="Please Enter a valid Postal code";
            document.getElementById("postalerr").style.color="red";
            //return false;
        }
    }
    
    //Country dropdown
    var country = document.getElementById("countryid");
        var SelIndex =country.options[country.selectedIndex].value;
        if (SelIndex == "none") {
            document.getElementById("cerror").innerHTML="Select Country";
            document.getElementById("cerror").style.color="red";
        }
     //Corse Code
     let corsecode=document.getElementById("corecode").value.trim();
     if( corsecode == ""){
        document.getElementById("codeerr").innerHTML="Corse Code is empty please fill it";
        document.getElementById("codeerr").style.color="red";
     }
     else{
        let corseformat = /^\d{6}$/;
        if(!corseformat.test( corsecode))
        {
            document.getElementById("codeerr").innerHTML="Please Enter a valid Corse Code";
            document.getElementById("codeerr").style.color="red";
            //return false;
        }
    }
    //Location
    var location=document.forms["myform"]["location"].value.trim();
    if(location == ""){
        document.getElementById("locationerr").innerHTML="Location field is empty please fill it";
        document.getElementById("locationerr").style.color="red";
        //return false;
    }
    //Start Date?
    var dateofbirth=document.getElementById("birthday").value;
    var pattern = /^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/
    var date= new Date();
    if (dateofbirth == "" || dateofbirth == null||!pattern.test(dateofbirth)) {
        //alert("invalid date of birth should in yyyy-mm-dd");
        document.getElementById("date").innerHTML="Invalid date should be in dd-mm-yyyy";
        document.getElementById("date").style.color="red";
    }
    /*else if(new Date(dateofbirth) >date){
        alert("invalid date");
    }
    else{
        alert("valid date");
    }*/

    //Contact Name
    var contact=document.forms["myform"]["contact"].value.trim();
    if(contact == ""){
        document.getElementById("contacterr").innerHTML="Contact Name field is empty please fill it";
        document.getElementById("contacterr").style.color="red";
        //return false;
    }
    //Distributor Name
    var distributor=document.forms["myform"]["distributor"].value.trim();
    if(distributor == ""){
        document.getElementById("distributorerr").innerHTML="Distributor Name field is empty please fill it";
        document.getElementById("distributorerr").style.color="red";
        //return false;
    }
    //Address
    var address=document.forms["myform"]["Adress"].value.trim();
    if(address == ""){
        document.getElementById("aerror").innerHTML="Address is empty please fill it";
        document.getElementById("aerror").style.color="red";
        //return false;
    }
    //city
    var citye=document.forms["myform"]["cityerr"].value.trim();
    if(citye == ""){
        document.getElementById("cityerror").innerHTML="City field is empty please fill it";
        document.getElementById("cityerror").style.color="red";
        //return false;
    }
    //Region
    var regione=document.forms["myform"]["regionerr"].value.trim();
    if(regione == ""){
        document.getElementById("rerr").innerHTML="Region field is empty please fill it";
        document.getElementById("rerr").style.color="red";
        //return false;
    }
    //postal code  
    console.log("he");
    let zip=document.getElementById("pin").value.trim();
    console.log("hello");
     if(zip == ""){
        document.getElementById("postalerr").innerHTML="Postal code is empty please fill it";
        document.getElementById("postalerr").style.color="red";
     }
     else{
        let zipformat = /^\d{6}$/;
        if(!zipformat.test(zip))
        {
            document.getElementById("postalerr").innerHTML="Please Enter a Postal code";
            document.getElementById("postalerr").style.color="red";
            //return false;
        }
    }
    //Phone Number
    var number=document.getElementById("mobile").value;
    if(number==""){
       document.getElementById("phonenumber").innerHTML="Mobile Number is empty please fill it";
       document.getElementById("phonenumber").style.color="red";
    }
    else{
       let phonenum=/^[0-9]{10}$/;
       if(!phonenum.test(number))
       {  
           document.getElementById("phonenumber").innerHTML="Please Enter a valid Mobile Number";
           document.getElementById("phonenumber").style.color="red";
           //return false;
       }
   }
   //Zip code
   var faxnumber=document.getElementById("zipcode").value;
    if(faxnumber==""){
       document.getElementById("ziperr").innerHTML="Postal code is empty please fill it";
       document.getElementById("ziperr").style.color="red";
    }
    else{
       let faxdigits=/^[\d- ]*$/;
       if(!faxdigits.test(faxnumber))
       {  
           document.getElementById("ziperr").innerHTML="Please Enter a valid Postal code";
           document.getElementById("ziperr").style.color="red";
           //return false;
       }
    }
       //Country dropdown
        var e = document.getElementById("currentcon");
        var optionSelIndex = e.options[e.selectedIndex].value;
        if (optionSelIndex == "none") {
            document.getElementById("errorcountry").innerHTML="Select Country";
            document.getElementById("errorcountry").style.color="red";
        }
//Fax
var faxcode=document.getElementById("faxnum").value;
if(faxcode==""){
   document.getElementById("faxerr").innerHTML="Fax field is empty please fill it";
   document.getElementById("faxerr").style.color="red";
}
else{
   let faxnumber=/^[\d- ]*$/;
   if(!faxnumber.test(faxcode)){  
       document.getElementById("faxerr").innerHTML="Please Enter a valid Fax Number";
       document.getElementById("faxerr").style.color="red";
       //return false;
   }
}
//privacy policy check box
var privacy=document.getElementsByName("check");
    var privacyerr=false;
    for(var i=0;i<privacy.length;i++){
        if(privacy[i].checked){
            privacyerr=true;
            break;
        }
    }
    if(!privacyerr==true){
        document.getElementById("policy").innerHTML="Please agree with the with the privacy policy";
        document.getElementById("policy").style.color="red";
    }
}
