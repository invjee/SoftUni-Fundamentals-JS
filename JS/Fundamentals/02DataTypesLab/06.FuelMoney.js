function fuel(arg1, arg2, arg3){
    let distance = Number(arg1);
    let passengers= Number(arg2);
    let fuelPrice = Number(arg3);
    
   
    let neededFuel = 7*(distance/100)
    neededFuel+= passengers*0.100
    let neededFulerPrice = neededFuel*fuelPrice
    console.log(`Needed money for that trip is ${neededFulerPrice}lv.`)


}
fuel(260, 9, 2.49)