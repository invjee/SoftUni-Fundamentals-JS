function sorting(input){

  //  for(let i=0; i<input.length; i++){
        let newArr = []
        input.sort((a,b)=>(a-b))


       // console.log(input)
        let index = 0
        while(newArr.length < input.length){
            newArr.push(input[input.length-1 - index])
            newArr.push(input[index])
            index++
        }
        if(newArr.length>input.length){
            newArr.pop()
        }
        console.log(newArr.join(' '))


        // for(let i =0; i<input.length;i++){
          
        // }
       // console.log(input)

    


}
sorting([1, 21, 3, 52, 69, 63, 31, 2, 18, 94,100])