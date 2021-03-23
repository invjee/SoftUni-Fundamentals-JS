function minertask(input) {
  
    let mine = {}
    for(let i = 0; i< input.length; i +=2){
let type = input[i]
let sum = Number(input[i+1])
if(!mine.hasOwnProperty(type)){
    mine[type] = 0
}
mine[type] += sum
    }
    Object.entries(mine).forEach(([type, sum]) => {
        console.log(`${type} -> ${sum}`)
        
    });
}
minertask([
    'gold',
    '155',
    'silver',
    '10',
    'copper',
    '17',
    'gold',
    '15'
    ]
    )


minertask([
    'Gold',
    '155',
    'Silver',
    '10',
    'Copper',
    '17'
    ]
    )