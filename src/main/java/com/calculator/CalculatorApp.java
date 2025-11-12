package com.calculator;

import com.calculator.controller.CalculatorController;
import com.calculator.model.CalculatorModel;
import com.calculator.view.CalculatorView;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        double num1 = view.getNumber("Enter first number: ");
        double num2 = view.getNumber("Enter second number: ");
        char operator = view.getOperator();

        controller.calculate(operator, num1, num2);
    }
}
