function extract(id) {
    const text = document.getElementById(id).textContent;
    const pattern= /\((.+?)\)/gm;

    let match = pattern.exec(text);
    let result = [];

    while(match!=null){
        console.log(match);
        result.push(match[1]);

        match=pattern.exec(text);
    }

    return result.join('; ');

console.log(text)
}