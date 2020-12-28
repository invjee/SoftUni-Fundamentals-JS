function wordRepeat(input, word) {

    let textArr = input.split(' ').filter(x=>x!=='')
    let counter = 0
    for(let words of textArr){
        if(words==word){
            counter++
        }
    }
    console.log(counter)
//друго решение
    console.log(input.split(' ').filter(x=>x===word).length)
}wordRepeat("This is a word and it also is a sentence",
"is"
)