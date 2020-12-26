function school(input) {
    let students = new Map

    for (let line of input) {
        let tokens = line.split(' ')
        let name = tokens.shift()

        //  console.log(name)
        let grades = tokens.map(Number)
        //.log(grade)



        // if (students.has(name)) {
        //     let existing = students.get(name)
        //     for (let grade of grades) {

        //         existing.push(grade)
        //     }

        // }else{

        //     students.set(name, grades)
        // }
        //друг начин
        if (!students.has(name)) {
            students.set(name, [])
        }
        let existing = students.get(name)
        for (let grade of grades) {

            existing.push(grade);

        }  
    }
 

    let sorted = Array.from(students)
    sorted.sort(compareAvgGrades)

    for(let[name, grades] of sorted){
        console.log(`${name}: ${grades.join(', ')}`)
    }

    function compareAvgGrades([nameA, gradeA], [nameB, gradeB]) {
        let avgA = 0
        gradeA.forEach(x => avgA += x)
            
            avgA /= gradeA.length
        

        let avgB = 0
        gradeB.forEach(x => avgB += x)
            
            avgB /= gradeB.length
        

        return avgA - avgB


    }

}
school(['Lilly 4 6 6 5',
    'Tim 5 6',
    'Tammy 2 4 3',
    'Tim 6 6']
)