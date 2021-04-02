package ExamPrepFin;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, int[]> cars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\|");
            String name = line[0];
            int mileage = Integer.parseInt(line[1]);
            int fuel = Integer.parseInt(line[2]);
            cars.put(name, new int[2]);
            cars.get(name)[0]=mileage;
            cars.get(name)[1]=fuel;
        }
        String line = scanner.nextLine();
        while(!line.equals("Stop")){
            String[] tokens = line.split(" : ");
            String command = tokens[0];
            String car = tokens[1];
            if(command.equals("Drive")){
                int distance = Integer.parseInt(tokens[2]);
                int fuel = Integer.parseInt(tokens[3]);
                drive(cars, car, distance,fuel);

            }else if(command.equals("Refuel")){
                int fuel = Integer.parseInt(tokens[2]);
                refuel(cars, car, fuel);

            }else if(command.equals("Revert")){
                int km = Integer.parseInt(tokens[2]);
                revert(cars, car,km);

            }

            line = scanner.nextLine();
        }
        cars.entrySet().stream()
                .sorted((a,b)->{
                    int result = Integer.compare( b.getValue()[0],a.getValue()[0]);

                    if(result==0){
                        result=a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(e->{
            System.out.println(String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", e.getKey(),e.getValue()[0], e.getValue()[1]));
        });

    }

    private static void revert(Map<String,int[]> cars, String car, int km) {
        if(cars.get(car)[0]-km<10000){
            cars.get(car)[0]=10000;
        }else{
            System.out.println(String.format("%s mileage decreased by %d kilometers", car, km));
            cars.get(car)[0]-=km;
        }
    }

    private static void refuel(Map<String,int[]> cars, String car, int fuel) {
        if(cars.get(car)[1]+fuel>75){
            int fuelRefilled = 75-cars.get(car)[1];
            System.out.println(String.format("%s refueled with %d liters",car, fuelRefilled));
            cars.get(car)[1]=75;
        }else{
            System.out.println(String.format("%s refueled with %d liters",car, fuel));
            cars.get(car)[1]+=fuel;
        }
    }

    private static void drive(Map<String,int[]> cars, String car, int distance, int fuel) {
        if(cars.get(car)[1]>=fuel){
            cars.get(car)[1]-=fuel;
            cars.get(car)[0] +=distance;
            System.out.println(String.format("%s driven for %d kilometers. %d liters of fuel consumed.",car, distance, fuel));
            if(cars.get(car)[0]>=100000){
                System.out.printf("Time to sell the %s!%n", car);
                cars.remove(car);
            }
        }else{
            System.out.println("Not enough fuel to make that ride");
        }
    }
}
