function parkingLot(input){
    let parking = {}
    for(let line of input){
        let[direction, number] = line.split(', ')
        if(direction=== 'IN'){
            parking[number] = 1
        }else if(direction === 'OUT' && parking.hasOwnProperty(number)){
            delete parking[number]
        }
    }

let answer = Object.keys(parking).sort((a,b)=>{
    return a.localeCompare(b)
}).join('\n')

    console.log(answer)

}
parkingLot(['IN, CA2844AA',
'IN, CA1234TA',
'OUT, CA2844AA',
'IN, CA9999TT',
'IN, CA2866HI',
'OUT, CA1234TA',
'IN, CA2844AA',
'OUT, CA2866HI',
'IN, CA9876HH',
'IN, CA2822UU']
)