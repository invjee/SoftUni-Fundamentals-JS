function rotate(arr, num){
    for(let i = 0; i< num; i++){

        arr.push(arr[0])
        arr.shift()


    }
    console.log(arr.join(" "))

}
rotate([51, 47, 32, 61, 21], 2)