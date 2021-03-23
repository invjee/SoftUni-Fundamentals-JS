function numbers(count, arr){
    arr.length = count
   // console.log(arr)
    let newArr = []
    for(let i = arr.length - 1; i >=0; i--){
        newArr.push(arr[i])


    }
    console.log(newArr)
     

}
numbers(3, [10, 20, 30, 40, 50])