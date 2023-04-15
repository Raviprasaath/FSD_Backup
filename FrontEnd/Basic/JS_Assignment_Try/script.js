const obj1 = {"name": "John","age": "32","location": "New York"}

solve(obj1)

function solve(obj){
    for (let x of obj) {
        console.log(x)
    }
 
    for (let x in obj) {
        console.log(x)
    }
 

}