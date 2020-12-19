function register(input){
 let heroes = []

 for(let line of input){
     let[name,level, items] = line.split(' / ')
     level = Number(level)
     items = items.split(', ')
     .sort((a,b)=>a.localeCompare(b)).join(', ')
     let hero = {
         Hero: name,
         level,
         items,
     }
     heroes.push(hero)
     

 }
heroes
.sort((a,b)=> a.level-b.level)
.forEach(x=>{
    console.log(`Hero: ${x.Hero}`)
    console.log(`level => ${x.level}`)
    console.log(`items => ${x.items}`)
})

//  console.log(JSON.stringify(heroes))


}
register([
    "Isacc / 25 / Apple, GravityGun",
    "Derek / 12 / BarrelVest, DestructionSword",
    "Hes / 1 / Desolator, Sentinel, Antara"
    ]
    )