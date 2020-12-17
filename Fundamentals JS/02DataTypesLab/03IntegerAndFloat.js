function integer(arg1, arg2, arg3){
    let sum = arg1+ arg2 + arg3
    let sumParse = parseInt(sum)
    if(sum===sumParse){
        console.log(`${sum} - Integer`)
    }else{
        console.log(`${sum} - Float`)
    }
    //console.log(sumParse)

}
integer(9, 100, 1.1)
integer(100, 200, 303)