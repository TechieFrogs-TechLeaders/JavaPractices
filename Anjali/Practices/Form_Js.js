function validation(){
    var a=document.myform.drown.length;
    console.log("in course"+a);

    document.getElementById("err").hidden=false;
    document.getElementById("err").style.color="red";
    document.getElementById("error").innerHTML="Please fill the field";
    document.getElementById("error").style.color="red";
    document.getElementById("error m").innerHTML="Please fill the field";
    document.getElementById("error m").style.color="red";
    document.getElementById("error me").innerHTML="Please fill the field";
    document.getElementById("error me").style.color="red";
    document.getElementById("error mes").innerHTML="Please fill the fild";
    document.getElementById("error mes").style.color="red";
    document.getElementById("error mess").innerHTML="Please Select a Date";
    document.getElementById("error mess").style.color="red";
    document.getElementById("error messa").innerHTML="Please Select a Month";
    document.getElementById("error messa").style.color="red";
    document.getElementById("error messag").innerHTML="Please Select a Year";
    document.getElementById("error messag").style.color="red";
    document.getElementById("error message").innerHTML="Please Write Adress";
    document.getElementById("error message").style.color="red";
    let x=document.forms["myform"]["City"].value;
    if (x == "") {
        alert("City must be filled out");
        return false;
    }
    let y=document.forms["myform"]["Pin Code"].value;
    if(y==""){
       alert("Pin Code must be filled out");
    }
    /*var z=document.forms["myform"]["High"].value;
    if(z[0].checked==false||z[1].checked==false||z[2].checked==false||z[3].checked==false){
        alert("Select any value");
        return false;
    }
    var cbox = document.forms["myform"]["High"].value;
    if (
      cbox[0].checked == false &&
      cbox[1].checked == false &&
      cbox[2].checked == false &&
      cbox[3].checked == false &&
      cbox[4].checked == false
    ) {
      alert("Please Select Gender");
      return false;
    } else {
      alert("Successfully Submited");
      return true;
    }*/
    //checkbox
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
       // alert("Please select atleast one Qualification");
        console.log("pls enter qual");
        val=true;
    }
    //radio button
   var valid=false;//valid=flag assuming false
   // var a=document.myform.drown.length;
    //console.log("in course"+a);

    for(var i=0;i<a;i++){
        console.log(a[i]);
        if(a[i].checked){
        valid=true;
        break; //it is enough to select one
    }
    }
    if(valid==false){
        console.log("pls enter course");
    }

}


/*function myblur(){
    console.log("in blur");
    document.getElementById("fname").style.borderColor = "red";
    document.getElementById("fname").style.color = "blue";

}*/