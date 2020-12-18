function guests(arr){
    let list = []
    for(let command of arr){
        let arrCommand = command.split(' ')
       // console.log(command)
      //  console.log(arrCommand)
        let name = arrCommand.shift()
       // console.log(name)
        if(arrCommand.includes('not')){
            if(list.includes(name)){
                let index = list.indexOf(name)
                list.splice(index,1)
            }else(
                console.log(`${name} is not in the list!`)
            )
        }else{
            if(list.includes(name)){
                console.log(`${name} is already in the list!`)
            }else{
                list.push(name)
            }
        }

       
    }
    console.log(list.join('\n'))
}
guests(['Tom is going!',
'Annie is going!',
'Tom is going!',
'Garry is going!',
'Jerry is going!']

)