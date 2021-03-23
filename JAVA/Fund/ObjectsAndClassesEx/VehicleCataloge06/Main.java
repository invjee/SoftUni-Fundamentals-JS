package ObjectsAndClassesEx.VehicleCataloge06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Vehicle> catalogue = new ArrayList<>();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            catalogue.add(vehicle);


            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {

            String model = line;
            for (Vehicle vehicle : catalogue) {
                if (model.equals(vehicle.getModel())) {
                    System.out.println(vehicle.toString());
                }

            }
            line = scanner.nextLine();
        }

        double sumCars = 0;
        int carsCounter = 0;
        double sumTrucks = 0;
        int truckCounter = 0;

        for (Vehicle vehicle : catalogue) {
            double currentHorsepower = (double) vehicle.getHorsepower();

            if (vehicle.getType().equals("car")) {
                sumCars += currentHorsepower;
                carsCounter++;
            } else {
                sumTrucks += currentHorsepower;
                truckCounter++;
            }
        }
        double averageCars = 0;
        double averageTrucks = 0;
        if(carsCounter>0){
            averageCars = sumCars/carsCounter;
        }
        if(truckCounter>0){
            averageTrucks = sumTrucks/truckCounter;
        }


        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);



    }
}
