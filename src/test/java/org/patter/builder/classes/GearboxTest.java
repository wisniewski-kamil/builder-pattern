package org.patter.builder.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.patter.builder.types.GearboxType;

class GearboxTest {

    @Test
    void testToString() {
        Gearbox gearbox = new Gearbox(GearboxType.MANUAL, 5);

        String expectedString = "Gearbox{type: MANUAL, gearsAmount: 5}";

        Assertions.assertEquals(expectedString, gearbox.toString());
    }
}