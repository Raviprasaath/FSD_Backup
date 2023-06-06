// javascript code goes here

async function movieDisplay() {
    try {
        const response = await fetch("https://api.themoviedb.org/3/movie/top_rated?api_key=f1a87d30ad8792e0dd1c12ce07d37337&language=en-US&page=1");
        const data = await response.json();
        let movies = data.results;
        movieCard(movies);

    } catch (error) {
        console.log(error);
    }
}

function movieCard(movie) {
    movie.forEach(film => {  
        let year = new Date(film.release_date).getFullYear();
        let movieDetails = 
        `<div class="movie">
            <img class="poster" src="https://image.tmdb.org/t/p/w500${film.poster_path}" alt="${film.title}">
            <div>
                <h2 class="movie-title">${film.title}</h2>        
                <p class="release-year">${year}</p>        
                <p class="movie-overview">${film.overview}</p>
            </div>
        </div>`
        let movieID = document.getElementById('movies');
        movieID.innerHTML += movieDetails 
    });
    
}
function asccending() {
    const moviesContainer = document.getElementById('movies');
    const movies = Array.from(moviesContainer.children);
    movies.sort((a, b) => {
    const yearA = parseInt(a.querySelector('.release-year').textContent);
    const yearB = parseInt(b.querySelector('.release-year').textContent);
    return yearA - yearB;

  });
  movies.forEach(movie => moviesContainer.appendChild(movie));
}
function deccending() {
    const moviesContainer = document.getElementById('movies');
    const movies = Array.from(moviesContainer.children);
    movies.sort((a, b) => {
    const yearA = parseInt(a.querySelector('.release-year').textContent);
    const yearB = parseInt(b.querySelector('.release-year').textContent);
    return yearB - yearA;    
  });
  movies.forEach(movie => moviesContainer.appendChild(movie));
}


function order() {
    (document.getElementById('sort')).addEventListener('change', ()=>{
        if ((document.getElementById('sort').value ) === 'asc') {
            asccending();
        } else {
            deccending();
        }
    })
    
}
order()
movieDisplay();
