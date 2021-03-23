function oddOccurences(input){
    let words = input.split(' ')

    let wordCount = new Map
    //wordCount[word] = 0

    for(let word of words){
        word = word.toLowerCase()
        
         if(!wordCount.has(word)){
             wordCount.set(word, 0)
             
         }
             let current = wordCount.get(word)+1
            
            wordCount.set(word, current)
         
    }
    let newArr =[]
    let sorted = Array.from(wordCount).filter(x=>{
        return x[1]%2===1
    }).forEach(x =>{
        newArr.push(x[0])
    })
    
    console.log(newArr.join(' '))



}
oddOccurences('Java C# Php PHP Java PhP 3 C# 3 1 5 C#')