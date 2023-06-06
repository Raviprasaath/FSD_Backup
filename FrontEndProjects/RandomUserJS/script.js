// javascript code goes here
/*
function getUser() {
    return fetch('https://randomuser.me/api/')
        .then(response => {
            return response.json();
        })
        .then(data => {
            return data.results[0]; 
        })
}
const fullName = document.getElementById('full-name');
const sectionP = document.querySelector('section p');

const ageBtn = document.querySelector('[data-attr="age"]')
const emailBtn = document.querySelector('[data-attr="email"]')
const phoneBtn = document.querySelector('[data-attr="phone"]')

let ageFn;
let emailFn;
let phoneFn;

function main() {
    getUser().then (user => {

        fullName.textContent = user.name.first + " " + user.name.last;
        const img = document.createElement('img');
        img.src = user.picture.large;
        img.style.width = '200px';
        fullName.parentElement.appendChild(img)

        ageFn = function() {
            sectionP.textContent = user.dob.age;
        }
        ageBtn.addEventListener('click', ageFn);
        
        emailFn = function() {
            sectionP.textContent = user.email;
        }
        emailBtn.addEventListener('click', emailFn);

        phoneFn = function() {
            sectionP.textContent = user.phone;
        }
        phoneBtn.addEventListener('click', phoneFn);
    })
}

const newUserBtn = document.getElementById('getUser');
newUserBtn.addEventListener('click', function() {
    fullName.textContent = ''
    sectionP.textContent = ''

    const img = document.querySelector('#user-data img')
    img.remove();

    ageBtn.removeEventListener('click', ageFn);
    emailBtn.removeEventListener('click', emailFn)
    phoneBtn.removeEventListener('click', phoneFn)

    main();
})

main();

*/
//------------------------------Method 2 by Async and Await-----------------------------


async function getUser() {
    const response = await fetch('https://randomuser.me/api/');
    const data = await response.json();
    return data.results[0];
}
const fullName = document.getElementById('full-name');
const sectionP = document.querySelector('section p');

const ageBtn = document.querySelector('[data-attr="age"]')
const emailBtn = document.querySelector('[data-attr="email"]')
const phoneBtn = document.querySelector('[data-attr="phone"]')

let ageFn;
let emailFn;
let phoneFn;

async function main() {
    const user = await getUser();

    fullName.textContent = user.name.first + " " + user.name.last;
    const img = document.createElement('img');
    img.src = user.picture.large;
    img.style.width = '200px';
    fullName.parentElement.appendChild(img)

    ageFn = function() {
        sectionP.textContent = user.dob.age;
    }
    ageBtn.addEventListener('click', ageFn);
    
    emailFn = function() {
        sectionP.textContent = user.email;
    }
    emailBtn.addEventListener('click', emailFn);

    phoneFn = function() {
        sectionP.textContent = user.phone;
    }
    phoneBtn.addEventListener('click', phoneFn);
}

const newUserBtn = document.getElementById('getUser');
newUserBtn.addEventListener('click', function() {
    fullName.textContent = ''
    sectionP.textContent = ''

    const img = document.querySelector('#user-data img')
    img.remove();

    ageBtn.removeEventListener('click', ageFn);
    emailBtn.removeEventListener('click', emailFn)
    phoneBtn.removeEventListener('click', phoneFn)

    main();
})

main();
