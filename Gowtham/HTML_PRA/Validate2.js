function validation() {
    // Reset error messages
    document.getElementById("err").hidden = true;
    document.getElementById("hr").hidden = true;
    document.getElementById("ir").hidden = true;
    document.getElementById("kr").hidden = true;
    document.getElementById("rr").hidden = true;
    document.getElementById("x").hidden = true;
    document.getElementById("lr").hidden = true;
    document.getElementById("cr").hidden = true;
    document.getElementById("tr").hidden = true;
    document.getElementById("qualificationError").hidden = true;
    document.getElementById("hobbyError").hidden = true;

    // Validate First Name
    let firstName = document.getElementsByName("First Name")[0].value;
    if (firstName === "") {
        document.getElementById("err").hidden = false;
        return false;
    }

    // Validate Last Name
    let lastName = document.getElementsByName("Last Name")[0].value;
    if (lastName === "") {
        document.getElementById("hr").hidden = false;
        return false;
    }

    // Validate Email ID
    let email = document.getElementsByName("Email")[0].value;
    if (email === "") {
        document.getElementById("ir").hidden = false;
        return false;
    }

    // Validate Mobile Number
    let mobileNumber = document.getElementsByName("Mobile Number")[0].value;
    if (mobileNumber === "" || mobileNumber.length !== 10 || isNaN(mobileNumber)) {
        document.getElementById("kr").hidden = false;
        return false;
    }

    // Validate Address
    let address = document.getElementById("hi").value;
    if (address === "") {
        document.getElementById("rr").hidden = false;
        return false;
    }

    // Validate City
    let city = document.getElementById("city").value;
    if (city === "") {
        document.getElementById("x").hidden = false;
        return false;
    }

    // Validate Pin Code
    let pinCode = document.getElementById("PinCode").value;
    if (pinCode === "" || pinCode.length !== 6 || isNaN(pinCode)) {
        document.getElementById("lr").hidden = false;
        return false;
    }

    // Validate State
    let state = document.getElementsByName("State")[0].value;
    if (state === "") {
        document.getElementById("cr").hidden = false;
        return false;
    }

    // Validate Country
    let country = document.getElementsByName("Country")[0].value;
    if (country === "") {
        document.getElementById("tr").hidden = false;
        return false;
    }
     
    let hobbiesChecked = false;
    const hobbiesCheckboxes = document.querySelectorAll("input[type='checkbox'][name^='Hobby']");
    for (let checkbox of hobbiesCheckboxes) {
        if (checkbox.checked) {
            hobbiesChecked = true;
            break;
        }
    }
    if (!hobbiesChecked) {
        document.getElementById("hobbyError").hidden = false;
        return false;
    }
    
    let qualificationChecked = false;
    const qualificationCheckboxes = document.querySelectorAll("input[type='checkbox'][id^='highschool']");
    for (let checkbox of qualificationCheckboxes) {
        if (checkbox.checked) {
            qualificationChecked = true;
            break;
        }
    }
    if (!qualificationChecked) {
        document.getElementById("qualificationError").hidden = false;
        return false;
    }

   

    // Validate Courses Applied For
    let coursesChecked = false;
    const coursesRadios = document.querySelectorAll("input[type='radio'][id^='BCA']");
    for (let radio of coursesRadios) {
        if (radio.checked) {
            coursesChecked = true;
            break;
        }
    }
    if (!coursesChecked) {
        // Add error handling for courses here...
        return false;
    }

    // Additional validation checks can be added here...

    return true; 
}