function solve(input) {
    let map = new Map();

    for (let line of input) {
        let [product, qty] = line.split(' ')
        qty = Number(qty)
        if (map.has(product)) {
qty += map.get(product)

        }
        
            map.set(product, qty)
        
    }

    for(let[name, qty] of map){
        console.log(`${name} -> ${qty}`)
    }

} solve(['tomatoes 10',
    'coffee 5',
    'olives 100',
    'coffee 40']
)