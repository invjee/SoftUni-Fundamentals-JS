function catalogue(input){
    let catalogueList = {}
    for(let line of input){
        let[name,quantity] = line.split(' : ')
        quantity = Number(quantity)
        let product ={}
        product[name] = quantity
        
        catalogueList= Object.assign(catalogueList, product)
    }
    let firstLetter =''
Object.entries(catalogueList).sort((a,b)=>a[0].localeCompare(b[0]))
.forEach(element=>{
    let currentLetter = element[0].split('').shift()

    if(currentLetter!==firstLetter){
        firstLetter= currentLetter
        console.log(firstLetter)
        console.log(`  ${element[0]}: ${element[1]}`)
    }else{
        console.log(`  ${element[0]}: ${element[1]}`)
    }

    
})
// Object.keys(catalogueList).forEach(element=>{
//     console.log(`${element}====>${catalogueList[element]}`)
// })

        
    


}
catalogue(["Appricot : 20.4",
    "Fridge : 1500",
    "TV : 1499",
    "Deodorant : 10",
    "Boiler : 300",
    "Apple : 1.25",
    "Anti-Bug Spray : 15",
    "T-Shirt : 10"
    ])