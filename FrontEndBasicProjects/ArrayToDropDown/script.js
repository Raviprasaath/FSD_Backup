let array = ['ECE', 'MECH', 'IT', 'EEE', 'CIVIL', 'TEXTILE', 'AERO']

let bodyElem = document.getElementById('cont');

let selectDrop = document.createElement('select');
bodyElem.appendChild(selectDrop)


// for (let i=0; i<array.length; i++) {
//     let optionDrop = document.createElement('option');
//     optionDrop.textContent = array[i];
//     selectDrop.appendChild(optionDrop)
// }
// console.log(bodyElem)



// by using forEach loop
array.forEach(val => {
    let optionDrop = document.createElement('option');
    optionDrop.textContent = val;
    selectDrop.appendChild(optionDrop)
})
console.log(bodyElem)


selectDrop.style.width = '100px';
selectDrop.style.padding = '10px';
selectDrop.style.margin = '10px'


// for (let dept of array) {
//     console.log(dept)
// }
let r =  Math.floor(Math.random()*255+1);
let g =  Math.floor(Math.random()*255+1);
let b =  Math.floor(Math.random()*255+1);

bodyElem.style.backgroundColor = `rgb(${r},${g},${b})`;
selectDrop.style.backgroundColor = `rgb(${g},${b},${r})`;