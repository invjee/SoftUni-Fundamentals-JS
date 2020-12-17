function matrixN(n){
let resurlt = []
    for(let i = 0; i<n;i++){
        printRow(n)
        resurlt.push(printRow(n))
    }
    return resurlt.join('\n')
  
    function printRow(x){
        let printLn = ''

        for(let i = 0; i<n; i++){
            
            printLn += `${n} `
            }
            return printLn
    }


}
console.log(matrixN(7))