function heroesofCode(input) {
    let n = input.shift()
    let actions = {
        CastSpell: (heroes, [name, mpCurr, castSpell]) => {
            let hero = heroes[name]
            mpCurr = Number(mpCurr)
            if (hero.mp >= mpCurr) {
                hero.mp -= mpCurr
                console.log(`${name} has successfully cast ${castSpell} and now has ${hero.mp} MP!`)
            }else{
                console.log(`${name} does not have enough MP to cast ${castSpell}!`)
            }
        },
        TakeDamage: (heroes, [name, damage, source]) => {
            let hero = heroes[name]
            damage = Number(damage)
            hero.hp -= damage
            if(hero.hp>0){
                let hero = heroes[name]
                console.log(`${name} was hit for ${damage} HP by ${source} and now has ${hero.hp} HP left!`)
            }else{
                console.log(`${name} has been killed by ${source}!`)
                delete heroes[hero]
            }            
        },
        Recharge: (heroes, [name, amountMp]) => {
            let hero = heroes[name]
            amountMp = Number(amountMp)

            if (hero.mp + amountMp > 200) {
                amountMp = 200 - hero.mp
            }
            hero.mp += amountMp

            console.log(`${name} recharged for ${amountMp} MP!`)
        },
        Heal: (heroes, [name, amountHp]) => {
            let hero = heroes[name]
            amountHp = Number(amountHp)
            if (hero.hp+amountHp > 100) {
                amountHp = 100 - hero.hp
            }
            hero.hp += amountHp
            console.log(`${name} healed for ${amountHp} HP!`)
        }
    }

    let heroes = {}
    for (let i = 0; i < n; i++) {
        let [name, hp, mp] = input.shift().split(' ')
        // console.log(name)
        heroes[name] = {
            hp: Number(hp),
            mp: Number(mp)
        }
    }

    while (input[0] !== 'End') {
        let [command, ...args] = input.shift().split(' - ')
        let action = actions[command]
        action(heroes, args)



        input
    }
    //console.log(heroes)

    let sorted = Object.entries(heroes)
    .filter(([n, {hp, mp}])=> hp>0)
    .sort(heroCompare)
    
    for(hero of sorted){
       
       console.log(`${hero[0]}`)
       console.log(`  HP: ${hero[1].hp}`)
       console.log(`  MP: ${hero[1].mp}`)

    }
        
    


    function heroCompare(a,b){
        let heroA = a[1]
        let heroB = b[1]
        let result = heroB.hp - heroA.hp 
        if(result==0){
           result = a[0].localeCompare(b[0])
        }
        return result
    }
  //  console.log(sorted)



}
heroesofCode(['2',
    'Solmyr 85 120',
    'Kyrre 99 50',
    'Heal - Solmyr - 10',
    'Recharge - Solmyr - 50',
    'TakeDamage - Kyrre - 66 - Orc',
    'CastSpell - Kyrre - 15 - ViewEarth',
    'End'
])
// heroesofCode(['4',
//     'Adela 90 150',
//     'SirMullich 70 40',
//     'Ivor 1 111',
//     'Tyris 94 61',
//     'Heal - SirMullich - 50',
//     'Recharge - Adela - 100',
//     'CastSpell - Tyris - 1000 - Fireball',
//     'TakeDamage - Tyris - 99 - Fireball',
//     'TakeDamage - Ivor - 3 - Mosquito',
//     'End'
//     ])