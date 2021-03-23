function systemsRegister(input) {
    //“{systemName} | {componentName} | {subcomponentName}” 

    // правя обекти за всяка система, който съдържа компоненти и субкомпоненти
    // всички системи са в един обект или масив
    // сортирам системите по възходящ ред по броя на компонентите
    // сортирам по възходящ ред компонентие по броя на суб компонентите
    // принтирам

    let system = {}

    for (let line of input) {
        let [systemName, componentName, subcomponentName] = line.split(' | ')
        if (!system[systemName]) {
            system[systemName] = {}
        }
        if (!system[systemName][componentName]) {
            system[systemName][componentName] = []
        }
        system[systemName][componentName].push(subcomponentName)
        //subcomponentName

        // systemName.componentName[subcomponents]  




    }
    Object.entries(system).sort((curr, next) => {
        return Object.entries(next[1]).length - Object.entries(curr[1]).length || curr[0].localeCompare(next[0])
    })
        .forEach(([system, components]) => {
            console.log(system)
            Object.entries(components).sort((curr, next) => {
                return next[1].length - curr[1].length
            })
                .forEach(([component, subcomponents]) => {
                    Object.entries(component)
                    console.log(`|||${component}`)
                    subcomponents.forEach(el => {
                        console.log(`||||||${el}`)
                    })
                })



        });
    // console.log(system)

}
systemsRegister(["SULS | Main Site | Home Page",
    "SULS | Main Site | Login Page",
    "SULS | Main Site | Register Page",
    "SULS | Judge Site | Login Page",
    "SULS | Judge Site | Submittion Page",
    "Lambda | CoreA | A23",
    "SULS | Digital Site | Login Page",
    "Lambda | CoreB | B24",
    "Lambda | CoreA | A24",
    "Lambda | CoreA | A25",
    "Lambda | CoreC | C4",
    "Indice | Session | Default Storage",
    "Indice | Session | Default Security"
])