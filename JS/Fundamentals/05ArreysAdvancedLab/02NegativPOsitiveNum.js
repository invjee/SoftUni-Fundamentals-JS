function negative(input){
    let newArr = []
    for(let i = 0; i< input.length; i++){
        let num = Number(input[i])
        if(num>=0){
            newArr.push(num)
        }else{
            newArr.unshift(num)
        }
    }
    return newArr.join('\n')

}
console.log(negative([3, -2, 0, -1]))