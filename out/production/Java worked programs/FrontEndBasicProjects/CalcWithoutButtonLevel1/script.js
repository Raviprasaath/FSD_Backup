const btn = document.getElementById('btn');
const container = document.getElementById('container');
btn.addEventListener('click', calc);

let ansAdd = document.createElement('p');
container.append(ansAdd);

function calc() {
    let value1 = Number(document.getElementById('operand1').value);
    let value2 = Number(document.getElementById('operand2').value);
    let operator = document.getElementById('operator').value
    let ans = 0;
    if (operator === '+') {
        ans = value1 + value2;
    } else if (operator === '-') {
        ans = value1 - value2;
    } else if (operator === '*') {
        ans = value1 * value2;        
    } else if (operator === '/') {            
        ans = value1 / value2;        
    }
    ansAdd.textContent = ans;
}