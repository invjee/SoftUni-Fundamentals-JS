function partytime(input) {
    let listOfguests = {}
    listOfguests['VIP'] = []
    listOfguests['normal'] = []

    let index = 0
    let name = input[index]
   // let partyIndex = 0
    while (name !== 'PARTY'){
        let char = name[0]
        if(!isNaN(char) ){

            listOfguests['VIP'].push(name)
        }else{
            listOfguests['normal'].push(name)
        }

        index++
        name = input[index]
    }
    // Object.entries(listOfguests).forEach(x => {
    //     console.log(`${x[0]}----> ${x[1]}`)
        
    // });
    



    for(let i = index+1; i< input.length; i++){
        let guest = input[i]
        let char = guest[0]
        if(!isNaN(char)){
            let listVIP =  listOfguests['VIP']
            if(listVIP.includes(guest)){
                let index = listVIP.indexOf(guest)
                listVIP.splice(index,1)
            }
        }else{
            let listNormal = listOfguests['normal']
            if(listNormal.includes(guest)){
                let index = listNormal.indexOf(guest)
                listNormal.splice(index,1)

            }
        }
    }
    let sum = listOfguests['VIP'].length+listOfguests['normal'].length
    console.log(sum)
    console.log(listOfguests['VIP'].join('\n'))
    console.log(listOfguests['normal'].join('\n'))
     
   



}
partytime(['7IK9Yo0h',
    '9NoBUajQ',
    'Ce8vwPmE',
    'SVQXQCbc',
    'tSzE5t0p',
    'PARTY',
    '9NoBUajQ',
    'Ce8vwPmE',
    'SVQXQCbc'
]
)