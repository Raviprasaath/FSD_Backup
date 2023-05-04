let update = "I am a Newton School student, ready to become an awesome full stack developer"
let p = document.querySelector('p');
p.textContent = update;

let div = document.querySelector('div')
div.classList.add('day');
div.setAttribute('id', 'app')

let button = document.querySelector('button');
button.setAttribute('id', 'swap');
button.classList.add('button_day');

// Method 1
// function swapTheme() {
//     if (div.classList.contains('day')) {
//         div.classList.remove('day');
//         div.classList.add('night');

//         button.classList.remove('button_day');
//         button.classList.add('button_night');
//     } else {
//         div.classList.remove('night');
//         div.classList.add('day');

//         button.classList.remove('button_night');
//         button.classList.add('button_day');
//     }
// }

// Methhod 2
function swapTheme() {
    var element = document.getElementById("app");
    element.classList.toggle("night");

    var buttonElem = document.getElementById("swap");
    buttonElem.classList.toggle("button_night");
}