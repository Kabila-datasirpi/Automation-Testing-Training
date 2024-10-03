var nameInput = document.getElementsByClassName("name-input")[0]; // Accessing by class name
var ageInput = document.getElementById("age");
var courseInput = document.getElementById("course");
var emailInput = document.getElementById("email");
var tableBody = document.querySelector(".table-container tbody"); // Ensure this is the tbody of the table

function printValues(event) {
    event.preventDefault();
    
    // Get input values
    var userNameValue = nameInput.value;  // Accessing value from class
    var ageValue = ageInput.value;
    var genderValue = document.querySelector("input[type='radio'][name='gender']:checked").value;
    var courseValue = courseInput.value;
    var emailValue = emailInput.value;

    // Create a new table row
    var tableRow = document.createElement("tr");

    // Create and append table data cells (td) to the row
    var tdName = document.createElement("td");
    tdName.textContent = userNameValue;
    tableRow.appendChild(tdName);

    var tdAge = document.createElement("td");
    tdAge.textContent = ageValue;
    tableRow.appendChild(tdAge);

    var tdGender = document.createElement("td");
    tdGender.textContent = genderValue;
    tableRow.appendChild(tdGender);

    var tdCourse = document.createElement("td");
    tdCourse.textContent = courseValue;
    tableRow.appendChild(tdCourse);

    var tdEmail = document.createElement("td");
    tdEmail.textContent = emailValue;
    tableRow.appendChild(tdEmail);

    // Create and append a delete button to the row
    var deleteButton = document.createElement("button");
    deleteButton.textContent = "Delete";
    tableRow.appendChild(deleteButton);

    // Append the new row to the table body
    tableBody.appendChild(tableRow);

    // Add event listener to the delete button to remove the row
    deleteButton.addEventListener("click", function() {
        console.log("Button clicked. Removing row.");
        tableRow.remove();
    });

    // Log values for debugging
    console.log(userNameValue);
    console.log(ageValue);
    console.log(genderValue);
    console.log(courseValue);
    console.log(emailValue);
}
