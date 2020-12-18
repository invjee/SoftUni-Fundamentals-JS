function gladiatorInventory(input) {
    // •	Buy {equipment}
    // •	Trash {equipment}
    // •	Repair {equipment}
    // •	Upgrade {equipment}-{upgrade}
    let inventory = input.shift().split(' ')
    
    //console.log(inventory)
    for (let command of input) {
        command = command.split(' ')
        let wordCommand = command.shift()
        let newInventory = command[0]
      //  console.log(command)
       // console.log(wordCommand)
        switch (wordCommand) {
            case 'Buy':
                if (!inventory.includes(newInventory)) {
                    inventory.push(newInventory)
                }
                break;
            case 'Trash':
                if (inventory.includes(newInventory)) {
                    let indexofNew = inventory.indexOf(newInventory)
                    inventory.splice(indexofNew, 1)
                }
                break;
            case 'Repair':
                if (inventory.includes(newInventory)) {
                    let indexofNew = inventory.indexOf(newInventory)
                    inventory.splice(indexofNew, 1)
                    inventory.push(newInventory)
                }
                break;
            case 'Upgrade':
                //"{equipment}:{upgrade}";
                let upgrade = newInventory.split('-')
                let newUp = `${upgrade[0]}` + ':' + `${upgrade[1]}`
                if (inventory.includes(upgrade[0])) {
                    let index = inventory.indexOf(upgrade[0])
                    inventory.splice(index+1, 0, newUp)

                }

                break;
        }
    }
    console.log(inventory.join(' '))

}
// gladiatorInventory(['SWORD Shield Spear',
//      'Buy Bag',
//     'Trash Shield',
//      'Repair Spear',
//      'Upgrade SWORD-Steel']
// )
gladiatorInventory(['SWORD Shield Spear',
'Trash Bow',
'Repair Shield',
'Upgrade Helmet-V']
)