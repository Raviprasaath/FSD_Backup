/* -----Selectors---------- */
// it was only accessiable in tab/browser only..

// 1. getElementsByTagName -> HTML Collections
// let paraTag = document.getElementsByTagName("p");
// console.log(paraTag)

// 2. getElementById -> single element
// let paraElement = document.getElementById("para")
// console.log(paraElement)

/* in browser if we type it give list or property

const ans = document.getElementById("para")
console.dir(ans)

*/

// color the para by selecting the id
// document.getElementById("para").style.color = "magenta";


// 3.getElementbyClass -> HTML collections (array like)
// let cont = document.getElementsByClassName("container")
// console.log(cont)


// 4.querySelector - CSS selector -> it takes CSS Selector
// const paraquery = document.querySelector("#cssq")
// console.log(paraquery) 

// const sel = document.querySelector("div>p")
// console.log(ans)

//---------- 30-04-2023 -------
// Updation
/*

1. InternalHtml
2. textContent
3. innerText

*/


const caaard = document.getElementById("card")
console.dir(caaard)

// caaard.innerHTML = "i am changed" //html property was changed
// caaard.innerHTML = "<h1> again changed </h1> <p>hello</p>" //html property was changed to h1


// ----- innerText ------------
//  \n -> new line
//  space -> \u00A0 

// caaard.innerText = "i am changed" //html property was changed
// caaard.innerText = "<h1> again changed </h1>" //html property not changed to h1



// formatting of space will  not work in innertext
// caaard.innerText = `abfx
// csc
// sdvsdvd
// fv                      dfv
// zsfdv
// zf`
//  if we give more spaces but it will one space only
//  all the formating except space will be saved, newline


// caaard.innerHTML = `<h1> fv </h1> 
// <p> ervsdzfvedv </p>
// <script> console.log("fvdsf") </script>
// `
// this script will work in google chrome canary

// ------------- textContent -------------
// formating will be lost 
// caaard.textContent = `&&&&&********* <b>is</b>
// sgfarv
// servsev
// revdf          regvdv
// fvsevdz
// esvdzf                  eravreg
// `

// ------------  style  -------------------------
// caaard.style.color = 'green'




// ---------search--------
// 1. select the element
const element = document.getElementById("names")
console.log("---------element------")
console.dir(element)

// html collection
const child = element.children;
console.log(child, "html collections")  //HTMLCollection(5) [li, li, li, li, li]


const childArray = Array.from(child);
console.log(childArray , "Array")  //script.js:106 (5) [li, li, li, li, li]



// method 1
// childArray.forEach(liElement => {
//     if (liElement.textContent === 'ravi') {
//         console.log('result is true')
//     }
// })



// method 2
function SearchName(name) {
    return childArray.find(liElement => {
        return liElement.textContent === name
    })
}



// --------2. change the last name 
// in the list last name was updated
childArray[childArray.length-1].textContent = 'prasaath'


// ----------3. Additon in the DOM
// in list add one more 

// 1.create  -- creating in heap
const liElement = document.createElement("li")
console.log("liElement new ", liElement)

// 2.Edit the element
liElement.innerText = 'raviprasaath'

// 3.Attach the new Element to the ul list
// way 1
const unorderedlist = document.getElementById("names")
// way 2 of adding
 

// 4. Adding things in the last 
unorderedlist.append(liElement)



// unorderedlist.innerHTML = unorderedlist.innerHTML + "<li>hgafsa</li>\n"
// // don't use this



// ----------------- 02-05-2023 -----------------------
//  delete or remove from list

//  1.select the element
//  2. .remove() -> whole list
// const removeList = document.getElementById("names")
// removeList.remove()  // it remove all elements

const removeLast = document.querySelector("#names > li:nth-child(6)");
removeLast.remove();
console.log(removeLast)

// go to inspect page right click the element and do copy -> copy selector
// now paste inside query selector

