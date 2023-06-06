let btn = document.getElementById('watch');
btn.addEventListener('click', ()=> {
    let videoClip = document.getElementsByClassName('active')[0];
    let videoClip1 = document.getElementsByClassName('active')[1];
    videoClip.style.visibility = 'visible'
    videoClip1.style.visibility = 'visible'
    let totalScreen = document.getElementById('totalScreen');
    totalScreen.style.filter = 'blur(4px)';
})

let closeBtn = document.getElementsByClassName('fa-xmark')[0];
closeBtn.addEventListener('click', ()=> {
    let videoClip = document.getElementsByClassName('active')[0];
    let videoClip1 = document.getElementsByClassName('active')[1];
    videoClip.style.visibility = 'hidden'
    videoClip1.style.visibility = 'hidden'
    let totalScreen = document.getElementById('totalScreen');
    totalScreen.style.filter = 'blur(0)';
})