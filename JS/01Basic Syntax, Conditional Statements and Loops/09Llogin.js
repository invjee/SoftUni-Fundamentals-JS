
function password(input){
    let index = 0
    let user = input[index]
    index++
    let pass = user.split("").reverse().join("")
    let isPass= false
    
    //console.log(pass)
  
    for(let i = 1; i<=4; i++){
    
    let command = input[i]
    
    if(pass=== command){
        isPass = true
        console.log(`User ${user} logged in.`)
        
        break;
    }else if(i===4) {
        isPass= true
        console.log(`User ${user} blocked!`)
        break;

    

    }else{
        console.log("Incorrect password. Try again.")
    }
}
if(!isPass){
    

console.log(`User ${user} blocked!`)
}

}
password(['Acer','login','go','let me in','recA'])
//password(['momo','omom'])
//password(['sunny','rainy','cloudy','sunny','not sunny'])
