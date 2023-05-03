package org.patter.builder.classes;

import org.patter.builder.types.GearboxType;

import java.security.spec.InvalidParameterSpecException;

public class Gearbox {

    private GearboxType type;

    private int gearsAmount;

    public Gearbox(GearboxType type, int gearsAmount) throws InvalidParameterSpecException {
        validate(gearsAmount);
        this.type = type;
        this.gearsAmount = gearsAmount;
    }

    public GearboxType getType() {
        return type;
    }

    public int getGearsAmount() {
        return gearsAmount;
    }

    private void validate(int gearsAmount) throws InvalidParameterSpecException {
        if (gearsAmount < 2 || gearsAmount > 10) {
            throw new InvalidParameterSpecException("The amount of gears should be between 2 and 10");
        }
    }
}
