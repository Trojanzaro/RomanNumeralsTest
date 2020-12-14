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
    public void testForWrongPlacement() {
        int number = RomanNumerals.parse("IXV");
        Assert.assertEquals(14, number);
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testForNegativeNumbers() {
        int number = RomanNumerals.parse("-XXI");
    }
}
