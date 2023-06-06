let hour = document.getElementById('hour');
let hours = document.getElementById('hours');
let min = document.getElementById('min');
let mins = document.getElementById('mins');
let second = document.getElementById('second');
let seconds = document.getElementById('seconds');


hours.innerHTML = 'Hours';
mins.innerHTML = 'Mins';
seconds.innerHTML = 'Seconds';

function clock() {
    let h = new Date().getHours();
    let m = new Date().getMinutes();
    let s = new Date().getSeconds();

    if (h > 12) {
        h = h-12;
        ampm.innerHTML = "PM";
    } else {
        ampm.innerHTML = 'AM';
    }
    
    h = h<10 ? '0'+h:h;
    m = m<10 ? '0'+m:m;
    s = s<10 ? '0'+s:s;

    hour.textContent = h;
    min.textContent = m;
    second.textContent = s;
    setTimeout(()=> {
        clock();
    }, 1000);
}

clock();

