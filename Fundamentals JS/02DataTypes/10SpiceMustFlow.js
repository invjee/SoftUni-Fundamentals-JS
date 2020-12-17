function spice(starting){
    let currentSpice = 0
    let daysCount= 0
    while(starting>=100){
        daysCount++
     
        
        currentSpice +=starting
        
        currentSpice -=26
        starting -= 10
        if(starting<100){
            currentSpice-=26
        }
        
        
        
        //console.log(currentSpice)
        
        


    }
    console.log(daysCount)
    console.log(currentSpice)

}
spice(111)