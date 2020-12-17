function test(input){
    let index = 0;
    let studentsCount = Number(input[index]);
    index++;
    let topStudents = 0;
    let btw45 = 0
    let btw35 = 0
    let fail = 0
    let sumGrade = 0;

 
    for(let i = 1; i <= studentsCount; i++){
        let grade = Number(input[index])
        index++
        sumGrade += grade
        if(grade>= 5){
            topStudents++
        }else if( grade>=4 && grade<=4.99){
            btw45++
        }else if(grade >=3 && grade <=3.99){
            btw35++
        }else if(grade < 3){
            fail++
        }

    }
    console.log(`Top students: ${(topStudents/studentsCount*100).toFixed(2)}%`)
    console.log(`Between 4.00 and 4.99: ${(btw45/studentsCount*100).toFixed(2)}%`)
    console.log(`Between 3.00 and 3.99: ${(btw35/studentsCount*100).toFixed(2)}%`)
    console.log(`Fail: ${(fail/studentsCount*100).toFixed(2)}%`)
    console.log(`Average: ${(sumGrade/studentsCount).toFixed(2)}`)
   
}
// test(["10",
//     "3.00",
//     "2.99",
//     "5.68",
//     "3.01",
//     "4",
//     "4",
//     "6.00",
//     "4.50",
//     "2.44",
//     "5"
//     ])
test([6,
    2,
    3,
    4,
    5,
    6,
    2.2
    ])