function cats(input){
class Cat{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
    meow(){
        console.log(`${this.name}, age ${this.age} says Meow`)
    }
}

//let myCat = new cat('Mellow', 2) 
//myCat.meow()

for(let catofString of input){

    let[catName, catAge] = catofString.split(' ');
    let cat = new Cat(catName, catAge)
    cat.meow()
}

//console.log(myCat)
}
cats(['Mellow 2', 'Tom 5'])