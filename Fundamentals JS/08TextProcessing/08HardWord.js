function hardWord(input) {
    let text = input[0].split(' ')
    let words = input[1]
    let changedWord = ''
  
        for (let i = 0; i < text.length; i++) {
            let textWord = text[i]
            if (textWord.includes('_')){
                if(!textWord.endsWith('_')){
textWord = textWord.substring(0,textWord.length-1)
//console.log(textWord)
                }
                for(let word of words){
                    let wordLined = '_'.repeat(word.length)

                    if (textWord === wordLined) {
                        text.splice(i, 1, word)
                        break;
                    }
                }
            }
        
    }
    console.log(text.join(' '))
    



}
hardWord(['Hi, grandma! I\'m so ____ to write to you. ______ the winter vacation, so _______ things happened. My dad bought me a sled. Mom started a new job as a __________. My brother\'s ankle is ________, and now it bothers me even more. Every night Mom cooks ___ on your recipe because it is the most delicious. I hope this year Santa will _____ me a robot.',
    ['pie', 'bring', 'glad', 'During', 'amazing', 'pharmacist', 'sprained']]
)