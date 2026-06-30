package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont = "";
        while (!cont.equals("exit"))  {
            // obtain the data
            System.out.print("Enter the first number: ");
            int operand1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int operand2 = sc.nextInt();
            System.out.print("Enter an arithmetic operator: ");
            char operator = sc.next().charAt(0);

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
                        return;
                    }
                    else {
                        result = operand1 / operand2;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    return;
            }
            System.out.println("Result: " + result);
            System.out.println("Would you like to calculate more? (Enter exit to quit)");
            cont = sc.next();
        }

    }
}