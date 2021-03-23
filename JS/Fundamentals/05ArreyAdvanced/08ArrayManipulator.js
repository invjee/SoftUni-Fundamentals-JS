function manipulations(arr, commmands) {
    for (let command of commmands) {
        let number = command.split(' ')
        let word = number.shift()
        number = number.map(Number)
        //console.log(number)
        //console.log(command)
        //console.log(word)
        if (word === 'add') {
            let index = number[0]
            let element = number[1]
            arr.splice(index, 0, element)
        } else if (word === 'addMany') {
            let index = number.shift()
            let elements = number
            for(let i = 0; i<elements.length; i++){
                arr.splice(index+i, 0, elements[i])
            }
            
        } else if (word === 'contains') {
            let element = number[0]
            console.log(arr.indexOf(element))
        } else if (word === 'remove') {
            let index = number[0]
            arr.splice(index, 1)
        } else if (word === 'shift') {
            let rotation = number[0]
            for (let i = 0; i < rotation; i++) {
               let firstEl = arr.shift()
                arr.push(firstEl)
               
            }
        } else if (word === 'sumPairs') {
            let sumArr = []
            for (let i = 0; i < arr.length; i += 2) {
               if(i!==arr.length-1){
                let sum = arr[i] + arr[i + 1]
                sumArr.push(sum)
               }else{
                   sumArr.push(arr[i])
               }
            }
            arr= sumArr
        } else if (word === 'print') {
            console.log(`[ ${arr.join(', ')} ]`)
        }

    }


}
manipulations([1, 2, 4, 5, 6, 7,9],
    ['sumPairs', 'print']
    )
// manipulations([1, 2, 3, 4, 5],
//     ['addMany 5 9 8 7 6 5', 'contains 15', 'remove 3', 'shift 1', 'print']
// )
