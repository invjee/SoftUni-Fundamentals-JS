function reverse(arr){
    let lastIndex = arr.length-1
    
    
    for(let i = 0; i< arr.length/2; i++){
        let temp = arr[i]
        arr[i] = arr[lastIndex-i]
        arr[lastIndex-i] = temp
    }
    console.log(arr.join(" "))


}
reverse(['a', 'b', 'c', 'd', 'e'])