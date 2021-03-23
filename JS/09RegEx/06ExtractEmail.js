function extractEmail(input) {

    let pattern = /(?<=\s)([a-zA-Z0-9]+)[\-\._]*[a-zA-Z0-9]+@[a-zA-Z]+[-]*[a-zA-Z]+\.[a-zA-Z]+(\.[a-zA-Z]+)*/g

    //let match = input.match(pattern)

    let eMails = []


    let validEmail = null
    //let match = pettern.exec(input)
    while ((validEmail = pattern.exec(input)) !== null) {
        eMails.push(validEmail[0])
        //console.log(validEmail[0])

    }

    console.log(eMails.join('\n'))



}
extractEmail('Please contact us at: support@github.com. Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information.')