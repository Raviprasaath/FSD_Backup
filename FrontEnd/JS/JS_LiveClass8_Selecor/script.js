/* -----Selectors---------- */
// it was only accessiable in tab/browser only..

// 1. getElementsByTagName
let paraTag = document.getElementsByTagName("p");
console.log(paraTag)

// 2. getElementById
let paraElement = document.getElementById("para")
console.log(paraElement)

/* in browser if we type it give list or property

const ans = document.getElementById("para")
console.dir(ans)

*/

// color the para by selecting the id
document.getElementById("para").style.color = "magenta";


// 3.getElementbyClass
let cont = document.getElementsByClassName("container")
console.log(cont)


// 4.querySelector - CSS selector
const paraquery = document.querySelector("#cssq")
console.log(paraquery) 