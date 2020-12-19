function vehicleClass(){
class Vehicle{
    constructor(type, model,parts, fuel){
        this.type= type;
        this.model = model;
        this.parts = parts
        this.parts.quality = this.parts.engine*this.parts.power
        this.fuel = fuel;
        
    
       }
       drive(x){
           
        this.fuel -= x                    
       }
    }
       
     
    //const Vehicle = result;

    let parts = {engine: 6, power: 100};
    let vehicle = new Vehicle('a', 'b', parts, 200);
    vehicle.drive(100);
    console.log(vehicle.parts.quality)
    
    // expect(vehicle.fuel).to.equal(100);
    // expect(vehicle.parts.quality).to.equal(600);




}
vehicleClass()