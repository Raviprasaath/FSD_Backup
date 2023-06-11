// 05-30-2023
/* 
class based -> c, c++, java, django
class -is a template for new object

Prototype based lang -
there is a object - which serves the template for a new object


JS is not class based, partial class based lang
classes are introduced in es6 only



Class ->1. Methods
2. Properties
3. Constructor  
*/
/*
class Car {
    model = "base";
    speed;

    constructor (speed, model) {
        this.model = model;
        this.speed = speed;
    }
    canIDrive () {
        console.log("yes");
    }
}

const audi = new Car("123", "v8");
console.log(audi)           //Car {model: 'base', speed: undefined}
console.log(audi.model)     // base
console.log(audi.canIDrive()) //Yes

// Before ES6 -> Constructor function
function CarConstructor (sp, md) {
    this.speed = sp;
    this.model = md;
    this.canIDrive = function() {
        console.log("i am driving hundai", this.speed);
    }
}

const hundai = new CarConstructor(2000, "prime model")
console.log(hundai);    //CarConstructor {speed: 2000, model: 'prime model', canIDrive: ƒ}

console.log(hundai.model, hundai.speed)     //prime model 2000
hundai.canIDrive();             // i am driving hundai 2000



// Circle Object -> radius, location -> {x, y}

function Circle (radius, poistion) {
    this.radius = radius;   // 'this' keyword is CONTEXT
    this.location = poistion;
    this.draw = function() {
        console.log("location x", this.location.x, "location y", this.location.y)
    }
}


const goodCircle = new Circle(10, {x:10, y:15});
console.log(goodCircle) 
goodCircle.draw();      //location x 10 location y 15





// The fear of THIS
// to understand this we need to understand the concept of callsite......
function foo() {
    console.log("foo")
}
foo();
// call site of foo is - global
// call site means from where the function is called


// context is decided by callSite


// bar is defined in global
// called in global
function bar() {
    console.log("bar");
    foo(); //call site this function is foo

    foo; //-> this is not call site
}
bar(); // global


// 4 rules  to determine the context
*/

    // Rule 1: default binding....


// function foo() {
//     console.log(this.abc)   // output was undefined
//     // here 'this' is WIndow object and 'this' keyword is context
//     console.log(this)
// }
// foo(); //-> call site and there is no extra information
// entra info means foo(1, 2) so like we not giving anything
// and this is called in global
// and window is the global 





//     // Rule 2: implicit binding....
//     // JS will determine the context

// function foo() {
//     console.log(this)
// }


// var obj = {
//     name: "ravi",
//     rollNo: 12,
//     func: function() {
//         console.log("abcd") //abcd
//         console.log(this.name, this.rollNo) //ravi, 12
//     }  
// }

// obj.func()  //-> this is call site
// here extra info is attached before the dot(.), and that is obj
// obj is context of this function-> ( func() )


// obj1.obj2.obj3.func()   -> here obj3 is immediatly attached to it
// and obj3 is the context of this function


// 06-01-2023 -> only below 2 concepts

// Example 2: No matter of changing the object, context would be the last Object
// let obj3 = {
//     class: "9th",
//     name: "obj3",
//     sum: function(a,b) {
//         console.log(a+b)    // 3
//         console.log(this)   //{class: '9th', name: 'obj3', sum: ƒ}
//     }
// }
// let obj2 = {
//     name: "obj2",
//     obj3: obj3
// }
// let obj1 = {
//     name: "obj1",
//     obj2: obj2
// }
// obj1.obj2.obj3.sum(1, 2)


// Pitfalls of Implicit Binding

// example 1
// function sum() {
//     console.log("hey there sum")
// }
// // sum()
// // instead of calling above i can copy by below thing and i can call
// const sumCopy = sum;
// sumCopy()


// // example 2
// let obj5 = {
//     name: "ravi",
//     sum: function(a, b) {
//         console.log("sum of ", a, b);   //sum of  1 2 & for sumCopy2(1, 3)-> sum of  1 3
//     }
// }
// // obj5.sum(1,2)   // this is a call site

// const sumCopy2 = obj5.sum    // this is not a call site
// sumCopy2(1,3)   // this is a call site



// ------------Real Pitfall------------
// let obj = {
//     name: "ravi",
//     num1: 1,
//     num2: 2,
//     sum: function() {
//         console.log("hey")
//         // context -> this -> obj
//         console.log(this)   //window
//         const sum = this.num1 + this.num2;
//         console.log(sum);
//     }
// }
// // console.log(obj.num1); // 1 (output)
// // obj.sum();  // CALL SITE  //hey 3 (output)

// // the above thing is usual 
// let sumCopy = obj.sum;   // implicit binding is lost when we have different call sets
// sumCopy();  // (output) hey NaN //This is default binding
// // so this -> window--------> window.num1 is undefined
// // undefined+undefined = NaN




// -apply
// function foo(a, b) {
//     this.a = a;
//     this.b = b;
//     console.log(this, a, b)  // {a:1, b:2}1 2
// }
// var obj = {
//     a: 1,
//     foo: foo
// }
// var obj2 = {};
// obj.foo.call(obj2, 1, 2)    //call site //{a: 1, b: 2} 1 2
// obj.foo.apply(obj2, [2, 4]) //call site //{a: 2, b: 4} 2 4
// console.log(obj2)   //{a:1, b:2}



// bind
// function foo(a, b) {
//     this.a = a;
//     this.b = b;
//     // console.log(this, a, b)
// }
// const obj1 = {
//     foo: foo
// }

// const fooCopy = obj1.foo.bind(obj1, 12, 25)

// // console.log(obj1)   //{foo: ƒ};
// fooCopy();
// console.log(obj1, "obj1");  //{a: 12, b: 25, foo: ƒ} 'obj1'





// 05-30-2023 - continuing
/*
    Rule 3: Explicit binding....
    User or Dev will tell the JS what is the context 
    JS will not determine the context it self

    call, apply, bind

    all these methods are used to do 1 thing
    1. to set the context of the calling function
*/

// way 1 to call a function


// 1. calling by abc(1, 2)
// function abc(a, b) {
    //     // here context is window
    //     console.log(this)   // window objects are print
    //     console.log("adfsd", a, b)  // adfsd 1 2
    //     console.log("answer", this.a) //answer undefined
    // }
// abc(1,2);   // call site of abc is global 
// call site means at which place the function is getting exected 





// way 2 to call a function

// // 2.calling by abc.call(obj, 10, 20)
// function foo() {
//     console.log(this)
// }
// var obj = {
//     a:1,
//     food: foo
// }

// function abc(a, b) {
//     // here context is window
//     console.log(this," this")   // {a: 1, food: f} ' this'
//     console.log("adfsd", a, b)  // adfsd 10 20
//     console.log("answer", this.a) //answer 1
// }
// abc.call(obj, 10, 20)



// Rule no 4 -> new keyword()
// new keyword creates a blank object


// ----------------------
// 06-01-2023

// its like Scanner sc = new Scanner()
// Car audi = new Car();
// inside Car object the blank object is {}

// Rules Precedence -> If two or more rules fight then who will win
// new keyword is higher precedence, it can overtake any thing like-> implicit, explicit, default
//  new > explicit > implicit > default 

// function foo (str) {
//     this.a = str;
// }
// var obj1 = {
//     foo: foo
// }

// var obj2 = {
//     name: "obj2"
// }

// obj1.foo("hey there")   //this is the purest from of implicit binding
// console.log(obj1) //{a: 'hey there', foo: ƒ}


// // Implicit vs Explicit
// obj1.foo.call(obj2, "impl vs expl") // foo will have the context of obj2
// obj1.foo.call(null, "impl vs expl") // foo will have the context of Window obj
// // 'use strict'
// // obj1.foo.call(null, "impl vs expl") // foo will have the context of null

// console.log(obj1)   //{a: 'hey there', foo: ƒ}
// console.log(obj2)   //{name: 'obj2', a: 'impl vs expl'}


// ----------new Keyword----------
// let car = new obj1.foo("new implicit")
// console.log(car)    // foo {a: 'new implicit'}
// console.log(obj1)   // {a: 'hey there', foo: ƒ}


// --------new vs Explicit -------not working will see later
// let car = new obj1.foo.call(obj2, "implicit")












//---------- Property Descriptors----------
// 1. Enumerable
// let obj = {
//     name: "ravi",
//     rollNumber: 45,
//     address: "road",
// }
// console.log (obj.propertyIsEnumerable("name")) //true
// console.log (obj.propertyIsEnumerable("rollNumber")) //true
// console.log (obj.propertyIsEnumerable("address")) //true

// // propertyIsEnumerable
// console.log(obj)    //{name: 'ravi', rollNumber: 45, address: 'road'}

// for(const key in obj) {
//     console.log(key)
// }
// output
// name
// rollNumber
// address

// Enumerable -> the properties which are enumerable will be of for in
// else that property will not be part


// ---------06-04-2023--------



// Object.defineProperty(obj, 'address', {
//     value: "dadad",
//     enumerable: false
// })
// console.log(obj)    // in console address color was changed into faded
// for(const key in obj) {
//     console.log(key)    //here name and rollNumber only print
// }
// Object.defineProperty(obj, 'getCash', {
//     value: "dadad",
//     enumerable: true
// })
// for(const key in obj) {
//     console.log(key)    //output was name, rollNumber, getCash (because enumerable given has true, so the value was added in the array)
// }





// 2.Writable

// writable basically means the value can be changed...

// let obj3 = {
//     name : "ravi",
//     rollNumber:20,
//     address: "edfa"
// }

// you can't do this because inside defineProperty, the property is checked
// Object.defineProperty(obj3, "cash", {
//     value: 100,
//     writable: true,
//     enumerable: true
// })
// console.log(obj3)   //{name: 'ravi', rollNumber: 20, address: 'edfa', cash: 100}
// console.log(obj3.cash) // 100;
// obj3.cash = 90;
// console.log(obj3.cash) // 90; // writable must be true, if its a false means then value will be 100 only

/*
    writable -> cant edit the vlaue of property, but can delete it,
    Configurable -> cant delete the property but can change the value of the property,
    enumerable -> to be part of for in loop.
*/





// 3.Configurable
// Properties of an object can be modified, deleted and new property can add

// let obj4 = {
//     name:"ravi"
// }
// Object.defineProperty(obj4, "class", {
//     value: "9th class",
//     enumerable: true,
//     writable: true,
//     configurable: true,
// })
// // console.log(obj4, "obj4")   //{name: 'ravi', class: '9th class'} 'obj4'
// delete obj4.class
// // console.log(obj4) //{name: 'ravi'}  //for this configurable must be true
// obj4.class  = "14"
// console.log(obj4) // {name: 'ravi', class: '14'}    // for this writable must true








// 4.Own Property
//  the property of an object which is directly in the  object and not in the Prototype.

// const CarObject = {
//     canMove : true,
//     func: function() {
//         console.log("CarObject", CarObject);
//     }
// }
// console.log(CarObject);     // {canMove: true, func: ƒ}
// const descriptors = Object.getOwnPropertyDescriptor(CarObject, "canMove");
// console.log(descriptors, "descriptors")    // {value: true, writable: true, enumerable: true, configurable: true}

// let carAudi = new CarObject();
// console.log(carAudi, "class car")
// carAudi.func();


// one more example





// class Car {
//     canmove

//    func(){
//     // console.log("car audi");    //car audi
//    }
// }


// const carObj = {
//     canMove: true,
//     func: function() {
//         // console.log("carObj", carObj);
//     }
// }

// // console.log(carObj)     //{canMove: true, func: ƒ}

// const descriptors = Object.getOwnPropertyDescriptor(carObj, "func")
// // console.log(descriptors, "descriptors fuc")     //{writable: true, enumerable: true, configurable: true, value: ƒ}'descriptors fuc' 


// let carAudi = new Car();

// // console.log(carAudi) // Car {canmove: undefined}

// const descriptors1 = Object.getOwnPropertyDescriptor(carAudi, "func")
// const descriptors2 = Object.getOwnPropertyDescriptor(carAudi, "canmove")
// //console.log(descriptors1, "descriptors fuc")    //undefined 'descriptors fuc'
// // console.log(descriptors2, "descriptors canMove")    //{value: undefined, writable: true, enumerable: true, configurable: true} 'descriptors canMove'

// console.log(carAudi, "c;lass car")  //Car {canmove: undefined} 'c;lass car'
// carAudi.func()







//  Few Derivative() properties of Object
// Object.seal // it changes the configurable property into false

// Object.seal -> you cant DELETE the existing properties and you cant ADD new Properties.
//  you can modify the value of existing properties


const object1 = {
    property1: 42
  };
  
Object.seal(object1);   // when seal came config turns into false


console.log(Object.getOwnPropertyDescriptor(object1, "property1"))

// delete object1.property1;

// // adding new property not possible in seal
// object1.abcd = "sdasdas"

// console.log(object1)




// Object.freeze --> both config and writable becomes false
// freeze is superset of seal -> 
// no ADDITION, DELETION and EDITION of properties.

// const object1 = {
//     property1: 42
//   };
// Object.freeze(object1)

// console.log(Object.getOwnPropertyDescriptor(object1, "property1"))


// // cant add property
// object1.abcd = "asdasdasdd"

// // cant edit the property
// object1.property1 = 99;

// // cant delete the property

// delete object1.property1

// console.log(object1)



/*
    Date and Time Object.... 
*/
// according to program 1970 JAN 1 was date started

// const rightNowDate  = new Date()
// console.log(rightNowDate)

// Date, 

// console.log(rightNowDate.getTime(), "time") // time in MIlli seconds from 1970 Jan 1 
// console.log(rightNowDate.getDay(), "Day") 
// console.log(rightNowDate.getDate(), "Date")
// console.log(rightNowDate.getFullYear(), "year")


// EDITING DATE OBJECT ->  SET 

// date
// rightNowDate.setDate(15)

// rightNowDate.setFullYear(2099)

// rightNowDate.

// edit the milliseconds
// minutes, hours, seconds.

// console.log(rightNowDate)


//  ------  get UTC time -----------

// const rightNowDate  = new Date() // IST 
// console.log(rightNowDate, "IST time");

// const utcTime = rightNowDate.toUTCString();

// console.log(utcTime, "utc time");

// // const offset = new Date(utcTime).

// console.log(offset, "offset")


// -------- MATH ----------------------

// let date = new Date();


// let dateAdd2Hrs = new Date()

// //  added 5 min 
// dateAdd2Hrs.setTime(date.getTime() + 300000)

// console.log(dateAdd2Hrs, date)


// console.log( dateAdd2Hrs - date)




/*

    SUGGESTION: see the MOMENT library .. (need to check)
*/

