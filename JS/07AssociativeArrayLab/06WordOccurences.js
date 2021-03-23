function solve(input){
    let wordCounter = new Map()

    for(let word of input){
        let counter = 1
        if(wordCounter.has(word)){
           counter = wordCounter.get(word)
           counter+=1
        }
            wordCounter.set(word,counter)
        
              

    }
   

    let sorted = Array.from(wordCounter)
    sorted.sort((a,b)=>{
return b[1]-a[1]

    })

    for(let [word, counter] of sorted){

        console.log(`${word} -> ${counter} times`)
    }

}
solve(["Here", "is", "the", "first", "sentence", "Here", "is", "another", "sentence", "And", "finally", "the", "third", "sentence"])