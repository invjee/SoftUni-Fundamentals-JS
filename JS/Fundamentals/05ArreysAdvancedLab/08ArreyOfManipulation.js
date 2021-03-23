function arrToManipulate(input) {
    let arr = input.shift().split(' ').map(Number)
    let commands = arrToManipulate
    //console.log(arr)

    // •	Add {number}: add a number to the end of the array
    // •	Remove {number}: remove number from the array
    // •	RemoveAt {index}: removes number at a given index
    // •	Insert {number} {index}: inserts a number at a given index

    for (let i = 0; i < input.length; i++) {
        let commandArr = input[i].split(' ')

        let command = commandArr.shift()

        let numbers = commandArr.map(Number)

        let firstNum = numbers.shift();
        let secondNum = Number(numbers.join(''))
        // Number(arrayOfDigits.join(''))
       // console.log(firstNum)
        //console.log(secondNum)

        switch (command) {
            case "Add": add(firstNum); break;
            case "Remove": remove(firstNum); break;
            case "RemoveAt": removeAt(firstNum); break;
            case "Insert": insert(firstNum, secondNum); break;
        }

        //console.log(numbers)
    }

    function add(num) {
        arr.push(num)
    }
    function remove(num) {
        arr = arr.filter(x => x !== num)
    }
    function removeAt(index) {
        arr.splice(index, 1)
    }
    function insert(num, index) {
        arr.splice(index, 0, num)
    }
 console.log(arr.join(' '))

}
arrToManipulate(['4 19 2 53 6 43',
    'Add 3',
    'Remove 2',
    'RemoveAt 1',
    'Insert 8 3']
)