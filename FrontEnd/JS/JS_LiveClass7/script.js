//  -------------22/04/2023----------

// call back - revise
// function sum () {}
// function loggin (sum) {
//     sum()
// }

/*
here - you providing a function inside a function, that function execute 
afterwords is called callBack

Synchrnous means -performing a operation one by one - top to bottom in java & js
*/
  
// eg
// let arr = [1,2,3,4,5]
// arr.map( (value) => {
//     return value * 2
// })
// output -> (5) [2,4,6,8,10]

// arr.forEach ( (value) => {
//     return value * 2
// })
//  output -> undefined

// more examples
// arr.map( (value) => {
//     return value + "hi"
// })
// output (5) ['1hi', '2hi', '3hi', '4hi', '5hi']

// arr.map( (value) => {
//     return true
// })
// (5) [true, true, true, true, true]

// arr.map( (value) => {
//     if (value %2 == 0) {
//         return true
//     } else {
//         return false
//     }
// })
// (5) [false, true, false, true, false]

// revision end-------------

// 4. Array.find
// let arr =[1,2,3,4,5,6,7,8,99,104,231,89,0]

// let res = arr.find ((value) => {
    //     if (value == 99) {   // if we give value like 8888 not in arr it give undefinded
    //         return true
    //     }
    // })
    // console.log(res)  //-> ans 99
    
// 5. Array.index
// let arr =[1,2,3,4,5,6,7,8,99,104,231,89,0]
// let indexof99 = arr.findIndex ((value) => {
//     if (value == 99) {   // if number not exist it give -1 in output, if repeated value means it give First element in array
//         return true
//     }
// })

// console.log(indexof99)   // ans -> 8


// 6. Find last
// let arr =[1,2,3,4,5,6,7,8,99,104,231,89,99,0]
// let res = arr.findLast ((value)=> {
//     if (value == 99) {    // if value not there it give undefined
//         return true
//     }
// })
// console.log(res)  // 99


// 6. Find last index
// let arr =[1,2,3,4,5,6,7,8,99,104,231,89,0]
// let res = arr.findLastIndex ((value)=> {
//     if (value == 99) {    // if value not there it give -1
//         return true
//     }
// })
// console.log(res)  // 8


// Array fill
// let arr = [1,2,3,4,5]
// arr.fill(0)
// (5) [0, 0, 0, 0, 0]

// let arr = [1,2,3,4,5]
// arr.fill(0, 1)
// (5) [1, 0, 0, 0, 0]


// let arr = [1,2,3,4,5]
// arr.fill(0, 3, 5)
// (5) [1, 2, 3, 0, 0]


// 7. Array.reduce

/*
this is diff from thers
1.Iteratre go to every element
2.callback the callback function
3.Storing the return value & passing that value to accumlator
*/

// let sumarr = [1,2,3,4,5,6,7,8,9,10]
// let sum = 0
// -----------way 1
// for (let item of sumarr) {
//     sum += item
// }
// console.log(sum)
// -----------way 2 
// for (let i=0; i<sumarr.length; i++) {
//     sum += sumarr[i]
// }
// console.log(sum)
//  -----------way 3
// sumarr.forEach ((value) => {
    //     sum += value
    // })
    // console.log(sum)
    
//  -----------way 4
    // let ans = sumarr.reduce( (accumulator, value) => {
    //     return accumulator + value
    // }, 0)

// // sumarr.reduce ( () => {}, 0)  this 0 is initial value
// //                        | this is my function (call back function)
// // we giving 0 is a inital val, the sum started based upon the initial only


//     console.log("accum", ans)    // = > accum 55


// ---------------------23/04/2023

// let arr = [1,2,3,4,5,6,7,8,9,10]
// // sum all the odd numbers

// let result = arr.reduce ((accum, value) => {
//     if (value %2 !== 0) {
//         return accum + value;
//     } else {
//         return accum
//     }
// }, 0)

// console.log(result)   // ans 25


// let arr = [20,12,33,84,51]
// let result = arr.reduce ((accum, value) => {
//     accum.push(2*value)
//     return accum
// }, [])

// console.log(result)  // output ->   [ 40, 24, 66, 168, 102 ]



//  copy 

// let a = 12
// let b = a
// b = 99
// console.log(a,b) //here a,b are copied if i change the b value means a not get affect


//  copy of an Array

//  wrong way
// let arr = [1,2,3,4,5,6]

// let arrCopy = arr
// arrCopy.push(99)
// console.log (arr)  // [ 1, 2,  3, 4, 5, 6, 99 ]
// console.log (arrCopy) // [ 1, 2,  3, 4, 5, 6, 99 ]

// but if we do same like above but arr not act like this
// because these array pointing same address in heap so if any one changed means both will affect


//  shallow copy -> correct method
// let arr = [1,2,3,4,5,6]

// way 1 For loop
// let newArr =[]
// for (const item of arr) {
//     newArr.push (item)
// }
// newArr.push(100)
// console.log(arr) //[ 1, 2, 3, 4, 5, 6 ]
// console.log(newArr)  //[ 1, 2, 3, 4, 5, 6, 100 ]

//  way 2 Map

// let arr = [1,2,3,4,5,6]

// let newArr = arr.map ((value) => {
//     return value
// })
// newArr.push(100)
// console.log(arr)  // [ 1, 2, 3, 4, 5, 6 ]
// console.log(newArr) // [ 1, 2, 3, 4, 5, 6, 100 ]

// way 3 spread operator

// let arr = [1,2,3,4,5,6]  // abc@123
// // let newArr = []   // abc@345
// //  ...arr means 1,2,3,4 without bracket
// let newArr = [...arr] 

// newArr.push(100)
// console.log(arr)    //[ 1, 2, 3, 4, 5, 6 ]
// console.log(newArr) // [ 1, 2, 3, 4, 5, 6, 100 ]

//  way 4 Reduce



