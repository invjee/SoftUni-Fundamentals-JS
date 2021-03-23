function magicSum(arr,num){
    let magic= []
    for (let i = 0; i < arr.length; i++) {
        for (let j = i+1; j < arr.length; j++) {
            let el = arr[j];
            let firstEl = arr[i];
            let secondEl = arr[j] ;
            let pair = firstEl+secondEl
           // console.log(pair)
            if(pair===num){
                magic.push(`${firstEl} ${secondEl}`)
                console.log(`${firstEl} ${secondEl}`)
                  
                }
        }
     
        //console.log(pair)
        

        
    }
    //console.log(magic.join(" "))

}
magicSum([14, 20, 60, 13, 7, 19, 8],
    27
    
    )