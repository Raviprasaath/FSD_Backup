// setTimeout basically takes the call back function
// here call back function is my function

// () = {}
// Arrow function as a argumnets and body seperated by => this
// () => {}

// console.log("hello")
// setTimeout ( () => {
//     console.log("ravi")
// }, 5000)
// console.log("bye")

// hello bye printed after 5 sec ravi printed


// console.log("hello")
// setTimeout ( () => {
//     console.log("ravi")
// }, 0)
// console.log("bye")
// output
// hello
// bye
// ravi

// whenever program starts execute it will traverse, when its found setTimeout now its
// sent to WebAPI memory here function execute and timer on 
// then its moved to next line
// executer is very fast when compared to timer
// then after timer that call back function inside the timer sent to task queue 
// in other words, when timer is 0, task queue create a function to excute 
// now event loop - work was it will check task queue had anything
// if task queue had anything now its returnig and task queue becomes empty now

// another example
// now the code had 6 million lines of code
// 0-1 second - 1 million code will run
// 1-2 second - 2 million code will run
// 2-3 second - 3 million code will run
// 3-4 second - 4 million code will run
// 4-5 second - 5 million code will run
// 5-6 second - 6 million code will run
// and we have 4 second timer with function

// but after 4 seconds our setTimout function will not work 
// because for working a setTimeout it stored in TaskQueue, taskqueue only executes when stack becomes empty
// when 10million line is parsing stack empty at the end of 10 million only 
// then after 10 sec, setTimeout 4 sec function will work

// taskQueue correct name macro task name

// one more example

// console.log("start")
// setTimeout (()=> {
//     console.log("b")
// }, 4000);

// setTimeout (() => {
//     console.log("c")
// }, 8000);

// console.log("end")


// output
// start
// end
// after 4 seconds b will print
// after 8 seconds c will print

/*
 Event loop -> algo
This algo of event loops basically runs again n again
for ex 1000 times / seconds

1. to ask if task queue has anything 
NO -> do nothing
Yes ->
    1. Ask Question to stack are you EMPTY
    NO -> do nothing
    Yes -> 
        1.Pop the 1st task from MACRO-TASK QUEUE
        2.Put the task inside the stack

*/



//----------- 05-23-2023 -----------
// ------Quizz
// let str = "abcde";
// str.substring(1, 4)
// ans -> bcd



// promise represnts a future value
// Fetch api to call the server..


// fetch("https://api.kanye.rest/") // here fetch is a promise it return the promise 


// console.log('Hello')
// const promiseOfQuote = fetch("https://api.kanye.rest/") // server take 10sec / 15 sec depends  
// // this fetch acutually calling webAPI or servers
// console.log(promiseOfQuote)
// console.log('bye')

// initially output was
// Hello
// Promise {<pending>}
// bye

// when we open promise
// [[Prototype]]: Promise
// [[PromiseState]]: "fulfilled"
// [[PromiseResult]]: Response



// Promise had 3 condoitions
// 1. pending
// 2. fulfilled
// 3. rejected


// console.log('Hello')
// const promiseOfQuote = fetch("https://api.kanye.rest/").then(response => console.log(response))
// console.log(promiseOfQuote)
// console.log('bye')

// in output response also added now
// Response {type: 'cors', url: 'https://api.kanye.rest/', redirected: false, status: 200, ok: true, …}
// it contains --- body,bodyUsed,headers,redirected,status,statusText,type,url


// console.log('Hello')
// const promiseOfQuote = fetch("https://api.kanye.rest/")
//     .then(responseObj => {
//         console.log(responseObj.status, "this is the status")
//         return responseObj.json() // line changes the response to real data 
//     })
//     .then(data => console.log(data, 'realdata'))
//     console.log(promiseOfQuote)
// console.log('bye')
// output will be
// Hello
// Promise {<pending>}
// bye
// 200 'this is the status'
// {quote: 'We used to diss Michael Jackson the media made us call him crazy ... then they killed him'} 'realdata'



// Example 

const promiseOfQuote1 = 
    fetch("https://api.kanye.rest/")
    // fetch("https://api.kanye.rest12/") //this will give error -> created for see the error message
    .then(responseObj => {
        console.log(responseObj.status)
        return responseObj.json()
    })
    .then (data => {
        // operation here...
        const quote = data.quote;
        // 1. create an element inside the DOM tree
        const h1Element = document.createElement ('h1');
        h1Element.innerText = quote;
        // 2.push that element inside the DOM tree                     
        const body = document.body;
        body.appendChild(h1Element)
        console.log(data)
    })
    .catch (error => {
        // handle that error
        // new beautiful page and i will add it to the body
        console.log('Error is here')
        console.log(error)
    })
    console.log(promiseOfQuote1)


    // now in output -> in HTML page display had the quote in H1 tag



//----------------- 05-25-2023 -----------------
