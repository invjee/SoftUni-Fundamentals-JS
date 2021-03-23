function divisible(input){
 let num = Number(input);
 let print = ""
 //2, 3, 6, 7, and 10
 if(num%10===0){
     console.log(`The number is divisible by ${10}`)
 }else if(num%7===0){
     console.log(`The number is divisible by ${7}`)
 }else if(num%6===0){
     console.log(`The number is divisible by ${6}`)
 }else if(num%3===0){
     console.log(`The number is divisible by ${3}`)
 }else if(num%2===0){
     console.log(`The number is divisible by ${2}`)
 }else{
     console.log("Not divisible")
 }
 

}
divisible(30)