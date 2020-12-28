function text(text, word) {
    let result = text.split(`${word}`).join('*'.repeat(word.length))
    console.log(result)

    
}
text("A small sentence with some words", "small")