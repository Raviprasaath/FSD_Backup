// javascript code goes here
let mainText = document.getElementById("text-container");

document.getElementById("colorchange").addEventListener('click', ()=> {
    let colorOfText = document.getElementById("colorbox");
    mainText.style.color = colorOfText.value;
})

document.getElementById("fontsize").addEventListener('input', ({target : {value}})=>{
    mainText.style.fontSize = `${value}px`;
}) 

document.getElementById("underline").addEventListener('click', ()=> {
    if (mainText.style.textDecoration === '') {
        mainText.style.textDecoration = 'underline';
    } else {
        mainText.style.textDecoration = '';
    }
})
document.getElementById("italic").addEventListener('click', ()=> {
    if (mainText.style.fontStyle === '') {
        mainText.style.fontStyle = 'italic';
    } else {
        mainText.style.fontStyle = '';
    }
});
document.getElementById("bold").addEventListener('click', ()=> {
    if (mainText.style.fontWeight === '') {
        mainText.style.fontWeight = 'bold';
    } else {
        mainText.style.fontWeight = '';
    }
})

document.getElementById("list").addEventListener('change', ()=> {
    mainText.style.fontFamily = list.value;
})


let fontSize = document.querySelector("#fontsize");
let list = document.querySelector("#list");
let getStyle = document.querySelector("#getstyle");
let cssProps = document.querySelector("#css-props");

getStyle.addEventListener("click", function () {
let cssText =
    `color: ${mainText.style.color};
    font-size: ${fontSize.value}px;
    text-decoration: ${mainText.style.textDecoration === "underline" ? "underline" : "none"};
    font-style: ${mainText.style.fontStyle === "italic" ? "italic" : "none"};
    font-weight: ${mainText.style.fontWeight === "bold" ? "bold" : "none"};
    font-family: ${list.value};`;
    cssProps.textContent = cssText;
});