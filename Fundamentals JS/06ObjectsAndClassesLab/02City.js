function city(input){
    let city = input

    let cityKeys = Object.keys(city)
    for(let key of cityKeys){
        let value = city[key]
        console.log(`${key} -> ${value}`)
    }
    



}
city({
    name: "Sofia",
    area: 492,
    population: 1238438,
    country: "Bulgaria",
    postCode: "1000"
}
)