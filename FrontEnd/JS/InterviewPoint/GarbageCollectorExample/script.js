function a() {
    var x = 0, z = 10;
    return function b() {
        console.log(x);
    }
}

var y = a();
y();

// here z is not used any where, if we console the z means it will shows Reference error,
// becoz when y is executed Garbage collector will collect the z 
