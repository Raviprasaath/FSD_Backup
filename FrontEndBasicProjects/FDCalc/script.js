let container1 = document.getElementById('container');
let rangeVal = document.createElement('div');
let ansPrint = document.createElement('p');
container1.appendChild(rangeVal);
container1.appendChild(ansPrint);



let radio = document.getElementById('slider');
let rate = 0;
radio.oninput = function() {
    rangeVal.textContent = `${this.value} Months`
    
    if(this.value<3) {
        rate = 5.8;
    } else if (this.value>=3 && this.value<=6) {
        rate = 6.5;
    } else if(this.value>=7 && this.value<=9) {
        rate = 6.8;
    } else {
        rate = 7;
    }
    ansPrint.innerHTML = rate;
}