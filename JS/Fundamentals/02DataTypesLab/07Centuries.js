function centuries(input){
    let centurie = +input
    let years = centurie*100
    //console.log(years)
    let days = Math.trunc(365.2422*years)
    //console.log(days)
    let hours = 24*days
    //console.log(hours)
    let minutes = 60*hours
    //console.log(minutes)
    console.log(`${centurie} centuries = ${years} years = ${days} days = ${hours} hours = ${minutes} minutes`)
}
centuries(1)