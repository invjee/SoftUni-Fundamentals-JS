function gladiator(lostFihgts, helmetPrice, swordPrice, shieldPrice, armorPrice){
    let helmet = Math.trunc(lostFihgts/2)*helmetPrice
    //console.log(helmet)
    let sword = Math.trunc(lostFihgts/3)*swordPrice
    //console.log(sword)
    let shield = Math.trunc(lostFihgts/6)*shieldPrice
    //console.log(shield)
    let armour = Math.trunc(lostFihgts/12)*armorPrice
    //console.log(armour)
    let total = helmet+sword+shield+armour
    console.log(`Gladiator expenses: ${total.toFixed(2)} aureus`)

}
gladiator(7,
    2,
    3,
    4,
    5
    )