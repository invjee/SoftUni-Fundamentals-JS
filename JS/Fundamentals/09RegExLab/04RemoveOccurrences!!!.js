function removeOccurrences(word, text) {
//let pattern = new RegExp(word, 'g')
let old = ''
while(old!==text){
    old = text
    text = text.replace(word,'')
    
}
console.log(text)


    
}
removeOccurrences('ice', 'kicegiciceeb') 