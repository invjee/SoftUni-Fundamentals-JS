function add(input){
    let sumOld = 0
    let sumNew = 0
    for(let i = 0; i< input.length; i++){
        
        let current = Number(input[i]);
        sumOld += current
        if(current%2===0){
            current += i
        }
        else{
            current -= i
        }
        input[i]=current
        sumNew +=current

    }
    console.log(input)
    console.log(sumOld)
    console.log(sumNew)

}
//add([5, 15, 23, 56, 35])
add([-5, 11, 3, 0, 2])
