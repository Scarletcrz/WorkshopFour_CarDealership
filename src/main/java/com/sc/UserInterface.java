package com.sc;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Dealership dealership;
    static Scanner scanner = new Scanner(System.in);
    private final DealershipFileManager dealershipFileManager = new DealershipFileManager();

    private void init(){
        this.dealership = dealershipFileManager.getDealership();
    }

    public void display() {
        init();
        System.out.println("Current Dealership: " + this.dealership);
        String input;
        do {
            System.out.println("Please choose a command:");
            System.out.println("\t1: Find vehicles within a price range.");
            System.out.println("\t2: Find vehicles by make and model.");
            System.out.println("\t3: Find vehicles by year range.");
            System.out.println("\t4: Find vehicles by color.");
            System.out.println("\t5: Find vehicles by mileage range.");
            System.out.println("\t6: Find vehicles by type (car, truck, SUV, van).");
            System.out.println("\t7: List ALL vehicles.");
            System.out.println("\t8: Add a Vehicle.");
            System.out.println("\t9: Remove a Vehicle.");
            System.out.println("\t99: Quit.");

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    processGetVehiclesByPriceRequest();
                    break;
                case "2":
                    processGetVehiclesByMakeModelRequest();
                    break;
                case "3":
                    processGetVehiclesByYearRequest();
                    break;
                case "4":
                    processGetVehicleByColorRequest();
                    break;
                case "5":
                    processGetVehicleByMileageRequest();
                    break;
                case "6":
                    processGetVehicleBTypeOfCarRequest();
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicle();
                    break;
                default:
                    System.out.println("Command not found, please try again");

            }

        } while (!input.equalsIgnoreCase("99"));
    }
    public void processGetVehiclesByPriceRequest() {
        System.out.println("Please provide minimum price");
        float minValue = scanner.nextFloat();
        System.out.println("Please provide maximum price");
        float maxValue = scanner.nextFloat();

        ArrayList<Vehicle> vehiclesByPrice = this.dealership.getVehiclesByPrice(minValue, maxValue);
        for(Vehicle vehicle: vehiclesByPrice){
            System.out.println(vehicle);
        }
        scanner.nextLine();
    }
    public void processGetVehiclesByMakeModelRequest(){}
    public void processGetVehiclesByYearRequest(){}
    public void processGetVehicleByColorRequest(){}
    public void processGetVehicleByMileageRequest(){}
    public void processGetVehicleBTypeOfCarRequest(){}
    public void processGetAllVehiclesRequest(){}
    public void processAddVehicleRequest(){}
    public void processRemoveVehicle(){}
}
