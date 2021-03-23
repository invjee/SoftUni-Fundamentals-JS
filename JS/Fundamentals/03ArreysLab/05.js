function sum(input){
    let arreyNum = []
    let sum = 0
    for(let i = 0; i < input.length; i++){
        arreyNum.push(Number(input[i]))
        let current = Number(input[i])
        if(current%2===0){
            sum += current
        }
        
        
    }
    
    
    
  //  console.log(arreyNum)
    console.log(sum)

}
sum(['1','2','3','4','2','6'])