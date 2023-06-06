// javascript code goes here
function getIssues(page) {
    const url = `https://api.github.com/repositories/1296269/issues?page=${page}&per_page=5`
    return fetch(url) 
        .then(response => {
            return response.json();
        })
        .then (data => {
            return data;
        })
}
let currentPage = 1;
function displayIssuesForPage(page) {
    const container = document.getElementById('issue_container');
    for (const child of container.children) {
        child.remove();
    }
    container.innerHTML = '';

    getIssues(page)
        .then(issues => {
            for (const issue of issues) {
                const li = document.createElement('li');
                li.textContent = issue.title;
                container.appendChild(li);
            }
        });
}

function main() {
    const nextPageBtn = document.getElementById('load_next');
    const prevPageBtn = document.getElementById('load_prev');
    const pageIndicator = document.getElementById('page_indicator');

    nextPageBtn.addEventListener('click', function() {
        currentPage++;
        displayIssuesForPage(currentPage);
        pageIndicator.textContent = `Page number ${currentPage}`;
    });

    prevPageBtn.addEventListener('click',  function() {
        if (currentPage === 1) {
            return;
        }
        currentPage--;
        displayIssuesForPage(currentPage);
        pageIndicator.textContent = `Page number ${currentPage}`;
    });
    displayIssuesForPage(currentPage)
}
main();