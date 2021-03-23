function companuUsers(input) {
    let company = {}

    for(let line of input){
        let[companyName, userID] = line.split(' -> ')

        if(!company.hasOwnProperty(companyName)){
            company[companyName] = []
           
        }
        if(!company[companyName].includes(userID)){
            company[companyName].push(userID)
        }
    }
    Object.entries(company).sort((a,b)=>{
       return a[0].localeCompare(b[0])
    })
    .forEach(([company,personID]) => {
    
        console.log(`${company}\n-- ${personID.join('\n-- ')}`)
    });
}
// companuUsers([
//     'SoftUni -> AA12345',
//     'SoftUni -> BB12345',
//     'Microsoft -> CC12345',
//     'HP -> BB12345'
//     ]
//     )
    companuUsers([
        'SoftUni -> AA12345',
        'SoftUni -> CC12344',
        'Lenovo -> XX23456',
        'SoftUni -> AA12345',
        'Movement -> DD11111'
        ]
        )