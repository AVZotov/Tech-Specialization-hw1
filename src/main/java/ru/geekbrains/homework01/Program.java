package ru.geekbrains.homework01;

import ru.geekbrains.homework01.arithmetics.Calculator;
import ru.geekbrains.homework01.decorator.Decorator;

/**
 * Entry Point to the Calculation program
 */
public class Program {
    public static void main(String[] args) {
        double a = 50;
        double b = 26;

        Decorator.decorate(Calculator.sum(a, b));
        Decorator.decorate(Calculator.division(a, b));
        Decorator.decorate(Calculator.subtraction(a, b));
        Decorator.decorate(Calculator.multiplication(a, b));
    }
}
