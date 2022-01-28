package com.csc205;

import com.csc205.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // SEAT - MEMORIZE THIS - SET / EXORCISE / ASSERT / TEAR DOWN

        //SETUP
        int expected = 4;

        //EXORCISE
        int actual = new Calculator().add(2,2);

        //ASSERTION
        assertEquals(expected, actual);
    }

    @Test
    void testAdd() {

        int expected = 6;
        int actual = new Calculator().add(2, 2,2);

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        int expected = 0;
        int actual = new Calculator().subtract(5,5);

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int expected = 4;
        int actual = new Calculator().multiply(2,2);

        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        int expected = 4;
        int actual = new Calculator().divide(8,2);

        assertEquals(expected, actual);
    }

    @Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () ->
        {
            new Calculator().divide(0,0);
        });
    }
}