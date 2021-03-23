function days(input){
    let day = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'];
    if(input>=1 && input <=7){
        console.log(day[input-1])
    }else{
        console.log('Invalid day!')
    }

}
days(4)