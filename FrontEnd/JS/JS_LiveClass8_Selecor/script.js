/* -----Selectors---------- */
// it was only accessiable in tab/browser only..

// 1. getElementsByTagName -> HTML Collections
let paraTag = document.getElementsByTagName("p");
console.log(paraTag)

// 2. getElementById -> single element
let paraElement = document.getElementById("para")
console.log(paraElement)

/* in browser if we type it give list or property

const ans = document.getElementById("para")
console.dir(ans)

*/

// color the para by selecting the id
document.getElementById("para").style.color = "magenta";


// 3.getElementbyClass -> HTML collections (array like)
let cont = document.getElementsByClassName("container")
console.log(cont)


// 4.querySelector - CSS selector -> it takes CSS Selector
const paraquery = document.querySelector("#cssq")
console.log(paraquery) 

const sel = document.querySelector("div>p")
console.log(ans)