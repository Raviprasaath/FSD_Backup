//---------------------------19-04-2023------------------

let arr1 = [1,2,3,4,5,6,7]
let arr2 = [1,2,3,4,7]

// let iseql = arr1 === arr2
// console.log(iseql)

// 1.Push
// console.log(arr1.push(10))
// console.log(arr1)


// // 2.Pop
// console.log(arr1.pop())
// console.log(arr1)


// // 3. Slice  - it return the shallow coy of array
// let sliceArr = arr1.slice(2, 5)
// console.log(sliceArr)



// // 4. Splice - it remove the values from org array
// console.log(arr1)
// let splices = arr1.splice(1, 3)
// console.log(splices)
// console.log(arr1)


// // 5. Sort
// let  sorting = [4,2,5,6,7,6,3]
// let aftersort = sorting.sort()
// console.log(aftersort)
// console.log(aftersort === sorting)  // without changing the address it was sorting the values
//                                     // so true will print

// let orr = [1,5,7,3,2,9,8,45,21,11,19,103,391,231]
// orr.sort()
// console.log(orr) // ans -> [1, 103,  11, 19, 2, 21, 231, 3, 391, 45, 5,  7, 8, 9]

// orr.sort((a, b)=> a-b)  // compartor
// console.log(orr)  // ans ->  [1, 2, 3, 5, 7, 8, 9, 11, 19, 21, 45, 103, 231, 391]



// // 6. Shift - remove first element

// // - similar to push and pop

// console.log(arr1)
// arr1.shift()
// console.log(arr1)


// // 7. unshift - add in front
// console.log(arr1)
// arr1.unshift(10)
// console.log(arr1)


//  loops

// // 1. for  and while loop
// for (let i=0; i<arr1.length; i++) {
//     console.log(arr1[i])
// }


// let arr4 = [10, 2, 31, 42, 5, 65, 7, 8]

// // 2. for of loop -> printing the value
// for (let item of arr4) {
//     console.log(item)
// }

// // 3. for in loop -> printing index
// for (let item in arr4) {
//     console.log(item)
// }

//------------Extra fun Array call backs----------
//  1. Filter

let arr = [5,8,900,3,1,2,18,19,20,25,100,189]
function filterRavi() {

}

(item) => {
    return item > 19
}
arr.filter()
//  not completed this 