function sumEl(input){
    let isEqual = false
    for (let i = 0; i < input.length; i++) {
        let el= input[i]
        let sumRight = 0
        let sumLeft = 0
        for (let j = i+1; j < input.length; j++) {
            let elRight = +input[j];
            sumRight+=elRight            
        }
        for (let k = 0; k  <i; k++) {
            let elLeft = input[k]
            sumLeft += elLeft
           
            
        }
        if(sumLeft===sumRight){
            console.log(i)
            isEqual = true
            break;
        }


        
    }
    if(!isEqual){
        console.log("no")
    }

}
sumEl([10, 5, 5, 99, 3, 4, 2, 5, 1, 1, 4])