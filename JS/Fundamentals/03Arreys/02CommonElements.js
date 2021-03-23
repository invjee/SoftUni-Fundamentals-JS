function compare(arr1, arr2){
    if(arr1.length>=arr2.length){
        for(let i = 0; i<arr1.length; i++){
            let first = arr1[i]
            if (arr2.includes(first)){
                console.log(first)
    
            }
        }

    }else{
        for(let j = 0; j<arr2.length; j++){
            let second = arr2[j]
            if (arr1.includes(second)){
                console.log(second)
    
            }
        }
    }
   

}
compare(['Hey', 'hello', 2, 4, 'Peter', 'e'],
['Petar', 10, 'hey', 4, 'hello', '2']
)
compare(['s', 'o', 'c', 'i', 'a', 'l'],['S', 'o', 'f', 't', 'U', 'n', 'i', ' ']
)