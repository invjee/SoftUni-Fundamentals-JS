function amaizing(input){
    let num = input.toString();
    let sum = 0
    for(let i = 0; i < num.length; i++){
        let digit = Number(num[i]);
        sum += digit;

    }
    let result = sum.toString().includes("9");
   // console.log(result)
    if(result){
        console.log(`${num} Amaizing? True`)
    }else{
        console.log(`${num} Amaizing? False`)
    }
}
amaizing(1233)