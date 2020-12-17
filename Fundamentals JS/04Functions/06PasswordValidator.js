function validator(num) {
 

   

    function digitsLength(pass) {
        if (pass.length >= 6 && pass.length <= 10) {
            return true
        } else {
            return "Password must be between 6 and 10 characters"
        }
    }
    function checkCharacters(pass) {
        let isValid = false
        for (let i = 0; i < pass.length; i++) {
            let code = pass.charCodeAt(i)
            if (code >= 65 && code <= 90 ||
                code >= 97 && code <= 122 ||
                code >= 48 && code <= 57) {
                isValid =true
            }
            else {
                isValid = false
                break;
            }       

        }
        if(isValid){
            return true
        }else{
            return 'Password must consist only of letters and digits'
        }

    }

    function check2Digits(pass) {
        let count = 0
        let isValid = false
        for(let i =0; i <=pass.length; i++){
            let digit = pass.charCodeAt(i)
            if(digit >= 48 && digit <= 57){
                count++
            }
           
        }
        if(count>=2){
            return true               
        } else{
            return 'Password must have at least 2 digits'
        }


    }
   // console.log(check2Digits(num))

  //  console.log(checkCharacters(num))
    let result = []
  
    if(digitsLength(num)!==true){
        result.push(digitsLength(num))
    }
     if(checkCharacters(num)!==true){
        result.push(checkCharacters(num))
    }
     if(check2Digits(num)!==true){
        result.push(check2Digits(num))
    }
    if(digitsLength(num)===true&&checkCharacters(num)===true&&check2Digits(num)===true){
        result.push('Password is valid')
    }
return result.join('\n')

}

console.log(validator('PassWor23'))