
// 05-10-2023
// Rest Operator


// function child (name, standard, rollNumber, ... otherinfo) {
//     console.log(name, standard, rollNumber);
//     console.log(otherinfo)
// }

// child("abcd", "5th std", 2, "Father", "Mother", "TamilNadu", "India");
// // output
// // abcd 5th std 2
// // [ 'Father', 'Mother', 'TamilNadu', 'India' ]





// // default value of Argument
// function child (name, standard, rollNumber = 1) {   // if we don't give 1 means it give undefined in output      
//     console.log(name, standard, rollNumber);
// }
// child ("ak","10th")
// child ("ak","10th", 100)

// output
// ak 10th 1 
// ak 10th 100



// Pass by value and Pass by Reference
// primitives are passed by value (numbers, boolean)
// let num1 = 1;
// let num2 = 2;

// function sum (a, b) {
//     a = a + 10;
//     b = b + 10;
//     console.log(a, b);
//     return a + b
// }
// let sumresult = sum (num1, num2) // pass by value 
// console.log(num1, num2);


// let math = {
//     marks : 100,
//     grade : "A"
// }
// let science = {
//     marks : 95,
//     grade : "B"
// }


// function sum (obj1, obj2) {
//     // let marksObj1 = obj1.marks;
//     // let marksObj2 = obj2.marks;
//     obj1.marks = 1;
//     obj2.marks = 2;

//     console.log(obj1.marks, obj2.marks, "object marks")  
// }

// sum (math, science);
// console.log(math.marks, science.marks, "subject marks"); 

// // output
// // 1 2 object marks
// // 1 2 subject marks



// Spread operator
// to create copies of any objects...

//  Deep Clone and Shallow Clone

let math = {
    marks : 100,
    grade : "A"
}
let science = {
    marks : 95,
    grade : "B"
}
// every properties were copied now 
let mathClone = { ...math } 
let scienceClone = { ...science } 


function sum (obj1, obj2) {
    obj1.marks = 1;
    obj2.marks = 2;

    console.log(obj1.marks, obj2.marks, "object marks")  
}

sum (mathClone, scienceClone)
console.log(math.marks, science.marks, "subject marks")

// output
// 1 2 object marks
// 100 95 subject marks
