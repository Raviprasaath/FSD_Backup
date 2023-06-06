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
/*
    Rule 1: default binding....
*/

function foo() {
    console.log(this.abc)   // output was undefined
    // here 'this' is WIndow object
    console.log(this)
}
foo();


/*
    Rule 2: implicit binding....
    JS will determine the context
*/
function foo() {
    console.log(this)
}


var obj = {
    name: "ravi",
    rollNo: 12,
    func: function() {
        console.log("abcd") //abcd
        console.log(this.name, this.rollNo) //ravi, 12
    }  
}

obj.func()

/*
    Rule 3: Explicit binding....
    User or Dev will tell the JS what is the context 
    JS will not determine the context it self

    call, apply, bind
*/

// way 1 to call a function
function abc(a, b) {
    console.log("adfsd", a, b)
}

abc.call(undefined, 1, 2) 
