
//Method 1    ---- RBG value
/* 
let head1 = document.getElementById('head1');
let createDiv = document.createElement('p');
head1.appendChild(createDiv)


document.getElementById('btn').addEventListener('click', ()=>{
    let r = Math.floor(Math.random()*255)+1;
    let g = Math.floor(Math.random()*255)+1;
    let b = Math.floor(Math.random()*255)+1;
    console.log(r)
    console.log(g)
    console.log(b)
    let background = `rgb(${r},${g},${b})`;
    console.log(background)
    let bg = document.getElementById('bg');
    bg.style.backgroundColor = background;

    createDiv.textContent = background
} )
*/

 
// Method 2   ---- HEX value
let head1 = document.getElementById('head1');
let createDiv = document.createElement('p');
head1.appendChild(createDiv)
document.getElementById('btn').addEventListener('click', ()=>{
    let digit = [1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F'];
    let color = '#';
    for (let i=1; i<7; i++) {
        color += digit[Math.floor(Math.random()*digit.length-1)+1];
    }
    let bg = document.getElementById('bg');
    bg.style.backgroundColor = color;

    createDiv.textContent = color;
    
});

