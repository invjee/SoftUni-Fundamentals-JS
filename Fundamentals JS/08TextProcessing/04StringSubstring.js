function stringSubstring(word, text) {
    let wordLC = word.toLowerCase()
    let textArr = text.toLowerCase().split(' ')
    let isWord = false

    
    for(let currentWord of textArr){
if(currentWord===wordLC){
    console.log(word)
    isWord = true
    break;
}
    }
    if(!isWord){
        console.log(`${word} not found!`)
    }
    
}
stringSubstring('javascript',
'JavaScript is the best programming language'
)