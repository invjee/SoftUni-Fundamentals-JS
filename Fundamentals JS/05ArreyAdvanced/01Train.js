function train(input){
    let wagoons = input.shift().split(' ').map(Number)
    let maxpeople = Number(input.shift())
   // console.log(wagoons)
    for(let i = 0; i<input.length; i++){
        let command = input[i].split(' ')
        let firstCom = command.shift()
        if(firstCom==='Add'){
            let number = Number(command)
            wagoons.push(number)
        }else{
            let number = Number(firstCom)
            
           // let fit = maxpeople - Number(firstCom)
            //console.log(fit)
            for(let j =0; j<wagoons.length; j++){
                let wagoon = Number(wagoons[j])
                let fit = wagoon+number
                if(fit<= maxpeople){
                    wagoons.splice(j,1,fit)
                    break;
                    
                    //console.log(wagoons)
                }
            }


            //let add = wagoons.filter()
        }       
       
    }
    return(wagoons.join(' '))

}
console.log(train(['0 0 0 10 2 4',
'10',
'Add 10',
'10',
'10',
'10',
'8',
'6']

))
