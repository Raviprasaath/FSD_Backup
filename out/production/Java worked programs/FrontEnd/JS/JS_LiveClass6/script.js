//    ----------- 20-04-2023 ---------

// 1. for each


// 1.parent -> for each
// 2.callback -> () => {}
// ptint out Element
// user function arrow function

// for each is going to every index

// for each of your element i want excute my own function
// for each - to go to every element

let arr = [11,25,36,48,54,63,79,81]

arr.forEach (
    (value, index, array) => {
        console.log(value, index , array, 'hey there i am traversing')
    }
)