function personalInfo(input){
// "Name: {employeeName} -- Personal Number: {personalNum}" 
class Person{
    constructor(employeeName){
        this.employeeName = employeeName;
        this.personalNum = employeeName.length
    }
  readIt(){
    console.log(`Name: ${this.employeeName} -- Personal Number: ${this.personalNum}`)
  }
}

input = input.map(x=>new Person(x))

input.forEach(element => {
    element.readIt()
    
});

// for(let names of input){
       
//     let person = new Person(names, num)
    
//     persons.push(person)
//     }

//     persons.forEach(element => {
//         console.log(`Name: ${element.employeeName} -- Personal Number: ${element.personalNum}`)
        
//     });
    
}


personalInfo([
    'Silas Butler',
    'Adnaan Buckley',
    'Juan Peterson',
    'Brendan Villarreal'
    ]
    )

//   function findNumber(input){
//       let employees = {}
//       for(const name of input){
//         employees[name]= name.length
        
//       }
//       console.log(employees)


//   }
//   findNumber(['Silas Butler',
//   'Adnaan Buckley',
//   'Juan Peterson',
//   'Brendan Villarreal'
//   ])
