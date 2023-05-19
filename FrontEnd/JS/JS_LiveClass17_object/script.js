
// Dynamic value here but not Dynamic keys
// let obj = {
//     name : "ravi",
//     rollnum : 1,
//     class: "10th"
// }
// // get
// console.log(obj.name)
// console.log(obj.rollnum)

// // output
// // ravi
// // 10th

// // Add
// obj ["newProperty"] = 12;
// console.log(obj)

// output
// {name: 'ravi', rollnum: 1, class: '10th', newProperty: 12}
// class : "10th"
// name : "ravi"
// newProperty : 12
// rollnum : 1
// [[Prototype]] :  Object




let name = "raviprasaath"
let key = "subname"

let obj = {
    name : name,
    rollnum : 1,
    class: "10th",
    [key] : "subname1 subname2"
}
console.log(obj, "1st object")
// get
console.log(obj.name)
console.log(obj.rollnum["rollnum"])

// add
obj ["newProperty"] = 12;
console.log(obj)


// output
// {
//     name: 'raviprasaath', rollnum: 1, class: '10th', subname: 'subname1 subname2'
// }
// class: "10th"
// name: "raviprasaath"
// newProperty: 12
// rollnum: 1
// subname: "subname1 subname2"
// [[Prototype]]: Object '1st object'
// raviprasaath








// Internal implementation of class in HashMap

// while deleting the object values - in a same address oonly it willd delete, it will not create new address
// delete 

// setTimeout(() => {
    
//     console.log(obj)
// }, 5000)

delete obj.rollNumber

// console.log(obj)


// COPY ....... ?

const user = {
    name: "utse",
    age: 24,
}

// This is not how you create a copy
const userCopy1 = user;

// SHALLOW COPY  -- user created new obj in heap ->new address

const userCopy2 = { ...user }

console.log(user === userCopy1, "user copy 1")
console.log(user === userCopy2, "user copy 2")

// output
// true 'user copy 1'
// false 'user copy 2'



// 16-05-2023
// Objects Method

// 1.Object.assign 
// way 1

// const sourceObject1 = {name: "ravi", class: 10} 
// const sourceObject2 = {name: "utkarsh", class: 12} 
// const targetObject = {}

// Object.assign(targetObject, sourceObject1)

// console.log(targetObject)

// above code act as ... which seen previosuly 




// way 2
const sourceObject1 = {name: "ravi", class: 10} 
const sourceObject2 = {name1: "utkarsh", class1: 12} 
const targetObject = {}

Object.assign(targetObject, sourceObject1, sourceObject2)

console.log(targetObject)

// output - > we can copy multiple
// {name: 'ravi', class: 10, name1: 'utkarsh', class1: 12}






// way 3
const obj = {
    name : "ravi",
    class : 9,
    rollNumber : 12,

    name : "ram"
}
console.log(obj)

//output -> {name: 'ram', class: 9, rollNumber: 12}




// Object create
// 1st way to create object {}
// name and rollNumbers are -> own properties 
const person = {
    name : "ravi",
    rollNumber: 1

}

// 2nd way Object.create
// inside prototype the function inside values (objects) are created, but they are not own properties
// Prototype stores extra information 
//  name and rollNumber -> these created in Prototype, it is not own properties
const newPerson = Object.create(person);

console.log("person", person)
console.log("newPerson", newPerson)

// output 
// person {name: 'ravi', rollNumber: 1}
// newPerson {}

console.log(person.name, newPerson.name)
// output
// ravi ravi
console.log(person.name, newPerson.name, person.rollNumber, newPerson.rollNumber)
// output
// ravi ravi 1 1




// 3.get own property names
const person1 = {
    name : "ravi",
    rollNumber: 1

}
const newPerson1 = Object.create(person);

const personOwnPropertyArr = Object.getOwnPropertyNames(person1)
const newPersonOwnPropertyArr = Object.getOwnPropertyNames(newPerson1)
console.log("personOwnProperty", personOwnPropertyArr, newPersonOwnPropertyArr)

//output-> personOwnProperty (2) ['name', 'rollNumber'] []



// 4.object.keys()
const person2 = {
    name : "ravi",
    rollNumber: 1

}
const newPerson2 = Object.create(person);

const keyperson = Object.keys(person2)
const keyNewPerson = Object.keys(newPerson2)

console.log("keyperson", keyperson, keyNewPerson)
// output -> keyperson (2) ['name', 'rollNumber'] []


// 5.object.values()
const person3 = {
    name : "ravi",
    rollNumber: 1

}
const newPerson3 = Object.create(person);

const valuePerson = Object.values(person3)
console.log("valuePerson", valuePerson)
// output ->   valuePerson (2) ['ravi', 1]


// 6.object.entries()
const person4 = {
    name : "ravi",
    rollNumber: 1

}
const newPerson4 = Object.create(person);


const entryPerson = Object.entries(person4)
console.log("entry", entryPerson);
// output
// [Array(2), Array(2)]
// 0: (2) ['name', 'ravi']
// 1: (2) ['rollNumber', 1]

for (const [key, value] of entryPerson) {
    console.log(`${key}: ${value}`)
}
// output
// name: ravi
// 17 rollNumber: 1