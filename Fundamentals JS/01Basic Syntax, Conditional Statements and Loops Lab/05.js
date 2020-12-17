function test(arg1, arg2, arg3, arg4, arg5){
    let days = Number(arg1);
    let kg = Number(arg2);
    let perDay1 = Number(arg3);
    let perDay2 = Number(arg4);
    let perDay3 = Number(arg5);

    let deersEat = (perDay1+perDay2+perDay3)*days
    
    
    if(deersEat<= kg){
        console.log(`${Math.floor(kg-deersEat)} kilos of food left.`)
    }else if(deersEat> kg){
        console.log(`${Math.ceil(deersEat- kg)} more kilos of food are needed.`)
    }

    


}
// test(2,
//     10,
//     1,
//     1,
//     2
//     )
test(5,
    10,
    2.1,
    0.8,
    11
    )
