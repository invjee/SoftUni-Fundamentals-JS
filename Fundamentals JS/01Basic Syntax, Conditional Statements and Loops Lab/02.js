function test(input){
    let index = 0
    let goal = Number(input[index])
    index++
    let command = input[index]
    index++
    let isGoal = false
    let sum = 0
    while(command !== "closed"){
        let type = command
        let style = input[index]
        index++
        if(type === "haircut"){
            switch(style){
                case "mens": sum += 15; break;
                case "ladies": sum += 20; break;
                case "kids": sum +=  10; break;
            }

        }else if( type === "color"){
            switch(style){
                case "touch up": sum += 20; break;
                case "full color": sum += 30; break;
            }
        }
        if(sum >= goal){
           isGoal = true;
           break;

        }
        command = input[index]
        index++
    }
    if(sum>=goal || isGoal == true){
        console.log("You have reached your target for the day!")

    }else{
        console.log(`Target not reached! You need ${goal - sum}lv. more.`)
    }
    console.log(`Earned money: ${sum}lv.`)
    

}
// test(["300",
//     "haircut",
//     "ladies",
//     "haircut",
//     "kids",
//     "color",
//     "touch up",
//     "closed"
//     ])
test(["50",
    "color",
    "full color",
    "haircut",
    "ladies"
    ])
