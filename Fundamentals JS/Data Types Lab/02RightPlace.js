function test(string, char, string2){
    let newStr = string.replace('_', char)
    //console.log(newStr)
    if(newStr=== string2){
        console.log("Matched")
    }else{
        console.log("Not Matched")
    }
    

   
}