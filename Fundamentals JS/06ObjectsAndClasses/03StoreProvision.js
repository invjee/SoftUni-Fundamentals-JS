function storeProvision(arr1, arr2){


    let store ={}
    for(let i = 0; i<arr1.length; i+=2){
        
            
            store[arr1[i]] = Number(arr1[i+1])
                 
    } 
    for(let j =0; j<arr2.length; j+=2){
        const element = arr2[j]
        if(store[element]){
            let elementValue = Number(arr2[j+1])
            store[element] += elementValue
        }
        else{
            let elementValue = Number(arr2[j+1])
            store[element] = elementValue
        }

}
   Object.keys(store).forEach(key => {
       console.log(`${key} -> ${store[key]}`)
       
   });

    

}
storeProvision([
    'Chips', '5', 'CocaCola', '9', 'Bananas', '14', 'Pasta', '4', 'Beer', '2'
    ],
    [
    'Flour', '44', 'Oil', '12', 'Pasta', '7', 'Tomatoes', '70', 'Bananas', '30'
    ])