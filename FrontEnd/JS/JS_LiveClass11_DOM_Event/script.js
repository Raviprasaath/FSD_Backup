

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