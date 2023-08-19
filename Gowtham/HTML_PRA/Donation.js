function validation() {
    const form = document.getElementById("donationForm");
      const firstName = form.elements.firstName.value.trim();
      const lastName = form.elements.lastName.value.trim();
      const email = form.elements.email.value.trim();
      //const phonenum = form.elements.phone.value.trim();
      const streetAddress = form.elements.streetAddress.value.trim();
      const city = form.elements.city.value.trim();
      const zipCode = form.elements.zipCode.value.trim();
      const country = form.elements.country.value.trim();
      const donationAmount = form.elements.donationAmount.value.trim();
      const donationComment = form.elements.donationComment.value.trim();
      const publicThanksCheckbox = form.elements.publicThanks;
  
      // Check if required fields are empty
      if (firstName ===""||lastName ===""||email ===""||streetAddress ===""||city ===""||zipCode ===""||country ===""||donationAmount ==="") {
        alert("All fields are required.");
        return;
      }
      var em=document.getElementById("email").value;
      let erremail=/^\w+([\.-]?\w+)@\w+([\.-]?\w+)(\.\w{2,3})+$/;
      if(!erremail.test(em)){  
          document.getElementById("mail").innerHTML="Please Enter a email-id";
          document.getElementById("mail").style.color="red"
          return false;
      }
      var numid=document.getElementById("mobile").value;
      let errphone=/^[0-9]{10}$/;
      if(!errphone.test(numid)){  
          document.getElementById("phoneid").innerHTML="Please Enter a valid Mobile Number";
          document.getElementById("phoneid").style.color="red"
          //return false;
      }


  
      // Check if donation amount is a valid number
      if (isNaN(donationAmount) || parseFloat(donationAmount) <= 0) {
        alert("Please enter a valid donation amount.");
        return;
      }
  
      // Check if public thanks checkbox is checked
      if (publicThanksCheckbox.checked) {
        alert("Thank you for allowing us to thank you publicly!");
      }
  
      if (donationComment.length > 100) {
        alert("Donation comment should be up to 100 characters.");
        return;
      }
    }

  