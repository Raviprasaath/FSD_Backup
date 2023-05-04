// Advance selector

// -------- Insertion Ways ----------
// 1.append -> it take the element and add it to last

const body = document.body;
console.dir(body);

//  Creation of H1 tag
const headingTag = document.createElement("h1");
headingTag.textContent="Selector Advance"
body.append(headingTag);


const heading2 = document.createElement("h2");
heading2.textContent = ("h2 size content");
body.append(heading2)


// 2.Prepend -> inserting the element in first position

const heading3 = document.createElement("h3");
heading3.textContent = ("h3 size content");
heading3.style.color = "red";
body.prepend(heading3)


// usual was to append / prepend
// const unorderedlist = document.getElementById("names");
// const newName = document.createElement("li");
// newName.textContent = "ravi10";

// // unorderedlist.append(newName)
// unorderedlist.prepend(newName)

// 3. before -> inserts the elements before the selected element 

const unorderedlist = document.getElementById("names");
const heading4 = document.createElement("h1");
heading4.textContent = "Above the Ul tag"

unorderedlist.before(heading4)


// 4. after -> inserts the elements after the selected element 

const unorderedlist1 = document.getElementById("names");
const paraTag1 = document.createElement("p");
paraTag1.style.backgroundColor = "green"
paraTag1.textContent = "This is para"

unorderedlist.after(paraTag1)


// Strongly discouraged one - don't use
// document.write("svdsvz") -> it overwrite the all html elements, mostly it affect loaded doc only or already avail in the server


//----------4 new methods Insertion (Insert Adjacent HTML) -----------
// 1.before Begin
// 2.before End -> will act as append
// 3.after Begin -> will act as prepend
// 4.after End

const unorderedlist2 = document.getElementById("names");
unorderedlist2.insertAdjacentHTML("afterbegin","<li>ravi15</li>")
unorderedlist2.insertAdjacentHTML("beforeend","<li>ravi20</li>")

