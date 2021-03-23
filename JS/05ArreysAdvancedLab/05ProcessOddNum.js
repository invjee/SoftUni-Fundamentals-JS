function test(arr){
    

   
    console.log(arr
        .filter((v,i)=>(i%2)==1)
        .map(x=>x*2)
        .reverse()
        .join(' '))
}

test([10, 15, 20, 25])