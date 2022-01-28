package com.csc205;

import java.util.Arrays;

public class Calculator {

    public int add(int a, int b)
    {
        return a + b;
    }

    public int add(int a, int... b) // "..." means that i can pass unlimited ints through it
            //varage (has to be last arg in method)
    {
        return a + Arrays.stream(b).sum();
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        return (a * b);
    }

    public int divide(int a, int b)
    {
        return a / b;
    }


}
