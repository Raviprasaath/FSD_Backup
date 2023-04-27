//15-04-2023


// --------------Example 1-----------------------
// var a = 12;
// console.log(a)

// function sum (a, b=5) {
//     var c = a+b
//     return c
// }

// const res = sum(1, 3)
// console.log(res)



// --------------Example 2-----------------------

// let num1 = 12;
// let num2 = 13;

// function sum(a , b) {                 //  a, and b are arguments.      
//     let c = a + b;
//     return c;
// }

// let result  = sum(num1, num2)

// function calc(abc, val) {
//     console.log(abc)
//     console.log(val)
// }

// calc(sub, 2)

// function sum(a,b) {
//     return a+ b;
// }

// function sub(a,b) {
//     return a-b
// }


// --------------Example 3-----------------------

spaceShip(weapons, 'utkarsh', 24)
function spaceShip(func, num1, num2) {

    console.log(num1, num2);

    if(num1 === "utkarsh") {
        func()
    } else {
        console.log('hacking spaceship dectected')
    }
}

function weapons() {
    console.log('weapons acrtivaged');
}

function lifeSupport() {
    console.log('lifeSupport');
}

function food() {
    console.log('food');
}


function sum(a,b) {
    return a + b;
}

sum() // function call.



