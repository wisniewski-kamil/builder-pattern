package org.patter.builder.classes;

import org.junit.jupiter.api.Test;
import org.patter.builder.types.CarColor;
import org.patter.builder.types.CarType;
import org.patter.builder.types.FuelType;
import org.patter.builder.types.GearboxType;

import static org.junit.jupiter.api.Assertions.*;

class CarBuilderTest {
    @Test
    public void testType() {
        // given
        CarBuilder builder = new CarBuilder();
        CarType type = CarType.CITY;

        // when
        builder.type(type);
        Car car = builder.build();

        // then
        assertEquals(type, car.getType());
    }

    @Test
    public void testColor() {
        // given
        CarBuilder builder = new CarBuilder();
        CarColor color = CarColor.RED;

        // when
        builder.color(color);
        Car car = builder.build();

        // then
        assertEquals(color, car.getColor());
    }

    @Test
    public void testDoorsNumber() {
        // given
        CarBuilder builder = new CarBuilder();
        int doorsNumber = 4;

        // when
        builder.doorsNumber(doorsNumber);
        Car car = builder.build();

        // then
        assertEquals(doorsNumber, car.getDoorsNumber());
    }

    @Test
    public void testFuel() {
        // given
        CarBuilder builder = new CarBuilder();
        FuelType fuel = FuelType.PETROL;

        // when
        builder.fuel(fuel);
        Car car = builder.build();

        // then
        assertEquals(fuel, car.getFuel());
    }

    @Test
    public void testGearbox() {
        // given
        CarBuilder builder = new CarBuilder();
        Gearbox gearbox = new Gearbox(GearboxType.AUTOMATIC, 6);

        // when
        builder.gearbox(gearbox);
        Car car = builder.build();

        // then
        assertEquals(gearbox, car.getGearbox());
    }

    @Test
    public void testSeats() {
        // given
        CarBuilder builder = new CarBuilder();
        int seats = 5;

        // when
        builder.seats(seats);
        Car car = builder.build();

        // then
        assertEquals(seats, car.getSeats());
    }

    @Test
    public void testHasRoof() {
        // given
        CarBuilder builder = new CarBuilder();
        boolean hasRoof = true;

        // when
        builder.hasRoof(hasRoof);
        Car car = builder.build();

        // then
        assertEquals(hasRoof, car.hasRoof());
    }

    @Test
    public void testHasSpoiler() {
        // given
        CarBuilder builder = new CarBuilder();
        boolean hasSpoiler = false;

        // when
        builder.hasSpoiler(hasSpoiler);
        Car car = builder.build();

        // then
        assertEquals(hasSpoiler, car.hasSpoiler());
    }

    @Test
    public void testBuild() {
        // given
        CarBuilder builder = new CarBuilder();
        CarType type = CarType.CITY;
        CarColor color = CarColor.RED;
        int doorsNumber = 4;
        FuelType fuel = FuelType.PETROL;
        Gearbox gearbox = new Gearbox(GearboxType.AUTOMATIC, 6);
        int seats = 5;
        boolean hasRoof = true;
        boolean hasSpoiler = false;

        // when
        Car car = builder.type(type)
                .color(color)
                .doorsNumber(doorsNumber)
                .fuel(fuel)
                .gearbox(gearbox)
                .seats(seats)
                .hasRoof(hasRoof)
                .hasSpoiler(hasSpoiler)
                .build();

        // then
        assertEquals(type, car.getType());
        assertEquals(color, car.getColor());
        assertEquals(doorsNumber, car.getDoorsNumber());
        assertEquals(fuel, car.getFuel());
        assertEquals(gearbox, car.getGearbox());
        assertEquals(seats, car.getSeats());
        assertEquals(hasRoof, car.hasRoof());
        assertEquals(hasSpoiler, car.hasSpoiler());
    }
}