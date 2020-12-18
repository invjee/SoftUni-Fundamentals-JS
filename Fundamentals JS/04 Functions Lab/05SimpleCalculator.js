function calculator(a, b, operator) {
   // 'multiply', 'divide', 'add', 'subtract'
    let result = 0
    let multiply =(x, y) => x * y;
    let divide =(x, y) => x / y;
    let add =(x, y) => x + y;
    let subtract = (x, y) => x - y;

    switch (operator) {
        case 'multiply': console.log(multiply(a,b)); break;
        case 'divide':console.log(divide(a,b)); break;
        case 'add':console.log(add(a,b)); break;
        case 'subtract':console.log(subtract(a,b)); break;
    }
}
calculator(40,
    8,
    'divide'
    
    )