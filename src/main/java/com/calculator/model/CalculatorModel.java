package com.calculator.model;

public class CalculatorModel {
    public double calculate(char operator, double num1, double num2) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num2 != 0 ? num1 / num2 : Double.NaN;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }
}
