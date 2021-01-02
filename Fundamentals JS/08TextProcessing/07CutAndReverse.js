function cutAndReverse(text) {
    let firstWord = text.substring(0,text.length/2).split('').reverse().join('')
    let secondWord = text.substring(text.length/2).split('').reverse().join('')

    console.log(firstWord)
    console.log(secondWord)

    
// function reverse(str) {
    
//     let lastIndex = str.length-1
//     if(lastIndex<0){
//         return "";
//     }else{
// return str[lastIndex]+reverse(str.substring(0,lastIndex))
//     }
// }console.log(reverse('ooommmjhjjh'))
    
}
console.log(cutAndReverse('tluciffiDsIsihTgnizamAoSsIsihT'))