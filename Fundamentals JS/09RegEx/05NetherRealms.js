function netherRealms([input]) {
    let patternSplit = /[, ]/g
    let patterHealth = /[^0-9.\/+*-]/g
    let patternDamage = /[+-]?\d+\.?\d*/g
    let patternDMP = /\*|\//g

    let demons = {}


    let demonsNames = input.split(patternSplit).filter(x => x !== '')
    //console.log(demonsNames)
    for (const line of demonsNames) {      

        let sumHelath = 0
        let matchHealth = line.match(patterHealth)
        if(matchHealth!==null){
            let health = matchHealth.forEach(element => {
                let code = element.charCodeAt()
                return sumHelath += code
            }) 
        }else{sumHelath = 0}
               

        let damage = 0.00
        let match = line.match(patternDamage)
        if(match!==null){

            damage = match.map(Number).reduce((a, b) => a + b)
        }else{
            damage = 0
        }

        let subtractOrMultiply = line.match(patternDMP)
        if(subtractOrMultiply!==null){
            for(const token of subtractOrMultiply){
                if(token ==='*'){

                    damage*= 2
                }else{
                    damage/=2
                }
            }
        }
       // console.log(damage)
        demons[line] = {}
        demons[line].health = sumHelath
        demons[line].damage = damage
        
    }
    let sorted = Object.entries(demons).sort((a,b)=>a[0].localeCompare(b[0])).forEach(([nameDemon, healthAndDamage])=>{
       
            return console.log(`${nameDemon} - ${healthAndDamage.health} health, ${(healthAndDamage.damage).toFixed(2)} damage`)
    
    })




}
//netherRealms(['M3ph-0.5s-0.5t0.0**'])
//netherRealms([ 'M3ph1st0**,  Azazel' ])
//M3ph-0.5s-0.5t0.0** - 524 health, 8.00 damage
netherRealms(['Gos/ho'])