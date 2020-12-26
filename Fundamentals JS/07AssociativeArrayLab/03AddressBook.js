function addressBook(input){
    let addresses = {}

    for(let line of input){
        let[name,place] = line.split(':')
        addressBook[name]= place
    }
    Object.entries(addressBook).sort((a, b)=>{
 return a[0].localeCompare(b[0])
    }).forEach(element => {
        console.log(`${element[0]} -> ${element[1]}`)
    });


}
addressBook(['Tim:Doe Crossing',
 'Bill:Nelson Place',
 'Peter:Carlyle Ave',
 'Bill:Ornery Rd']
)