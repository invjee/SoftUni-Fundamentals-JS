function starEnigma(input) {
    let n = input.shift()
    let pattern = /([^@\-!:>]*)@(?<name>[A-Za-z]+)([^@\-!:>]*):(?<population>\d+)([^@\-!:>]*)!(?<type>[AD])!([^@\-!:>]*)->(?<count>\d+)([^@\-!:>]*)/
    let planets = {}
    planets['A'] = []
    planets.D = []

 
    for (let i=0; i<n; i++) {
        let line = input[i]
     let decrypter = line.toLowerCase().split('').filter(x=>x==='s'||x==='t'||x==='a'||x==='r').join('')
// let lineSmallCase = line.toLowerCase()
//         let patternStar = /[star]/g
//         let match = lineSmallCase.match(patternStar)
//         let decrypter = 0
//         if(match!==null){
//             decrypter = match.length
//         }else{
//             decrypter= 0
//         }

        let newWords = line.split('')
            .map(x => {
                let y = x.charCodeAt() - decrypter.length
                return String.fromCharCode(y)
            })
            .join('')

        // for(let i=0;i<line.length;i++){
        //     let code = line.charCodeAt(i)
        //     let finalCode = code-key
        //     let currentLetter = String.fromCharCode(finalCode)
        //     newWord += currentLetter
        // }
        //console.log(newWords)
        let matches = pattern.exec(newWords)
     
        //console.log(`${name} --> ${population} --> ${type} --> ${count}`)
        if (matches !==null) {
            let name = matches.groups.name
            let population = matches.groups.population
            let type = matches.groups.type
            let count = matches.groups.count
            if (type === 'D') {

                planets.D.push(name)
            }else{
                planets.A.push(name)
            }
        }
    }
    let sorted = Object.keys(planets).forEach(e => {
        if(e === 'A'){
            console.log(`Attacked planets: ${(planets[e]).length}`)
        }else{
            console.log(`Destroyed planets: ${(planets[e]).length}`)
        }
        planets[e].sort((a,b)=>a.localeCompare(b)).forEach(x=>console.log(`-> ${x}`))
        
    });
    // console.log(`Attacked planets: ${(planets.A).length}\n->${(planets.A).join('\n-> ')}`)
    // console.log(`${(planets.A).join('\n-> ')}`)
    // console.log(`Destroyed planets: ${(planets.D).length}\n->${(planets.D).join('\n-> ')}`)
    
    

}
starEnigma(['2', 'STCDoghudd4=63333$D$0A53333', 'EHfsytsnhf?8555&I&2C9555SR'])
// starEnigma(['3',
//     "tt(''DGsvywgerx>6444444444%H%1B9444",
//     'GQhrr|A977777(H(TTTT',
//     'EHfsytsnhf?8555&I&2C9555SR']
//     )