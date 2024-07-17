package com.example.amstrong.models;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class NumberTest {

    @Test
    public void testIsArmstrong() {
        Number number1 = new Number(371);
        assertThat(number1.isArmstrong(), is(true));

        Number number2 = new Number(9474);
        assertThat(number2.isArmstrong(), is(true));

        Number number3 = new Number(123);
        assertThat(number3.isArmstrong(), is(false));
    }

    @Test
    public void testGetNumberOfDigits() {
        Number number = new Number(371);
        assertThat(number.getNumberOfDigits(), is(3));

        number = new Number(9474);
        assertThat(number.getNumberOfDigits(), is(4));

        number = new Number(123456);
        assertThat(number.getNumberOfDigits(), is(6));
    }

    @Test
    public void testCalculateArmstrongValue() {
        Number number = new Number(371);
        assertThat(number.calculateArmstrongValue(), is(371));

        number = new Number(9474);
        assertThat(number.calculateArmstrongValue(), is(9474));

        number = new Number(123);
        assertThat(number.calculateArmstrongValue(), is(not(123)));
    }
}

