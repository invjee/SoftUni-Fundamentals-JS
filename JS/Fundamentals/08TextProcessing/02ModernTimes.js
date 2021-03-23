function moderTimes(text) {
    let textArr = text.split(' ')
    let hashTagWords = []
    for (let words of textArr) {
        let firstLet = words[0]
        if (firstLet == '#' && words.length > 1) {
            let newWord = words.substring(1)
            hashTagWords.push(newWord)
            let isOnlyLetters = true
            for (const char of newWord) {
               // console.log(char.charCodeAt())
                if (char.charCodeAt() >= 66 && char.charCodeAt() <= 90 || char.charCodeAt() >= 97 && char.charCodeAt() <= 122) {

                    isOnlyLetters = true
                } else {
                    isOnlyLetters = false
                }

            }
            if(isOnlyLetters){

                console.log(newWord)
            }
        }
    }
}
    moderTimes('Nowadays everyone uses # to tag a #special word in #socialMedia')