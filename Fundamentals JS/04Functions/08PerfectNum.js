function perfectNum(num){



    function divisors(x){
        
        let arr = []
        for(let i = 1; i<x;i++){
            if(x%i===0){
                arr.push(i)
            }

        }
        return arr
    }

    let arr = divisors(num)
let sum =0

for(let i = 0; i<arr.length; i++){
let command = arr[i]
sum+= command
}
if(sum===num){
    return 'We have a perfect number!'
}else{
    return "It's not so perfect."
}

}
console.log(perfectNum(1236498))
