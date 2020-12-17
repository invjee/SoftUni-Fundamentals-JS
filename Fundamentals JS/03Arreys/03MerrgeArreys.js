function mergeArr(arr1, arr2){
    let third = []
    for(let i = 0; i< arr1.length; i++){
        //let newEl=0
        if(i%2===0){
            third[i] = Number(arr1[i])+Number(arr2[i])
           

        }else{
            third[i] = arr1[i] + arr2[i]
        }
       // console.log(newEl)
    }
    console.log(third.join(" - "))

}
mergeArr(['5', '15', '23', '56', '35'],
['17', '22', '87', '36', '11']
)