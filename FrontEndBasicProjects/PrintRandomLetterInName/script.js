
let btn = document.getElementById('clik');

btn.addEventListener('click', ()=> {    
    let named = document.getElementById('name').innerText;
    // console.log(named.innerText)
    let RandomNumber = named.charAt( Math.floor(Math.random()*named.length));
    console.log(RandomNumber);
});


