const grandFather = document.getElementById("grandFather");
const parent = document.getElementById("parent");
const child = document.getElementById("child");

console.dir(grandFather);
console.dir(parent);
console.dir(child);

// -------- Capturing -------------- (this is not used most of the times )

// grandParent.addEventListener("click", (event) => {
//     console.log("grandparent clicked")

//     event.stopPropagation();  // so it will not allow to move forward, even we clicked the child console end with Grndapraent only

// }, true)

// grandParent.addEventListener("dragover", ())

// grandParent.addEventListener("dragover", ())

// parent.addEventListener("click", () => {
//     console.log("parent clicked")

// }, true)


// child.addEventListener("click", () => {

//     console.log("child Clicked") 
// }, true)



// // -------------bubbling---------
// grandFather.addEventListener("click", () => {
//     console.log("grandparent clicked")
// }, false );

// // wherever you click grandparant count only increase

// parent.addEventListener("click", () => {
//     console.log("parent clicked")
// }, false );

// // now except granparent box, child and parent count++



// child.addEventListener("click", () => {
//     console.log("child clicked") 
// }, false );


//  HOW TO STOP the EVENT  -> event.stopPropogation();


// -> THis will stop the event object there only (on that element), that 
// event propogation will be FREZED. 



// addEventListner is basically adding an object in the memory 
// more you add this Listner more memory it is going to take.


//------------- Event Stop propagation-----------
grandFather.addEventListener("click", (event) => {
    console.log("grandparent clicked")
}, false );

// wherever you click grandparant count only increase

parent.addEventListener("click", (event) => {
    console.log("parent clicked")
}, false );

// now except granparent box, child and parent count++



child.addEventListener("click", (event) => {
    console.log("child clicked")
    event.stopPropagation();   //  without this child, parent, grandparaent was clicked shown in the console, but when we put this Child only clicked
}, false );



//  -------- Removal of Listner (removeEventListener) -------------

const button = document.getElementById("button");

button.addEventListener("click", buttonClickHandler)


function buttonClickHandler(event) {
    console.log("click me ")


}


// after 5 seconds ecexute this code
// setTimeout(() => {
    
    
//     button.removeEventListener("click", buttonClickHandler)

button.removeEventListener("click", nameOfFunction?Handler)

// }, 5000)




document.addEventListener("unload", () => {
    button.removeEventListener("click", buttonClickHandler)
})

