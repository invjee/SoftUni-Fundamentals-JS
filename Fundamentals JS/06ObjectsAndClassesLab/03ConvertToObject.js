function convertJSON(input){
    let myObjJSON = JSON.parse(input);
    for(let key of Object.keys(myObjJSON)){
        console.log(`${key}: ${myObjJSON[key]}`)
    }

}
convertJSON('{"name": "George", "age": 40, "town": "Sofia"}')


