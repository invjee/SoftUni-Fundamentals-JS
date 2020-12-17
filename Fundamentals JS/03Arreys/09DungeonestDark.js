function dungenouDark(arr){
    let dungen = arr[0].split('|')
   // console.log(dungen)
   // initial health 100 and initial coins 0
   let counterRooms=0
   let health = 100
   let coins = 0
   let isWin = true

   
   for(let i = 0; i< dungen.length; i++){
       let room = dungen[i].split(' ')
       let command = room[0]
       let score = Number(room[1])
       counterRooms++
       
       if(command === 'potion'){
        let healthgap = 100 - health

        health +=score
        
        if(health>100){

            
            score = healthgap
            health = 100
        }
        console.log(`You healed for ${score} hp.`)
        console.log(`Current health: ${health} hp.`)
       }else if(command==='chest'){
           coins+=score
           console.log(`You found ${score} coins.`)
       }else{
           health -=score
           if(health>0){
               console.log(`You slayed ${command}.`)
           }else if(health <= 0){
               isWin = false
               console.log(`You died! Killed by ${command}.`)
               console.log(`Best room: ${counterRooms}`)
               break;
           }
       }


       
       //console.log(room)



   }
   if(isWin){
       console.log(`You've made it!`)
       console.log(`Coins: ${coins}`)
   console.log(`Health: ${health}`)
}
   
    
}
dungenouDark(['rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000'])
//dungenouDark(['cat 10|potion 30|orc 10|chest 10|snake 25|chest 110'])