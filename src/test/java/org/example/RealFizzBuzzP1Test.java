package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealFizzBuzzP1Test {
    @Test
    @DisplayName("Verify correct value is returned from checkNumber")
    void verifyCheckNumber() {
        RealFizzBuzzP1 fizz = new RealFizzBuzzP1();

        assertEquals("fizz", fizz.checkNumber(3), "Multiples of 3 must return buzz");
        assertEquals("buzz", fizz.checkNumber(5), "Multiples of 5 must return fizz");
        assertEquals("fizzbuzz", fizz.checkNumber(15), "Multiples of 15 must return fizzbuzz");
        assertEquals("8", fizz.checkNumber(8), "All other integers return the integer as a string");
    }

    @Test
    @DisplayName("Verify correct string is returned from fizzBuzz")
    void verifyFizzBuzz(){
        RealFizzBuzzP1 fizz = new RealFizzBuzzP1();

        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ", fizz.fizzBuzz(1,20));
    }
}
