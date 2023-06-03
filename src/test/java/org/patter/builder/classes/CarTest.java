package org.patter.builder.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.patter.builder.types.CarColor;
import org.patter.builder.types.CarType;
import org.patter.builder.types.FuelType;
import org.patter.builder.types.GearboxType;

class CarTest {

    @Test
    void testToString() {
        Car car = new Car(CarType.CITY, CarColor.RED, 4, FuelType.PETROL, new Gearbox(GearboxType.AUTOMATIC, 6), 5, true, false);

        String expectedString = "Parameters: \n" +
                "type: CITY\n" +
                "color: RED\n" +
                "doorsNumber: 4\n" +
                "fuel: PETROL\n" +
                "gearbox: Gearbox{type: AUTOMATIC, gearsAmount: 6}\n" +
                "seats: 5\n" +
                "has roof: true\n" +
                "has spoiler: false";

        Assertions.assertEquals(expectedString, car.toString());
    }
}