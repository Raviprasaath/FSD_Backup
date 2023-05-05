function displayRandomNumber() {
    let min = Math.ceil(-20);
    let max = Math.floor(20);
    document.getElementById("num").innerHTML = Math.floor(Math.random()*(max - min +1)) + min;
}