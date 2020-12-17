function print(arg1, arg2){
    let start = Number(arg1);
    let end = Number(arg2);
    let println =""
    let sum = 0
    for(let i = start; i <=end; i++){
        let num = i
        println += `${i} `
        sum +=i
    }
    console.log(println)
    console.log(`Sum: ${sum}`)

}
print(50, 60)