function identical(arr1, arr2){
let sum = 0
let isIdentical = true
   

        for(let i = 0; i < arr1.length; i++){
   if(arr1[i]===arr2[i]){
       //console.log(arr1[i])
       sum += Number(arr1[i])

   }else{
       console.log(`Arrays are not identical. Found difference at ${i} index`)
       isIdentical = false
       break;
   }
 
    }
    if(isIdentical){
        console.log(`Arrays are identical. Sum: ${sum}`)

    }

}
identical(['1','2','3','4','5'], ['1','2','4','4','5'])