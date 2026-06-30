package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do  {
            // obtain the data
            System.out.print("Enter the first number: ");
            int operand1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int operand2 = sc.nextInt();
            System.out.print("Enter an arithmetic operator: ");
            char operator = sc.next().charAt(0);

           Calculator calc = new Calculator();
           int result = calc.calculate(operand1, operand2, operator);
            // showing results
            System.out.println("Result: " + result);
            /*
            System.out.println("Would you like to delete the oldest calculation result? (Enter remove to delete)");
            if (sc.next().equals("remove")) {
                results.removeFirst();
            }


            System.out.println("Would you like to view the stored calculation results? (Enter inquiry to view)");
            if (sc.next().equals("inquiry")) {
                System.out.print("Results: ");
                for (int res : results.subList(0, results.size() - 1)) {
                    System.out.print(res + ", ");
                }
                System.out.println(results.getLast());
            }
             */

            System.out.println("Would you like to calculate more? (Enter exit to quit)");
        } while (!sc.next().equals("exit"));

    }
}