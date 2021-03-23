function search(arr1, arr2){
    let takeNumbers= arr2[0];
    let deleteNumbers = arr2[1]
    let searchNumber= arr2[2]

    let collection = arr1.slice(0,takeNumbers)
    collection.splice(0,deleteNumbers)
let count=0
//console.log(collection)
    while(collection.includes(searchNumber)){
        count++
        let index = collection.indexOf(searchNumber)

        collection.splice(index,1)

    }
    console.log(`Number ${searchNumber} occurs ${count} times.`)

}
search([5, 2, 3, 4, 1,3, 6,3],
    [8, 2, 3]
    )