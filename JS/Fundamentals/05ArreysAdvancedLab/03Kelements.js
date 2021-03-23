function kElements(arr){
    let k = arr.shift()
    //console.log(arr)
    let sliced = arr.slice(0,k)


    let second = arr.slice(-k)
    console.log(sliced.join(' '))
    console.log(second.join(' ')) 


}
kElements([2, 
    7, 8, 9]
    )
//console.log(kElements([2, 
    // 7, 8, 9]
    // ))