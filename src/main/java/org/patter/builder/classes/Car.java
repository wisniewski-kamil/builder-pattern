package org.patter.builder.classes;

import org.patter.builder.types.CarColor;
import org.patter.builder.types.CarType;
import org.patter.builder.types.FuelType;

public class Car {

    private CarType type;

    private CarColor color;

    private int doorsNumber;

    private FuelType fuel;

    private Gearbox gearbox;

    private int seats;

    private boolean hasRoof;

    private boolean hasSpoiler;

    public Car(CarType type, CarColor color, int doorsNumber, FuelType fuel, Gearbox gearbox, int seats, boolean hasRoof, boolean hasSpoiler) {
        this.type = type;
        this.color = color;
        this.doorsNumber = doorsNumber;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.seats = seats;
        this.hasRoof = hasRoof;
        this.hasSpoiler = hasSpoiler;
    }

    public CarType getType() {
        return type;
    }

    public CarColor getColor() {
        return color;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public int getSeats() {
        return seats;
    }

    public boolean hasRoof() {
        return hasRoof;
    }

    public boolean hasSpoiler() {
        return hasSpoiler;
    }

    public String present(){
        return null;
    }

}
