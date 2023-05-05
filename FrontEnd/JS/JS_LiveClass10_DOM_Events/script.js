const container = document.getElementById("container");

container.style.color = "red";
container.style.border = "solid 2px blue";
container.style.width = "100px";
container.style.height = "60px";


//if clicked means count will add before console
// container.addEventListener('click', (event)=> {
//     console.log("i am clicked")       // it will shown in browser console and number will count
// })

// when mouse hovers it will count 
container.addEventListener("mouseover", ()=> {
    console.log("i am hover")
});


// way 2 -? don't ues this
function containerClick() {
    console.log("container click")
}


// Keyboard events --->

// Keyup Button

// 1. whenever your are writting (Typing or Keyboard) there are 2 steps
// travel of keys go to top to bottom - keyDown
// travel of the keys goes from bottom to top - keyUp

// 1. Event type, target ->
// event.target-?
// prevent defaults
// Mouse events


//------------------------ 05-04-2023 -------------------

