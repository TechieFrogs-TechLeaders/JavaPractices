document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("donationForm");
  
    form.addEventListener("submit", function (event) {
      // Retrieve values from input fields
      const firstName = form.elements.firstName.value.trim();
      const lastName = form.elements.lastName.value.trim();
      const email = form.elements.email.value.trim();
      const phone = form.elements.phone.value.trim();
      const streetAddress = form.elements.streetAddress.value.trim();
      const city = form.elements.city.value.trim();
      const zipCode = form.elements.zipCode.value.trim();
      const country = form.elements.country.value.trim();
      const donationAmount = form.elements.donationAmount.value.trim();
      const donationComment = form.elements.donationComment.value.trim();
      const publicThanksCheckbox = form.elements.publicThanks;
  
      // Check if required fields are empty
      if (firstName ===""||lastName ===""||email ===""||phone ===""||streetAddress ===""||city ===""||zipCode ===""||country ===""||donationAmount ==="") {
        alert("All fields are required.");
        event.preventDefault();
        return;
      }
  
      // Check if donation amount is a valid number
      if (isNaN(donationAmount) || parseFloat(donationAmount) <= 0) {
        alert("Please enter a valid donation amount.");
        event.preventDefault();
        return;
      }
  
      // Check if public thanks checkbox is checked
      if (publicThanksCheckbox.checked) {
        // Display a thank you message if checkbox is checked
        alert("Thank you for allowing us to thank you publicly!");
      }
  
      // Additional validation for donation comment (optional)
      if (donationComment.length > 100) {
        alert("Donation comment should be up to 100 characters.");
        event.preventDefault();
        return;
      }
    });
  });
  