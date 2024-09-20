var usrname = document.getElementById("name");
var age = document.getElementById("age");
var course = document.getElementById("course");
var email = document.getElementById("email");
var tr = document.querySelector(".table-container tbody"); // Ensure this is the tbody of the table

function printvalues(event) {
    event.preventDefault();
    
    // Get input values
    var usrnameValue = usrname.value;
    var ageValue = age.value;
    var gender = document.querySelector("input[type='radio'][name='gender']:checked").value;
    var courseValue = course.value;
    var emailValue = email.value;

    // Create a new table row
    var tableRow = document.createElement("tr");

    // Create and append table data cells (td) to the row
    var tdName = document.createElement("td");
    tdName.textContent = usrnameValue;
    tableRow.appendChild(tdName);

    var tdAge = document.createElement("td");
    tdAge.textContent = ageValue;
    tableRow.appendChild(tdAge);

    var tdGender = document.createElement("td");
    tdGender.textContent = gender;
    tableRow.appendChild(tdGender);

    var tdCourse = document.createElement("td");
    tdCourse.textContent = courseValue;
    tableRow.appendChild(tdCourse);

    var tdEmail = document.createElement("td");
    tdEmail.textContent = emailValue;
    tableRow.appendChild(tdEmail);

    var action = document.createElement("button");
    action.textContent="Delete";
    tableRow.appendChild(action);

    

    // Append the new row to the table body
    tr.appendChild(tableRow);

    action.addEventListener("click", function() {
        console.log("Button is clicked");
        tableRow.remove();
        
    });

   

    // Log values for debugging
    console.log(usrnameValue);
    console.log(ageValue);
    console.log(gender);
    console.log(courseValue);
    console.log(emailValue);
}
