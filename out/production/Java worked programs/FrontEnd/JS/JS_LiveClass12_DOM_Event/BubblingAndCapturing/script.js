const grandFather = document.getElementById("grandFather");
const parent = document.getElementById("parent");
const child = document.getElementById("child");

console.dir(grandFather);
console.dir(parent);
console.dir(child);

// bubbling
grandFather.addEventListener("click", () => {
    console.log("grandparent clicked")
}, false );

// wherever you click grandparant count only increase

parent.addEventListener("click", () => {
    console.log("parent clicked")
}, false );

// now except granparent box, child and parent count++



child.addEventListener("click", () => {
    console.log("child clicked")
}, false );

