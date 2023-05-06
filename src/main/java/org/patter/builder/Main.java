package org.patter.builder;

import org.patter.builder.classes.Car;
import org.patter.builder.classes.CarBuildingDirector;
import org.patter.builder.classes.InputReader;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarBuildingDirector director = new CarBuildingDirector(sc);

        System.out.println("+-------------------------------+");
        System.out.println("|     C A R   B U I L D E R     |");
        System.out.println("+-------------------------------+");
        System.out.println();
        System.out.println("Welcome to the car builder!");
        System.out.println("Choose what you want to do by typing number correlated to one of the options");
        System.out.println("+-------------------------------+");
        System.out.println("|         O P T I O N S         |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. Build custom car           |");
        System.out.println("| 2. Build standard city car    |");
        System.out.println("| 3. Build standard sports car  |");
        System.out.println("| 4. Build standard truck car   |");
        System.out.println("| 5. Exit car builder           |");
        System.out.println("+-------------------------------+");
        System.out.println();
        System.out.println("Your choice (enter number between 1 and 5): ");

        int choice = InputReader.readIntFromList(sc, List.of(1, 2, 3, 4, 5));

        if (choice == 5) {
            System.out.println("Exiting car builder");
            return;
        }

        Car car;
        switch (choice) {
            case 1:
                car =  director.buildCustomCar();
                break;
            case 2:
                car =  director.buildCityCar();
                break;
            case 3:
                car =  director.buildSportCar();
                break;
            case 4:
                car =  director.buildTruckCar();
                break;
            default:
                System.out.println("Exiting car builder");
                return;
        }

        System.out.println("+-------------------------------+");
        System.out.println("|        Y O U R   C A R        |");
        System.out.println("+-------------------------------+");
        System.out.println();
        System.out.println(car);
        System.out.println();
        System.out.println("Thank you for using car builder");
        System.out.println("Exiting car builder");

    }
}