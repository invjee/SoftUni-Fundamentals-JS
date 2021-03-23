function sumEven(input){
    let arreyNum = []
    let sum = 0
    let sumodd = 0
    for(let i = 0; i < input.length; i++){
        arreyNum.push(Number(input[i]))
        let current = Number(input[i])
        if(current%2===0){
            sum += current
            
        }else {
            sumodd+= current
        }
        
        
    }
    
    
    
  //  console.log(arreyNum)
 // console.log(sum)
  //console.log(sumodd)
    console.log(sum - sumodd)

}
sumEven(['1','2','3','4','5','6'])