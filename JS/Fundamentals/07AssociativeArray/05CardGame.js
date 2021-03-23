function cardGame(input) {
    let players = {}

    for (let line of input) {
        let [name, cards] = line.split(': ')
        cards = cards.split(', ')
        if (!players[name]) {
            players[name] = []
        }
        for (let card of cards) {
            if (!players[name].includes(card)) {

                players[name].push(card)
            }
        }



    }
    Object.entries(players).forEach(element => {
        let sumCard = sumCards(element[1])
        console.log(`${element[0]}: ${sumCard}`)

    });

    function sumCards(input) {
        let sum = 0
        for (let card of input) {   
            
            let cardArr = card.split('')
            let type  = cardArr.pop()
            card = cardArr.join('')
    
            
            let current = 0
            
            
            //J, Q, K, A
            switch (card) {
                case 'J': current = 11; break;
                case 'Q': current = 12; break;
                case 'K': current = 13; break;
                case 'A': current = 14; break;
                default: current = Number(card)
            }
            //S -> 4, H-> 3, D -> 2, C -> 1
            
            switch (type) {
                case 'S': current *=4;break;
                case 'H': current*=3;break;
                case 'D': current*=2; break;
                case 'C': current*=1; break;
            }
            sum+= current
        }
        return sum
    
    }
    //console.log(sumCards(['2C', '4H', '9H', 'AS', 'QS', 'JD']))
 //   console.log(sumCards(['3H', '10S', 'JC', 'KD', '5S', '6H', '7S', 'KC', '10C']))


}
cardGame([
    'Peter: 2C, 4H, 9H, AS, QS',
    'Tomas: 3H, 10S, JC, KD, 5S, 10S',
    'Andrea: QH, QC, QS, QD',
    'Tomas: 6H, 7S, KC, KD, 5S, 10C',
    'Andrea: QH, QC, JS, JD, JC',
    'Peter: JD, JD, JD, JD, JD, JD'
]
)