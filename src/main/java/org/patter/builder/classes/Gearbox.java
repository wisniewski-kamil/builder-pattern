package org.patter.builder.classes;

import org.patter.builder.types.GearboxType;

import java.security.spec.InvalidParameterSpecException;

public class Gearbox {

    private GearboxType type;

    private int gearsAmount;

    public Gearbox(GearboxType type, int gearsAmount) {
        this.type = type;
        this.gearsAmount = gearsAmount;
    }

    public GearboxType getType() {
        return type;
    }

    public int getGearsAmount() {
        return gearsAmount;
    }

    @Override
    public String toString() {
        return "Gearbox{" +
                "type: " + type +
                ", gearsAmount: " + gearsAmount +
                '}';
    }
}
