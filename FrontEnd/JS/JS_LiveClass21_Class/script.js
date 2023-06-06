// 06-04-2023
// OOPs advance

// revision
// Methods inside COnstrctor property is own
// In class methods are not own properties

// class Car {
//     model = "basic engin";
//     speed;

//     constructor(speed, model) {
//         this.model = model;
//         this.speed = speed;
//     }

//     canIDrive() {
//         console.log("Yes i can drive with speed", this.speed)
//     }
// }

// // audi

// const audi = new Car("123", "v8");
// const bugati = new Car("423", "Bug 124");
// console.log(audi, "audi")   //Car {model: 'v8', speed: '123'} 'audi'
// console.log(bugati, "bugati")   //Car {model: 'Bug 124', speed: '423'}'bugati'

// audi.canIDrive()    //Yes i can drive with speed 123
// bugati.canIDrive()  //Yes i can drive with speed 423



// function CarConstructor(sp, md) {
//     this.speed  = sp;
//     this.model = md; 
//     this.canIDrive = function() {
//         console.log("Yes i can drive hundai with speed", this.speed)
//     }
// }

// const hundai = new CarConstructor(2000, "prime model number")

// const hundai1 = new CarConstructor(20001, "humdai 1 ")


// console.log(hundai, "hundai")   //CarConstructor {speed: 2000, model: 'prime model number', canIDrive: ƒ} 'hundai'
// console.log(hundai1, "hundai 1")//CarConstructor {speed: 20001, model: 'humdai 1 ', canIDrive: ƒ} 'hundai 1'

// (paper notes)

// Comparing both Constructor function and class Objects,
// we can see the METHODS are not created in class adn hence it saves 
// a lot of space and time.



/*
    INHERITANCE

*/
/*
class Car {
    wheels;
    fuelTank;
    modelNumber;

    constructor() {
        this.wheels = 4;
        this.fuelTank = "petrol";
        this.modelNumber = "Bsic 1"
    }

    canIDrive() {
        console.log("I can drive");
    }
}


class BMWCar extends Car{
    sportsMode;
    AirBags;
    Nitros;

    constructor(sportsMode, AirBags, Nitros) {
        super() // super refers to the parent parent()
        this.sportsMode = sportsMode;
        this.AirBags = AirBags;
        this.Nitros = Nitros;
    }

    canIDriveBMW() {
        console.log("No I cant");
    }
}


const bmwClassC = new BMWCar("Leve 3", 2, 100);
console.log(bmwClassC, "bmwClass C")   //BMWCar {wheels: 4, fuelTank: 'petrol', modelNumber: 'Bsic 1', sportsMode: 'Leve 3', AirBags: 2, …} 'bmwClass C'


bmwClassC.canIDriveBMW();   //No i cant
bmwClassC.canIDrive();    // I can drive

*/

