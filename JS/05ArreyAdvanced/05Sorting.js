function sorting(input){

    input.sort(compare)

    function compare(a,b){
        
        if(b.length- a.length!==0){
            if(a.length- b.length>0){
                return 1

            }else{
                return -1
            }
        }else{
            if(a-b!==0){

                return a.localeCompare(b)
            }else{
                return 0
            }
        }


    }
//console.log(compare("alpha", "beta"))
console.log(input.join('\n'))

}
sorting(["test",
    "Deny",
    "omen",
    "Default"])