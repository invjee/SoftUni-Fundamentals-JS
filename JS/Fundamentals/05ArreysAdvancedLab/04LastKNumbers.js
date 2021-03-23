function lastkEl(n,k){
    let arr = [1]
    for(let i = 1; i<n; i++){
        let sum = arr.slice(-k)
        let sumK = 0
        for(let j= 0; j<sum.length; j++){
            sumK += sum[j]
        }

       
        arr.push(sumK)

    }
    console.log(arr.join(' '))

}
lastkEl(8,2)