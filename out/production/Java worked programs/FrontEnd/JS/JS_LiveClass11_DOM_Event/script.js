


document.addEventListener('DOMContentLoaded', ()=> {
    console.log("-------inside----------")
    const containerDIv = document.getElementById("container")
    
    console.dir(containerDIv);
    // now in console it give 
})

console.log("-------outside----------")
const containerDIv = document.getElementById("container")

console.dir(containerDIv);
// in console it give null


// -------------------------------
// 1. DOMContentLoaded -> It is the event which will be used when the DOM tree is fully created or fully loaded (above example)
// 2. loadEvent -> when external resourses are fully loaded (Images, CSS, etc)..
// -> resoures....
document.addEventListener("load", () => {} )


// 3. beforeunload -> this event is basically called when a user is moving away from the web page
// cleaning purpose
document.addEventListener("beforeunload", () => {
    // cancel all event listener
    // cleaning 
    // saving the form accidental reload
} );


