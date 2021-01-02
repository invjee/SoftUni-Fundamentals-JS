function extractFile(input) {
    
    let i = input.lastIndexOf('.')
    let extension = input.substring(i+1)
    let j = input.lastIndexOf('\\')
    let name = input.substring(j+1, i)
    console.log(`File name: ${name}`)
    console.log(`File extension: ${extension}`)

    
}
extractFile('C:\\Internal\\training-internal\\Template.pptx')