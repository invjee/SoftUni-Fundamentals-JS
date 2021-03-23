function sumTable() {
    const rows = document.querySelectorAll('table tr');
    let sum = 0;

    for (let index = 1; index < rows.length-1; index++) {
        const element = rows[index].children;
       sum += Number(element[element.length-1].textContent);

       document.getElementById('sum').textContent= sum
        
    }



}