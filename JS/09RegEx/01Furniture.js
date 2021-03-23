function furniture(input) {

    let sum = 0
    let finalText = 'Bought furniture:'

    //console.log('Bought furniture:')

    for (const line of input) {
        let pattern = />>(?<name>[A-Za-z]+)<<(?<price>[\d]+(\.[\d]+)?)!(?<quantity>[\d]+)/g
        let match = pattern.exec(line)
        //  console.log(match)

        if (match) {
            let name = match.groups.name
            let price = Number(match.groups.price)
            let quantity = Number(match.groups.quantity)
            sum += price * quantity
            // console.log(name)
            finalText += `\n${name}`
        }

        // if(purchase.match(pattern)){

        // }



      
    }
    console.log(finalText)
    console.log(`Total money spend: ${sum.toFixed(2)}`)




}
furniture(['>>Sofa<<312.23!3', '>>TV<<300!5', '>Invalid<<!5', 'Purchase'])
