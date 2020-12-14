package org.example;

import org.junit.Test;
import org.junit.Assert;

public class RomanNumeralsTest {
    @Test
    public void testForLongerThanActuallNumber() {
        int number = RomanNumerals.parse("IVX");
        Assert.assertEquals(4, number);
    }

    @Test
    public void testForCorrectInputNumerals() {
        int number = RomanNumerals.parse("MDC");
        Assert.assertEquals(1600, number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNonRomanNumerals() {
        int number = RomanNumerals.parse("XIIA");
    }
}
