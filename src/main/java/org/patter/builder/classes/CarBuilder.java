package org.patter.builder.classes;

import org.patter.builder.types.CarColor;
import org.patter.builder.types.CarType;
import org.patter.builder.types.FuelType;

public class CarBuilder {

    private CarType type;

    private CarColor color;

    private int doorsNumber;

    private FuelType fuel;

    private Gearbox gearbox;

    private int seats;

    private boolean hasRoof;

    private boolean hasSpoiler;

    public CarBuilder() {
    }

    public CarBuilder type(CarType type) {
        this.type = type;
        return this;
    }

    public CarBuilder color(CarColor color) {
        this.color = color;
        return this;
    }

    public CarBuilder doorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
        return this;
    }

    public CarBuilder fuel(FuelType fuel) {
        this.fuel = fuel;
        return this;
    }

    public CarBuilder gearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
        return this;
    }

    public CarBuilder seats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder hasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return this;
    }

    public CarBuilder hasSpoiler(boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
        return this;
    }

    public Car build() {
        return new Car(type, color, doorsNumber, fuel, gearbox, seats, hasRoof, hasSpoiler);
    }

}
