function phoneNumbers([input]) {
    let pattern = /\b(?<day>\d{2})([\/.-])(?<month>[A-Z][a-z]{2})\2(?<year>\d{4})\b/g

    let execPat = pattern.exec(input)
   while(execPat !== null){
       let day = execPat.groups.day
       let month =execPat.groups.month
       let year = execPat.groups.year
    console.log(`Day: ${day}, Month: ${month}, Year: ${year}`)
    execPat = pattern.exec(input)
   }
    
    
}phoneNumbers(["13/Jul/1928, 10-Nov-1934, , 01/Jan-1951,f 25.Dec.1937 23/09/1973, 1/Feb/2016"])