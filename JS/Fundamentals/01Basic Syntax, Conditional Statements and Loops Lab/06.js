function test(arg1, arg2, arg3, arg4){
    let people = Number(arg1);
    let nights = Number(arg2);
    let cards = Number(arg3);
    let tickets = Number(arg4);

    let sum = 0

    letSumPerPerson = nights*20+cards*1.60+tickets*6
   

    sum = letSumPerPerson*people

    let finalSum= sum*1.25
    console.log(finalSum.toFixed(2))

}
// test(20,
//     14,
//     30,
//     6
//     )
test(131,
    9,
    33,
    46
    )