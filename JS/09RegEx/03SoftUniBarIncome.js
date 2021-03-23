function barIncoome(input){

    let pattern = /%(?<name>[A-Z][a-z]+)%([^\%\|\$\.]+)?<(?<product>\w+)>([^\%\|\$\.]+)?\|(?<count>\d+)\|([^\%\|\$\.\d]+)?(?<price>[\d]+(.[\d]+)?)\$/
let income = 0

    let index = 0
    let line = input[index]
    while(line!=='end of shift'){
        let match = pattern.exec(line)
        if(match!==null){
            let name = match.groups.name
            let product =match.groups.product
            let count =Number(match.groups.count)
            let price = Number(match.groups.price)
            
            console.log(`${name}: ${product} - ${(count*price).toFixed(2)}`)
            income += price*count

        }
        index++
        line= input[index]

    }
    console.log(`Total income: ${income.toFixed(2)}`)

}
// barIncoome([
//     '%George%<Croissant>|2|10.3$',
//     '%Peter%<Gum>|1|1.3$',
//     '%Maria%<Cola>|1|2.4$',
//     'end of shift'
//   ])
  barIncoome(['%InvalidName%<Croissant>|2|10.3$',
   '%Peter%<Gum>1.3$',
   '%Maria%<Cola>|1|2.4',
   '%Valid%<Valid>valid|10|valid20$',
    'end of shift'
    ])