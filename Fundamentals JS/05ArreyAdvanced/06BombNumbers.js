function sorted(arr1, arr2){
let   bomb = arr2[0]
let bombCounter = arr2[1] 
while(arr1.includes(bomb)){
    let index = arr1.indexOf(bomb);
    let elementsToRemove = bombCounter*2+1
    let startIndex = index-bombCounter

    if(startIndex<0){
        elementsToRemove += startIndex;
        startIndex = 0;
    }
    arr1.splice(startIndex, elementsToRemove);
}
console.log(arr1.reduce((a, b) => a + b, 0));
}
sorted([1,4, 2, 2, 4, 2, 2, 2, 9],
    [4, 2])
    
    
    
    