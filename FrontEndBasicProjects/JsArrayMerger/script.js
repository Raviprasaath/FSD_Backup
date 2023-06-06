const arr2 = document.getElementById('2');
const btn1 = document.getElementById('add-1');
const btn2 = document.getElementById('add-2');
const error = document.getElementById('error');

const display1 = document.getElementById('disp-1');
const display2 = document.getElementById('disp-2');
let display1Temp = [];
let display2Temp = [];


const firstArray = [];
const secondArray = [];

btn1.addEventListener('click', () => {
    
    const arr1 = document.getElementById('1');
    let val = true;
    let inputBox1 = arr1.value;
    let inputStringArr = inputBox1.split(',');
    
    for (let i=0; i<inputStringArr.length; i++) {
        if (inputStringArr[i] >='a' && inputStringArr[i] <= 'z') {
            val = false;
            break;
        }  

    }

    if (val){
        for (let i=0; i<inputStringArr.length; i++) {
            firstArray.push(inputStringArr[i]);    
            display1Temp.push(inputStringArr[i]);    
        }       

        display1.innerHTML = `[${firstArray}]`;
        error.style.display = 'none'
        while (firstArray.length !== 0) {
            firstArray.pop();    
        } 

    } else {
        display1.innerHTML = '';
        error.style.display = 'inline-block'
    }
    
})

btn2.addEventListener('click', () => {
    const arr2 = document.getElementById('2');
    let val = true;
    let inputBox1 = arr2.value;
    let inputStringArr = inputBox1.split(',');
    
    for (let i=0; i<inputStringArr.length; i++) {
        if (inputStringArr[i] >='a' && inputStringArr[i] <= 'z') {
            val = false;
            break;
        }  

    }

    if (val){
        for (let i=0; i<inputStringArr.length; i++) {
            secondArray.push(inputStringArr[i]);    
            display1Temp.push(inputStringArr[i]);    
            
        }       

        display2.innerHTML = `[${secondArray}]`;
        error.style.display = 'none'
        while (secondArray.length !== 0) {
            secondArray.pop();    
        } 

    } else {
        display2.innerHTML = '';
        error.style.display = 'inline-block'
    }
    
})


const resultDisplay = document.getElementById('result');
document.getElementById('merge').addEventListener('click', () => {    
    resultDisplay.textContent = `[${display1Temp}]`;
    while (display1Temp.length !== 0) {
        display1Temp.pop();    
    }

})