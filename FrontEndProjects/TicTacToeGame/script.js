// javascript code goes here
// let board = document.querySelector(".tic-tac");
let player = document.querySelector(".displayName");
player.textContent = 'Player 1- Move';

let currentPlayer = 'X';
let gameBoard = ["","","","","","","","",""];


let buttonSelector = document.querySelectorAll(".hit");

buttonSelector.forEach((button) => button.addEventListener('click', play));
function play(e) {
    let idx = e.target.id-1;
    gameBoard[idx] = currentPlayer;
    e.target.innerText = currentPlayer;
    let testwinOrLoss = winOrLoss(gameBoard);
    if (testwinOrLoss) {
        if (testwinOrLoss === 'X') {
            alert("Congratulations! Player1 wins");
        } else {
            alert("Congratulations! Player2 wins");
        } 
    } else if (!gameBoard.includes("")) {
        alert("Draw!");
    }
        currentPlayer = currentPlayer === "X" ? "0" : "X";
        player.textContent = player.textContent === "Player 1- Move" ? "Player 2- Move" : "Player 1- Move";   
    }
    function winOrLoss (board) {
        let winPossibilites = [
            [0, 1, 2] ,
            [2, 5, 8] ,
            [6, 7, 8] ,
            [0, 4, 8] ,
            [1, 4, 7] ,
            [2, 4, 6] ,
            [3, 4, 5] ,
            [0, 3, 6]
        ]
        for (let combo of winPossibilites) {
            let [a, b, c] = combo;
            if (board[a] && board[a] === board[b] && board[b] === board[c]) {
                return board[a];
            }
        }
        return null;
    }