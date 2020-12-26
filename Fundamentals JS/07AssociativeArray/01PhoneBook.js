function solve(input){
    let phonebook = {}

    for(let line of input){
        let [name, phone] = line.split(' ')
        phonebook[name] = phone
        //console.log(`${name} -> ${phone}`)
    }
    // for(let key in phonebook){
    //     console.log(`${key} -> ${phonebook[key]}`)
    // }
    Object.keys(phonebook).forEach(element => {
        console.log(`${element} -> ${phonebook[element]}`)
        
    });
   


//console.log(phonebook)
}
solve(['Tim 0834212554',
'Peter 0877547887',
'Bill 0896543112',
'Tim 0876566344']
)
