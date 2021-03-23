function oddandEven(num) {
    let oddsum = 0;
    let evensum = 0;
    let arr = String(num).split('')
    for (let i = 0; i < arr.length; i++) {
        const digit = Number(arr[i])
        if (digit % 2 === 0) {
            evensum += digit;
        } else {
            oddsum += digit;
        }
    }
    return `Odd sum = ${oddsum}, Even sum = ${evensum}`




}
console.log(oddandEven(1000435))