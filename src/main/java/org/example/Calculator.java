package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private List<Integer> results;
    Scanner sc = new Scanner(System.in);

    public Calculator() {
        results =  new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public int calculate(int operand1, int operand2, char operator) {
        // perform the calculation
        int result = 0;
        switch (operator) {
            case '-':
                result = operand1 - operand2;
                break;
            case '+':
                result = operand1 + operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Error: Division by 0 cannot be performed.");
                    throw new ArithmeticException("Error: Division by 0 cannot be performed.");
                }
                else {
                    result = operand1 / operand2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                throw new ArithmeticException("Error: Invalid operator.");
        }
        // storing results and updating index
        results.add(result);
        return result;
    }
}
