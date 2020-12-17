function specialNum(n){
    for(let i = 1; i <= n; i++){
        let sum = 0
        let strI = i.toString()
        for(let j = 0; j<strI.length; j++){
            sum += Number(strI[j])
        }
        if(sum===5|| sum=== 7|| sum === 11){
            console.log(`${i} -> True`)
        
        }else{
            console.log(`${i} -> False`)
        }


    }

}
specialNum(15)