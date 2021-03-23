package ObjectsAndClassesEx.VehicleCataloge06;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }



    @Override
    public String toString() {
        String formattedType = type.substring(0,1).toUpperCase()+type.substring(1);

        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", formattedType, model, color, horsepower);
    }
}
