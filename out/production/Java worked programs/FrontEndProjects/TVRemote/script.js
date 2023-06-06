// javascript code goes here

document.querySelectorAll('.block > button').forEach (function (btn) {
    btn.addEventListener('click', numberPad);
})

function numberPad(e) {
    let btnValue = e.target.id;
    if (btnValue >= 0 && btnValue <= 9) {
        document.getElementById("container").innerHTML = btnValue;
    } else {
        document.getElementById("container").innerHTML = 'Power Off';
    }
    let color1 = document.getElementsByTagName('span')[0];
    let color2 = document.getElementsByTagName('span')[1];
    color1.classList.add("clicked");
    color2.classList.add("clicked");

    setTimeout(function() {
        color1.classList.remove("clicked");
        color2.classList.remove("clicked");
    }, 300);

}
