function revealWords(words, text) {
    words = words.split(', ')
    for (word of words) {
        //let letters = word.length
        let wordStars = '*'.repeat(word.length)
        //console.log(wordStars)
        text = text.replace(wordStars, word)
    }
console.log(text)
}
revealWords('great, learning',
    'softuni is ***** place for ******** new programming languages'
)
