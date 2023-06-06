// javascript code goes here
let boxNumber = document.getElementById("wall_id");
let boxColor = document.getElementById("wall_color");
let wall = document.querySelectorAll('.blocks-wall > div');

attachEventListeners();

function attachEventListeners() {
    let applyBtn = document.getElementById("apply-btn");
    let resetBtn = document.getElementById("reset-btn");

    applyBtn.addEventListener ('click', applyColorinWall);
    resetBtn.addEventListener ('click', resetWall);
}


function resetWall (e) {
    e.preventDefault();

    for (let wallBlock of wall) {
        wallBlock.style.backgroundColor = "";
    }
}

function applyColorinWall(e) {
    e.preventDefault();

    let wallSelector = wall[boxNumber.valueAsNumber - 1];
    wallSelector.style.backgroundColor = boxColor.value;
}