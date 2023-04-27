// 16/04/2023

// -----------------Example 1---------------------

// function logging(callBack) {
//     console.log("logging")
//     callBack(1,2)
// }
// function add(a,b) {
//     console.log(a+b)
//     return a+b
// }
// logging(add)


// -------------------Example 2---------------------
// const sum = function(a,b) {
//     return a+b
// }
// let result = sum(1,2)
// console.log(result)


//--------Named Function-----
// function abc() {

// }

//--------Anonymous function-----
// const sum = function(){

// }

//---------Arrow function--------
// const sum = (a,b)=>{
//     return a+b
// }
// let re = sum(1,3)
// console.log(re)


//------------------Call Back------------

// // add vs add()

// function loggin(callBack) {
//     console.log('loggin')
//     callBack()
// }
// function add(a,b) {
//     console.log(a+b)
// }
// loggin(add)


//----------------Higher order function----------
// --------------------Example 1----------------
function calc (condition) {
    if (condition === 'add') {
        return function(a,b) {
            return a + b
            
        }
    } else if (condition === "sub") {
        return function(a,b) {
            return a-b
        }
    }
}

let functionadd = calc('add')
console.log(functionadd)
functionadd(12,13)






//---------Arrays------------------

//----Array is always a object and it will always created in HEAP only

// let arr = [1,2,3,4]
// console.log(arr.length)
// arr.push(5) // add element in back


// const arr1 = [1,2,3,4,5,6]
// arr1.push(7)
// console.log(arr1.length)
