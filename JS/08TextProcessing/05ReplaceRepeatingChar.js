function replaceRepeatingChar(text){
    let newStr = ''
    for(let i = 0; i<text.length;i++){
        let letter = text[i]
        let nextLetter = text[i+1]
        if(letter!==nextLetter){
newStr += text.substring(i,i+1)
        }
    }
   // console.log(text)
    console.log(newStr)


} 
replaceRepeatingChar('aaaaabbbbbcdddeeeedssaa')