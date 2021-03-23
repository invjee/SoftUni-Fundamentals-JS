function loadingBar(num){
   
    function procentLoading(x){
        x /= 10
        let arr = []  
        for(let i =0; i<10;i++){
            if(i<x){
                arr[i]= '%'
            }
            else{
                arr[i]='.'
            }
            

    }
    return arr

    }

   // console.log(procentLoading(num))
   if(num===100){
       return "100% Complete!\n[%%%%%%%%%%]"
   }else{
   
   let loadingBar = []
    loadingBar.push(`${num}% [`)
    loadingBar.push(procentLoading(num).join(''))
    loadingBar.push(']\n')
    loadingBar.push('Still loading...')   
    
    
    return loadingBar.join('')
   }
}
console.log(loadingBar(100))