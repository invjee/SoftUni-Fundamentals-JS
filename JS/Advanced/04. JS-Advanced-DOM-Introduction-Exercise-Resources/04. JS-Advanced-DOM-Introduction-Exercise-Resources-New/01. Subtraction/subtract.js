function subtract() {
    console.log('Hello');
    const firstNum = document.getElementById('firstNumber').value;
    const secondNum = document.getElementById('secondNumber').value;
    const result =Number(firstNum)-Number(secondNum);
    document.getElementById('result').textContent= result;
}