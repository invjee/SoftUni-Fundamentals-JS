function maxSequence(input){
 let max = []
    for (let i = 0; i < input.length; i++) {
        let currentMax = []
       // let count = 0
        firstEl = input[i]
        currentMax.push(firstEl)
        for (let j = i+1; j < input.length; j++) {
            secondEl = input[j]
            if(firstEl === secondEl){
                
                currentMax.push(secondEl)
                
            }
            else{
                break;
            }
        }
        if(currentMax.length > max.length){
            max = currentMax
        }
        
    }
    console.log(max.join(' '))


}
maxSequence([0, 1, 1, 5, 2, 2, 6, 3, 3])