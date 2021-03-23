function uniquePin(input) {
    let index = 0
    let firstNum = Number(input[index]);
    index++
    let secondNum = Number(input[index]);
    index++
    let thirdNum = Number(input[index]);
    index++
    let isValid = false
    let pin = ""

    for (let a = 1; a <= firstNum; a++) {
       
                 for (let b = 2; b <= secondNum; b++) {               
                                                
                    for (let c = 1; c <= thirdNum; c++) {
                        let divide =0
                        for (let i = 1; i <= secondNum; i++) {
                            if (b % i === 0) {
                                divide += i
                            }
                        
                        }
                        if((a % 2 === 0)&&(divide - 1 === b)&&(c%2===0)){
                            pin =`${a} ${b} ${c}`
                            console.log(pin)


                    }
          
            }

        }
      

    }
}
uniquePin(["3", "5", "5"])
  
   
