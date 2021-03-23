function rounding(arg1, arg2){
    let n = Number(arg1)
    let precission = Number(arg2)
    if(precission>=15){
        precission= 15
    }
    let rounded = n.toFixed(precission)
    console.log(parseFloat(rounded))
    console.log();


}
rounding(3.200,3)