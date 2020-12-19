function movies(input){
    // class Movie {
    //     constructor(name, director, date){
    //         this.name = name
    //         this.director = director
    //         this.date = date
    //     }
    // }
    let movies =[]

    for(let line of input){
        if(line.includes('addMovie')){
            let movieName = line.split(' ')
            let command = movieName.shift()
            let movieNameStr = movieName.join(' ')
           // console.log(movieName)
           // console.log(movieNameStr)
            let movie={}
            
            movie.name = movieName.join(' ')
           // console.log(movie)
            movies.push(movie)
        }else if(line.includes('directedBy')){
            let[movieName, director] = line.split(' directedBy ')
           // console.log(director)
            let findName = movies.find(x=>x.name=== movieName)
            if(findName){
                findName.director=director
                
            }
           // console.log(movies)
        }else{
            let[movieName, date] = line.split(' onDate ')
            let findName = movies.find(x=>x.name=== movieName)
            if(findName){
                findName.date=date
                
            }
        }
    }
    movies.forEach(x=>{
        if(x.name&& x.director&& x.date){
//let movieJSON = JSON.stringify(x)
console.log(JSON.stringify(x))

        }
    })
    


}
movies([
    'addMovie Fast and Furious',
    'addMovie Godfather',
    'Inception directedBy Christopher Nolan',
    'Godfather directedBy Francis Ford Coppola',
    'Godfather onDate 29.07.2018',
    'Fast and Furious onDate 30.07.2018',
    'Batman onDate 01.08.2018',
    'Fast and Furious directedBy Rob Cohen'
    ])