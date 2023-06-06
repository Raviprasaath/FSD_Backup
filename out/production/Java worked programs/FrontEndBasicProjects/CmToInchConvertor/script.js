
let btnAction = document.getElementById('clicking');
btnAction.addEventListener('click', ()=> {
    let inputVal = Number(document.getElementById('inputVal').value);
    let convert = inputVal / 2.54;
    const ans = document.getElementById("ans");
    ans.innerHTML = convert.toFixed(2) + "inch";  // tofix to control the digit
});
