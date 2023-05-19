
// basic way not good way
// function counter() {
//     var count = 0;
//     return function increment() {
//         count++;
//         console.log(count);
//     }
// }

// var count1 = counter();
// count1();   // output 1
// count1();   // output 2
// count1();   // output 3
// count1();   // output 4
// count1();   // output 5

// var count2 = counter();
// count2();    // output 1 it considering new counter
// count2();    // output 2 



// good way -> constructor method
function counter() {
    var count = 0;
    this.incrementCounter = function() {
        count++;
        console.log(count);
    }
    this.decrementCounter = function() {
        count--;
        console.log(count);
    }
}
var counter1 = new counter();
counter1.incrementCounter();  //output 1
counter1.incrementCounter();  //output 2
counter1.decrementCounter();  //output 1
