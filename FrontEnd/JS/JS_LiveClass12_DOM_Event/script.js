
const container1 = document.getElementById("container");
container1.addEventListener('click', (event) => {
    console.log("--------------event-----------")
    console.dir(event)

    // this event is a object
    // its talks about the event type
    // and where the event was initatited  


    const buttonContainer = event.target
    console.dir(buttonContainer);
    // we can find many properties with style

    buttonContainer.style.color='red' //when we click the color of text inside box is changed (font color)

});

// -----------resize-----------
window.addEventListener("resize", () => {
    console.log("resized")
})
// when screen is resized it was start count in console -> but as of now its working in directly chrome only


// 1.Event Bubbling........-means Top to Bottom


// 2. Event Capturing....... Bottom to Top

