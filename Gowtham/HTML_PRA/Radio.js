function checkForm() {
    let chosenOption = "";
    const len = document.userForm.gender.length;

    for (i = 0; i < len; i++) {
        if (document.userForm.gender[i].checked) {
            chosenOption = document.userForm.gender[i].value
        }
    }

    if (chosenOption == "") {
        alert("Please choose your gender!");
        return false;
    } else {
        console.log(chosenOption)
    }
}