const btn = document.getElementById('btn');
const container = document.getElementById('container');

let ansAdd = document.createElement('p');
container.append(ansAdd);

let entry = document.getElementById('entry');
let operator = '';

btn.addEventListener('click', calc);
function calc() {
    let str = entry.value;
    if (str.includes('+')) {
        operator = '+';
    } else if  (str.includes('-')) {
        operator = '-';        
    } else if (str.includes('*')) {
        operator = '*';
    } else if (str.includes('/')) {
        operator = '/';
    }
    let idx = str.indexOf(operator);
     
    let value1 = str.slice(0, idx);
    let value2 = str.slice(idx+1, str.length);
    let ans = 0;

    switch (operator) {
        case '+':
            ans = Number(value1) + Number(value2);
            break;
        case '-':
            ans = Number(value1) - Number(value2);
            break;
        case '*':
            ans = Number(value1) * Number(value2);
            break;
        case '/':
            ans = Number(value1) / Number(value2);
            break;
    }
    ansAdd.textContent = ans;
} 