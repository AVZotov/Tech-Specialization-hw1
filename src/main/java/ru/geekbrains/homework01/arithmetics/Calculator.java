package ru.geekbrains.homework01.arithmetics;

/**
 * Class to perform basic mathematics operations
 */
public class Calculator {

    /**
     *
     * @param a first value
     * @param b second value
     * @return  Double sum of two values
     */
    public static Double sum(double a, double b) { return a + b; }

    /**
     *
     * @param a first value
     * @param b second value
     * @return Double subtraction of two values
     */
    public static Double subtraction(double a, double b) { return a - b; }

    /**
     *
     * @param a first value
     * @param b second value
     * @return Double multiplication of two values
     */
    public static Double multiplication(double a, double b) { return a * b; }

    /**
     *
     * @param a first value
     * @param b second value should not be zero
     * @return Double division of value "a" to value "b"
     * @throws IllegalArgumentException if argument b is zero
     */
    public static Double division(double a, double b) {
        if (b == 0) { throw new IllegalArgumentException("Argument 'divisor' is 0"); }
        return a / b;
    }

}
