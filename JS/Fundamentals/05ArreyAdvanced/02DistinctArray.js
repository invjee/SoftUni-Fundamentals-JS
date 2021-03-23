function repeated(input) {
    let arr = []
    for (let i = 0; i < input.length; i++) {
        let num = input[i]
        let isIncluded = true
        if(!arr.includes(num)){
        arr.push(num)
       // input.splice(i,1)
        }     

            
        }

    
    console.log(arr.join(' '))



}
repeated([20, 8, 12, 13, 4, 4, 8, 5, 8, 4, 9])