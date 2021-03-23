function passwordGen(input) {
    let str = input[0].concat(input[1])
let matches = str.match(/[aeiou]/gi)

    console.log(str)
    console.log(matches)
    
}
passwordGen([
    'ilovepizza', 'ihatevegetables',
    'orange'
    ]
    )