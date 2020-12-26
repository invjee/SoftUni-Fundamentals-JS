function wordsTracker(input){
    let words = input.shift().split(' ')

    let wordTrack = {}

    for(let word of words){
        wordTrack[word] = 0
    }

    
    for(let wordCount of input){
       // let counter = 0

        if(wordTrack.hasOwnProperty(wordCount)){
            
            wordTrack[wordCount] +=1
        }       

    }
    Object.entries(wordTrack).sort((a,b)=>{
        return b[1]-a[1]
    })
    .forEach(element => {
        console.log(`${element[0]} - ${element[1]}`)
    });




}
wordsTracker([
    'this sentence', 'In','this','sentence','you','have','to','count','the','sentence','occurances','of','the'
    ,'words','this','and','sentence','because','this','is','your','task','sentence'
    ]
    )
