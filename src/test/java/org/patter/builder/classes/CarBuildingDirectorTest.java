package org.patter.builder.classes;

import org.junit.jupiter.api.Test;
import org.patter.builder.types.CarColor;
import org.patter.builder.types.CarType;
import org.patter.builder.types.FuelType;
import org.patter.builder.types.GearboxType;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CarBuildingDirectorTest {
    @Test
    void testBuildCustomCar() {
        // given
        String input = "SPORT\n" +
                "BLUE\n" +
                "3\n" +
                "PETROL\n" +
                "AUTOMATIC\n" +
                "6\n" +
                "5\n" +
                "true\n" +
                "true\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        CarBuildingDirector carBuildingDirector = new CarBuildingDirector(scanner);

        // when
        Car customCar = carBuildingDirector.buildCustomCar();

        // then
        assertEquals(CarType.SPORT, customCar.getType());
        assertEquals(CarColor.BLUE, customCar.getColor());
        assertEquals(3, customCar.getDoorsNumber());
        assertEquals(FuelType.PETROL, customCar.getFuel());
        assertEquals(GearboxType.AUTOMATIC, customCar.getGearbox().getType());
        assertEquals(6, customCar.getGearbox().getGearsAmount());
        assertEquals(5, customCar.getSeats());
        assertEquals(true, customCar.hasRoof());
        assertEquals(true, customCar.hasSpoiler());
    }

    @Test
    void testBuildCustomCar_EveryInputValidOnSecond() {
        // given
        String input = "SPOT\n" +
                "SPORT\n" +
                "BLI\n" +
                "BLUE\n" +
                "4\n" +
                "3\n" +
                "PITROL\n" +
                "PETROL\n" +
                "AUTOMIC\n" +
                "AUTOMATIC\n" +
                "1\n" +
                "6\n" +
                "5\n" +
                "8\n" +
                "t\n" +
                "true\n" +
                "yes\n" +
                "true\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        CarBuildingDirector carBuildingDirector = new CarBuildingDirector(scanner);

        // when
        Car customCar = carBuildingDirector.buildCustomCar();

        // then
        assertEquals(CarType.SPORT, customCar.getType());
        assertEquals(CarColor.BLUE, customCar.getColor());
        assertEquals(3, customCar.getDoorsNumber());
        assertEquals(FuelType.PETROL, customCar.getFuel());
        assertEquals(GearboxType.AUTOMATIC, customCar.getGearbox().getType());
        assertEquals(6, customCar.getGearbox().getGearsAmount());
        assertEquals(5, customCar.getSeats());
        assertEquals(true, customCar.hasRoof());
        assertEquals(true, customCar.hasSpoiler());
    }

    @Test
    void testBuildCustomCar_EveryInputTrimmed() {
        // given
        String input = "   CITY   \n" +
                "\tRED   \n" +
                "  3\t\n" +
                "    PETROL\n" +
                "MANUAL    \n" +
                "\t3\n" +
                "2\t\n" +
                "   \ttrue\n" +
                "true\t    \n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        CarBuildingDirector carBuildingDirector = new CarBuildingDirector(scanner);

        // when
        Car customCar = carBuildingDirector.buildCustomCar();

        // then
        assertEquals(CarType.CITY, customCar.getType());
        assertEquals(CarColor.RED, customCar.getColor());
        assertEquals(3, customCar.getDoorsNumber());
        assertEquals(FuelType.PETROL, customCar.getFuel());
        assertEquals(GearboxType.MANUAL, customCar.getGearbox().getType());
        assertEquals(3, customCar.getGearbox().getGearsAmount());
        assertEquals(2, customCar.getSeats());
        assertEquals(true, customCar.hasRoof());
        assertEquals(true, customCar.hasSpoiler());
    }

    @Test
    void testBuildCityCar() {
        // given
        String input = "BLUE\n" +
                "3\n" +
                "PETROL\n" +
                "AUTOMATIC\n" +
                "3\n" +
                "5\n" +
                "true\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        CarBuildingDirector carBuildingDirector = new CarBuildingDirector(scanner);

        // when
        Car cityCar = carBuildingDirector.buildCityCar();

        // then
        assertEquals(CarType.CITY, cityCar.getType());
        assertEquals(CarColor.BLUE, cityCar.getColor());
        assertEquals(3, cityCar.getDoorsNumber());
        assertEquals(FuelType.PETROL, cityCar.getFuel());
        assertEquals(GearboxType.AUTOMATIC, cityCar.getGearbox().getType());
        assertEquals(3, cityCar.getGearbox().getGearsAmount());
        assertEquals(5, cityCar.getSeats());
        assertEquals(true, cityCar.hasRoof());
        assertEquals(false, cityCar.hasSpoiler());
    }

    @Test
    void testBuildSportCar() {
        // given
        String input = "BLUE\n" +
                "3\n" +
                "PETROL\n" +
                "AUTOMATIC\n" +
                "5\n" +
                "2\n" +
                "true\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        CarBuildingDirector carBuildingDirector = new CarBuildingDirector(scanner);

        // when
        Car sportCar = carBuildingDirector.buildSportCar();

        // then
        assertEquals(CarType.SPORT, sportCar.getType());
        assertEquals(CarColor.BLUE, sportCar.getColor());
        assertEquals(3, sportCar.getDoorsNumber());
        assertEquals(FuelType.PETROL, sportCar.getFuel());
        assertEquals(GearboxType.AUTOMATIC, sportCar.getGearbox().getType());
        assertEquals(5, sportCar.getGearbox().getGearsAmount());
        assertEquals(2, sportCar.getSeats());
        assertEquals(true, sportCar.hasRoof());
        assertEquals(true, sportCar.hasSpoiler());
    }

    @Test
    void testBuildTruckCar() {
        // given
        String input = "BLUE\n" +
                "3\n" +
                "PETROL\n" +
                "AUTOMATIC\n" +
                "7\n" +
                "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        CarBuildingDirector carBuildingDirector = new CarBuildingDirector(scanner);

        // when
        Car truckCar = carBuildingDirector.buildTruckCar();

        // then
        assertEquals(CarType.TRUCK, truckCar.getType());
        assertEquals(CarColor.BLUE, truckCar.getColor());
        assertEquals(3, truckCar.getDoorsNumber());
        assertEquals(FuelType.PETROL, truckCar.getFuel());
        assertEquals(GearboxType.AUTOMATIC, truckCar.getGearbox().getType());
        assertEquals(7, truckCar.getGearbox().getGearsAmount());
        assertEquals(5, truckCar.getSeats());
        assertEquals(true, truckCar.hasRoof());
        assertEquals(false, truckCar.hasSpoiler());
    }
}