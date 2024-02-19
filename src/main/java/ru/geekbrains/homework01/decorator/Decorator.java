package ru.geekbrains.homework01.decorator;

/**
 * Class to decorate and print the result of calculations
 */
public class Decorator {

    /**
     * @param value the value which need to be printed in console
     */
    public static void decorate(double value){
        System.out.printf("Result of operation is: %s\n", value);
    }
}
