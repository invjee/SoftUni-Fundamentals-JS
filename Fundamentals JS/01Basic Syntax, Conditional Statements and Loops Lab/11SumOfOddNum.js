function sum(arg){
    let n = Number(arg);
    let sum = 0
    let counter = 0
    for(let i = 1; i<=n*2; i+=2){
        
        console.log(i)
        sum+=i

    }
    console.log(`Sum: ${sum}`)

}
sum(3)