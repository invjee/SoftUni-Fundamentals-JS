function sum(input){
    let first = Number(input.shift())
    let last = Number(input.pop())
    return first +last

}
console.log(sum(['20', '30', '40']))
