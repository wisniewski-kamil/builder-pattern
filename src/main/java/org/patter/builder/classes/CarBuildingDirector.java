package org.patter.builder.classes;

import org.patter.builder.types.CarColor;
import org.patter.builder.types.CarType;
import org.patter.builder.types.FuelType;
import org.patter.builder.types.GearboxType;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarBuildingDirector {

    private Scanner sc = new Scanner(System.in);

    public Car buildCustomCar() {
        CarBuilder builder = new CarBuilder();

        System.out.println("What type of car would you like? (CITY/SPORT/TRUCK):");
        builder.type(
                CarType.valueOf(
                        InputReader.readStringFromList(sc, Arrays.stream(CarType.values()).map(Enum::name).collect(Collectors.toList()))
                )
        );

        System.out.println("What color your car should be? (BLACK/BLUE/GREEN/RED/SILVER/WHITE/YELLOW):");
        builder.color(
                CarColor.valueOf(
                        InputReader.readStringFromList(sc, Arrays.stream(CarColor.values()).map(Enum::name).collect(Collectors.toList()))
                )
        );

        System.out.println("How many doors your car should have? (3 or 5):");
        builder.doorsNumber(
                InputReader.readIntFromList(sc, List.of(3, 5))
        );

        System.out.println("What fuel should your car run on? (DIESEL/ELECTRIC/PETROL):");
        builder.fuel(
                FuelType.valueOf(
                        InputReader.readStringFromList(sc, Arrays.stream(FuelType.values()).map(Enum::name).collect(Collectors.toList()))
                )
        );

        System.out.println("What type of gearbox your car should have? (AUTOMATIC/MANUAL):");
        GearboxType gearboxType = GearboxType.valueOf(
                InputReader.readStringFromList(sc, Arrays.stream(GearboxType.values()).map(Enum::name).collect(Collectors.toList()))
        );
        System.out.println("How many gears your car should have? (between 2 and 10):");
        int gearsAmount = InputReader.readIntFromList(sc, List.of(2, 3, 4, 5, 6, 7, 8, 9, 10));
        builder.gearbox(new Gearbox(gearboxType, gearsAmount));

        System.out.println("How many seats your car should have? (2, 4 or 5):");
        builder.seats(
                InputReader.readIntFromList(sc, List.of(2, 4, 5))
        );

        System.out.println("Should your car have a roof? (true or false):");
        builder.hasRoof(
                InputReader.readBoolean(sc)
        );

        System.out.println("Should your car have a spoiler? (true or false):");
        builder.hasSpoiler(
                InputReader.readBoolean(sc)
        );

        return builder.build();
    }

    public Car buildCityCar() {
        return null;
    }

    public Car buildSportCar() {
        return null;
    }

    public Car buildTruckCar() {
        return null;
    }

}
