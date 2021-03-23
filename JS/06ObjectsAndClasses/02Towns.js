// function towns(input){
//     class Town{
//         constructor(name, latitude, longtitude){
//         this.name = name;
//         this.latitude = latitude
//         this.longtitude = longtitude

        
//     }
//     reading(){
//         console.log(`{ town: '${this.name}', latitude: '${(this.latitude)}', longitude: '${this.longtitude}' }`)
//     }
// }
    

//     for(let names of input){
//         let[name, latitude, longtitude] = names.split(' | ');


//        latitude = Number(latitude).toFixed(2)
//         longtitude= Number(longtitude).toFixed(2)
//         let town = new Town(name, latitude, longtitude);

//         town.reading()
//     }
// }
// towns(['Sofia | 42.696552 | 23.32601',
// 'Beijing | 39.913818 | 116.363625']
// )
function town(input){

    for(let towns of input){
        let[town, latitude, longitude] = towns.split(' | ')
        let townObject = {
            town,
            latitude: Number(latitude).toFixed(2),
            longitude: Number(longitude).toFixed(2)
        }

        console.log(townObject)

    }

}
town(['Sofia | 42.696552 | 23.32601',
'Beijing | 39.913818 | 116.363625'])



