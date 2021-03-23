function meetings(input){

    let schedule = {}

    for(let line of input){
        let[day, name]= line.split(' ')
        if(!schedule[day]){
            schedule[day] = name
            console.log(`Scheduled for ${day}`)
        }else{
            console.log(`Conflict on ${day}!`)
        }
    }
    for(let key in schedule){
        console.log(`${key} -> ${schedule[key]}`)
    }


}
meetings(['Monday Peter',
'Wednesday Bill',
'Monday Tim',
'Friday Tim']
)