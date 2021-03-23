function factorial(a,b){

    function findfactorial(x){
        let sum = 1
        for(let i =1; i<=x; i++){
            sum *= i
        }
        return sum
    }
    //console.log(findfactorial(5))
    let x = findfactorial(a)
    let y = findfactorial(b)
    let result = (x/y).toFixed(2)

    return result



}
console.log(factorial(6,2))