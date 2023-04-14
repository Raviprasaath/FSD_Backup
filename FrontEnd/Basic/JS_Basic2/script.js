// ------------------------------12/04/2023-------------------------

// console.log(a +"hello1")
// var a = 12;

// abc()

// function abc() {
//     console.log("Hello")
//     console.log(a +"  inside function")
//     var a = 19
//     console.log(a +"  inside function")
// }

// console.log(a)



//--------------------------- 13/04/2023---------------------------

//------------ example 1
// var a = 12
// var b = 13

// function abc(){
//     var a = 100
//     console.log(a)
//     console.log(b)
// } 
// abc()
// console.log(a)
// console.log(b)


//------------- Try and Catch---------------

// example 1
// console.log("Hello")
// function sum(a, b) {
//     try {
//         throw Error('Reference Error due to non Alignment')
//         let c = a+b
//         return c
//     } catch (error) {
//         console.log("Hey user doing correct?")
        

//         if (error.message == "alignment") {
//             alert('something went wrong')
//         } else if (error.message == "non alignment") {
//             alert("database is down")
//         }
//         console.log(error)
//     }
// }
// let result = sum(1,2)
// console.log(result)


// example 2

function calculator (a,b, action) {
    try {
        let res
        if (action === "add") {
            throw Error('google error add')
            res = a+b
        } else if (action === "sub") {
            // microsoft error sub
            // throw Error('microsoft error sub')
            res = a-b
        } else if (action === "multi") {
            // digital ocean error multi
            // throw Error('digital ocean error multi')
            res = a*b
        }
        return res
    } catch (error) {
        console.log("This is the error")
        // console.log(error.message)

        if (error.message === "google error add") {
            console.log('google is giving error')
        } else if (error.message === "microsoft error sub") {
            console.log('microsoft is giving error')
        } else if (error.message === "digital ocean error multi") {
            console.log('digital ocean is giving error')
        }
    }
}

let result1 = calculator(1,2,'add')
console.log(result1, "add")
let result2 = calculator(1,2,'sub')
console.log(result2, "sub")
let result3 = calculator(1,2, 'multi')
console.log(result3, "multi")

// console.log(result1, result2, result3)