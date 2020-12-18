function list(arr){
    //първо сортираме
    //добавяме точка и поредно число пред всеки елемент
    //печатаме всеки ел на нов ред

    arr.sort()
         

    
        for(let i = 0; i<arr.length; i++){
          console.log(`${1+i}.${arr[i]}`)
        }
    
    //(a,b)=>a.localeCompare(b)

    
}
list(["Potatoes", "Tomatoes", "Onions", "Apples"])