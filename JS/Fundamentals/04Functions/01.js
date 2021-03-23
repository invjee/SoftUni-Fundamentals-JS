function minInteger(a,b,c){
    let smallest = Number.MAX_SAFE_INTEGER
    smallest = checkSmallest(a, smallest);
    smallest = checkSmallest(b, smallest);
    smallest = checkSmallest(c, smallest);



    function checkSmallest(x,smaller){
        if(x<smaller){
                smaller = x
        }
        return smaller
    }
    return smallest

}
console.log(minInteger(2,5,6))
//minInteger(2, 5, 7)
