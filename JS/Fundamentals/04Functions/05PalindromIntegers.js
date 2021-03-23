function palindromIntegers(arr){

    
let result = []
    for(let number of arr){

        result += palindromeCheck(number) +'\n'
     }

      
   

    function palindromeCheck(num){
        
        num = num.toString();
        let isPalindrom  = 'false'
        for(let i =0; i<= parseInt(num.length/2); i++){
            let firstDigit = num[i]
            let lastDigit = num[num.length-1-i]
            
            if(firstDigit===lastDigit){
                isPalindrom = 'true'
            }
            else {
                break;
            }
            

        }
        
    return isPalindrom
}
 return result

}
console.log(palindromIntegers([123,323,421,121, 454, 878,8778]))