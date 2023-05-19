

function outside() {
    var c = 20;
    function outer(b) {
        function inner () {
            console.log(a, b, c);
        }
        return inner;
    }
    // let a = 10;    // if this is on means output was ->   10 hello 20
    return outer;
}
let a = 100;
var close = (outside())("helllo");
close();

// output ->    100 helllo 20