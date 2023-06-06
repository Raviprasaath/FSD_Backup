const btn = document.getElementById('btn');
let attach = document.createElement('div');
const container = document.getElementById('container');
container.appendChild(attach);


btn.addEventListener('click',(e)=> {
    e.preventDefault();
    
});

btn.addEventListener('click', display);
function display() {
    const input = document.getElementById('input');
    let city = (input.options[input.selectedIndex].value)
    
    
    let cityname = '', population = 0, literacyRate = 0, language = '';
    switch (city) {
        case 'coimbatore':
            cityname = 'Coimbatore'
            population = 34234324;
            literacyRate = 99;
            language = 'Tamil';
            break;
            case 'chennai':
            cityname = 'Chennai'
            population = 23435435;
            literacyRate = 88;
            language = 'Tamil';
            break;
            case 'bangalore':
            cityname = 'Bangalore'
            population = 453552;
            literacyRate = 89;
            language = 'Kannada';
            break;
            case 'kochi':
            cityname = 'Kochi'
            population = 435452;
            literacyRate = 99;
            language = 'Malayalam';
            break;
            case 'pune':
            cityname = 'Pune'
            population = 67372;
            literacyRate = 50;
            language = 'Hindi';
            break;
        default :
            population = 0;
            literacyRate = 0;
            language = 'None';
            break;
    }
    let para = `${cityname} is the one of major city and it had a 
    population of ${population} and their Literacy Rate was ${literacyRate} 
    and their 1st language is ${language}`
    attach.textContent = para;
}