function activationKeys(input) {
  
  
  let actions = {
    Contains(rawKey, [substring]) {

      if (rawKey.includes(substring)) {
        console.log(`${rawKey} contains ${substring}`)
      } else {
        console.log('Substring not found!')

      }
      return rawKey
    },
    Flip(rawKey, [caseSize, index1, index2]) {
      [index1, index2] = [Number(index1), Number(index2)];
      let firstSubstr = rawKey.substring(0, index1)
      let secSubstr = rawKey.substring(index1, index2)
      let lastSubstr = rawKey.substring(index2)
      if (caseSize === "Upper") {
        secSubstr = secSubstr.toUpperCase();
      } else {
        secSubstr = secSubstr.toLowerCase();
      }
      let newKey = firstSubstr + secSubstr + lastSubstr
      console.log(newKey)

      return newKey

    },
      Slice(rawKey, [start, end]) {
        [start, end] = [Number(start), Number(end)]
      let firstSubstr = rawKey.substring(0, start)
      let secSubstr = rawKey.substring(start, end)
      let lastSubstr = rawKey.substring(end)
      let newKey = firstSubstr + lastSubstr
      console.log(newKey)
      return newKey

    }
  };
  let rawKey = input.shift();  
  let commands;
  while ((commands= input.shift()) !== 'Generate') {
    let [actionName, ...args] = commands.split('>>>')
    rawKey= actions[actionName](rawKey, args)
    }
    
console.log('Your activation key is: '+ rawKey)


}
activationKeys([
  'abcdefghijklmnopqrstuvwxyz',
  'Slice>>>2>>>6',
  'Flip>>>Upper>>>3>>>14',
  'Flip>>>Lower>>>5>>>7',
  'Contains>>>def',
  'Contains>>>deF',
  'Generate'
])
