function test(arg1, arg2, arg3, arg4){
    let dancers = Number(arg1);
    let points = Number(arg2);
    let season = arg3;
    let place = arg4;
    let sum = 0
    let expenses = 0
    
    switch(place){
        case "Bulgaria": sum = points*dancers; 
        switch(season){
            case "summer": sum *= 0.95; break;
            case "winter": sum *= 0.92; break;
        }
        break;
        
        
        case "Abroad": sum = points*dancers + 0.5*points*dancers;
        switch(season){
            case "summer": sum *= 0.90; break;
            case "winter": sum *= 0.85; break;
        } 
        break;
    }
    let charity = 0.75*sum
    console.log(`Charity - ${(charity).toFixed(2)}`)
    let perDancer = ((0.25*sum)/dancers).toFixed(2)
    console.log(`Money per dancer - ${perDancer}`)


}
// test(1,
//     89.5,
//     "summer",
//     "Abroad"
//     )
test(25,
    98,
    "winter",
    "Bulgaria"
    )
