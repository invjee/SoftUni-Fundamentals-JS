function order(order, quantity) {
    // •	coffee - 1.50
    // •	water - 1.00
    // •	coke - 1.40
    // •	snacks - 2.00
    let result = 0
    switch (order) {
        case 'coffee': result =quantity*1.50; break;
        case 'water': result =quantity*1.00; break;
        case 'coke': result =quantity*1.40; break;
        case 'snacks': result =quantity*2.00; break;
    }
    return console.log(result.toFixed(2))
    

}
order('water',
    5
)