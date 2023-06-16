package com.sc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DealershipFileManager {
//    String dealershipFileLocation = "./src/main/java/com/sc/dealership.txt";
//    public Dealership getDealership(){
////        try {
//            FileInputStream dealershipFile = new FileInputStream(dealershipFileLocation);
//            Scanner scanner = new Scanner(dealershipFile);
//
//            String firstLineDealershipDate = scanner.nextLine();
//            String[] dealershipDateArr = firstLineDealershipDate.split(Pattern.quote("|"));
//            Dealership initialDealership = new Dealership(dealershipDateArr[0], dealershipDateArr[1], dealershipDateArr[2]);
//
//            String vehicleDate;
//            while(scanner.hasNext()){
//               vehicleDate = scanner.nextLine();
//                String[] vehicleDateArr = vehicleDate.split(Pattern.quote("|"));
//
//                Vehicle currentVehicle = new Vehicle(
//                        Integer.parseInt(vehicleDateArr[0]),
//                        Integer.parseInt(vehicleDateArr[1]),
//                        vehicleDateArr[2],
//                        vehicleDateArr[3],
//                        vehicleDateArr[4],
//                        vehicleDateArr[5],
//                        Integer.parseInt(vehicleDateArr[6]),
//                        Double.parseDouble(vehicleDateArr[7])
//                );
//                initialDealership.addVehicle(currentVehicle);
//            }
//            scanner.close();
//            return new Dealership("", "", "");
//        } catch (FileNotFoundException e){
//            throw new RuntimeException(e);
//        }
//    }
//    public void saveDealership(Dealership dealership){
//
//        try{
//            FileWriter fileWriter = new FileWriter(dealershipFileLocation);
//            fileWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone() + "\n");
//
//            for(Vehicle vehicle: dealership.getAllVehicles()){
//                fileWriter.write(
//                        vehicle.getVin() + "|" +
//                        vehicle.getYear() + "|" +
//                        vehicle.getMake() + "|" +
//                        vehicle.getModel() + "|" +
//                        vehicle.getVehicleType() +"|" +
//                        vehicle.getOdometer() + "|" +
//                        vehicle.getPrice() + "\n"
//                );
//            }
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
