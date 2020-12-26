function neighbourhood(input){

    let neighbors = {}
    let neighbourhoods = input.shift().split(', ')
   // console.log(neighbourhoods)
    for(let name of neighbourhoods){
        neighbors[name] = []
    }

    for(let line of input){
        let[nameNeighborhood, namePerson] = line.split(' - ')

        if(neighbors.hasOwnProperty(nameNeighborhood)){
            let current = neighbors[nameNeighborhood]
            current.push(namePerson)
        }
        
        
    }

    Object.entries(neighbors)
    .sort((a,b)=>{
        return b[1].length - a[1].length
    })
    .forEach(a => {
        
        console.log(`${a[0]}: ${a[1].length}`) 
        a[1].forEach(x=>console.log(`--${x}`))     
    });
    //console.log


}
neighbourhood(['Abbey Street, Herald Street, Bright Mews',
'Bright Mews - Garry',
'Bright Mews - Andrea',
'Invalid Street - Tommy',
'Abbey Street - Billy']
)