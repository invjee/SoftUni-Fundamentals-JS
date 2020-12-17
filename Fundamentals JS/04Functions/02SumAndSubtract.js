function sumAndSubtract(x,y,z){
    let result = sum(x,y)
    result = subtract(result,z)

    function sum(a,b){
        return a+b
    }
    function subtract(a,b){
        return a-b
    }
    return result

}
console.log(sumAndSubtract(23,
    6,
    10
    ))
