//    ----------- 20-04-2023 ---------

//----------- 1. for each ------------

/*
1.parent -> for each
2.callback -> () => {}
ptint out Element
user function arrow function

forEach doesnot care about return value****
if we entered any thing in return it will not read

for each is going to every index

for each of your element i want excute my own function
for each - to go to every element

for each iterate every element
*/

// let arr = [11,25,36,48,54,63,79,81]


//  eg 1

// arr.forEach (
//     (value, index, array) => {
//         console.log(value, index , array, 'hey there i am traversing')
//     }
// )
//  output 
// 11 0 [ 11, 25, 36, 48, 54, 63, 79, 81] hey there i am traversing
// 25 1 [ 11, 25, 36, 48, 54, 63, 79, 81] hey there i am traversing
// 36 2 [ 11, 25, 36, 48, 54, 63, 79, 81] hey there i am traversing
// 48 3 [ 11, 25, 36, 48, 54, 63, 79, 81] hey there i am traversing
// 54 4 [ 11, 25, 36, 48, 54, 63, 79, 81] hey there i am traversing
// 63 5 [ 11, 25, 36, 48, 54, 63, 79, 81] hey there i am traversing
// 79 6 [ 11, 25, 36, 48, 54, 63, 79, 81] hey there i am traversing
// 81 7 [ 11, 25, 36, 48, 54, 63, 79, 81] hey there i am traversing

// -------------------------------------
// eg 2
// arr.forEach(() => {
    //     console.log('Hello')
    // })
    
    //  8 times it was printed
    // Hello
    // Hello
    // Hello
    // Hello
    // Hello
    // Hello
    // Hello
    // Hello
    
// -------------------------------------
//  eg 3
// arr.forEach((value)=> {
//     console.log(value)
// })

// 11
// 25
// 36
// 48
// 54
// 63
// 79
// 81

// -------------------------------------
//  eg 4

// arr.forEach((value, index)=> {
    //     console.log(value, "at index:", index)
    // })
    
    //  ans
    // 11 at index: 0
    // 25 at index: 1
    // 36 at index: 2
    // 48 at index: 3
    // 54 at index: 4
    // 63 at index: 5
    // 79 at index: 6
    // 81 at index: 7
    
    //-------------- alter way

    // arr.forEach(ravi)

    // function ravi (value, index) {
    //     console.log(value, "at index: ", index)
    // }
    // normal function also used in the For each loop not only arrow function 

// -------------------------------------
//  eg 5
// function sum (a, b) {
//     return a + b;
// }
// let res1 = sum(1,2)
// const sumFun = (a,b)=> {
//     return a + b;
// }
// let res2 = sumFun(1,2)
// console.log(res1, res2) 

// ans 3 3

// -------------------------------------


// ----------Map-------------------
/*
return value can be any thing boolean, int, number , object, 

    For Each ignore return value, but Map will
    takes return values and collect them

 map exactly like for each
 go to your Element
 execute the element
 My functioning returing collect them

*/

// let arr = [19,21,37,44,51,69,77,88]

// arr.map ((value, index, array) => {
//     console.log(value+" map at the index: "+index)
// })
// behaving like foreach 
// output
// 19 map at the index: 0
// 21 map at the index: 1
// 37 map at the index: 2
// 44 map at the index: 3
// 51 map at the index: 4
// 69 map at the index: 5
// 77 map at the index: 6
// 88 map at the index: 7

//-----------

let arr = [19,21,37,44,51,69,77,88]

let beautifulArr = arr.map ((value, index, array) => {
    console.log(value+" map at the index: "+index)

    let rank =''
    if (value < 22) {
        rank = 'undergrad'
    } else if (value >=22 && value < 30) {
        rank = 'passedout'
    } else if (value>= 30) {
        rank = 'exp'
    }
    let obj = {
        age : value,
        rank : rank, 
    }
    return obj;

})

// console.log(arr)
// console.log(beautifulArr)


//  output

// [ 19, 21, 37, 44, 51, 69, 77, 88]
//   [
//     { age: 19, rank: 'undergrad' },
//     { age: 21, rank: 'undergrad' },
//     { age: 37, rank: 'exp' },
//     { age: 44, rank: 'exp' },
//     { age: 51, rank: 'exp' },
//     { age: 69, rank: 'exp' },
//     { age: 77, rank: 'exp' },
//     { age: 88, rank: 'exp' }
//   ]


// ------Array Filter------ 
// 1. go to every Element
// 2. execute the function

// if condition is true then only it take value


// except (forEach) every function cares about return value

//  filter accepts return value but all of them not, only accept true/fase
// very very rarely numbers

let arr = [ 19, 21, 37, 44, 51, 69, 77, 88]

let filterarr = arr.filter((value) => {
    if (value %2  == 0) {
        return true;
    } else {
        return false;
    }
})

console.log(filterarr)