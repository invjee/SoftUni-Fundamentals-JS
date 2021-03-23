function charactersInRange(a,b){
    let codeAsii1 = a.charCodeAt()
    let codeAsii2 = b.charCodeAt()
    

    let start = codeAsii1<codeAsii2? codeAsii1: codeAsii2;
    let end = codeAsii2>codeAsii1? codeAsii2: codeAsii1;
    let line = '';

    for(let i = start+1; i<end; i++){
        line += String.fromCharCode(i)+ ' '
    }
    return line
}
console.log(charactersInRange('a',
'd'
))
