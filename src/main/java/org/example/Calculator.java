package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> results;

    public Calculator() {
        results =  new ArrayList<>();
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

    public void removeOldestResult() {
        results.removeFirst();
    }

    public void showResults() {
        System.out.print("Results: ");
        for (int res : results.subList(0, results.size() - 1)) {
            System.out.print(res + ", ");
        }
        System.out.println(results.getLast());
    }

    public List<Integer> getResults() {
        return results;
    }

    public boolean setResult(int result) {
        return results.add(result);
    }

}
