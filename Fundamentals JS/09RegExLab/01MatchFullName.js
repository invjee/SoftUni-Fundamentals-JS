function names([text]){

    let pattern = /\b[A-Z][a-z]+ [A-Z][a-z]+/g

    let matches = text.match(pattern)

    console.log(matches.join(' '))




    
}
names(["Ivan Ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Test Testov, Ivan	Ivanov"])
