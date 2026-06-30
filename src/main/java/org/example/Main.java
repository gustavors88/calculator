package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calc = new ArithmeticCalculator();
        CircleCalculator circleCalc = new CircleCalculator();
        do  {
            System.out.print("Calculate area of  \"circle\" or perform \"arithmetic\": ");
            String option = sc.next();
            if (option.equals("arithmetic")) {
                // obtain the data
                System.out.print("Enter the first number: ");
                int operand1 = sc.nextInt();
                System.out.print("Enter the second number: ");
                int operand2 = sc.nextInt();
                System.out.print("Enter an arithmetic operator: ");
                char operator = sc.next().charAt(0);

                int result = calc.calculate(operand1, operand2, operator);
                // showing results
                System.out.println("Result: " + result);

                System.out.println("Would you like to delete the oldest calculation result? (Enter remove to delete)");
                if (sc.next().equals("remove")) {
                    calc.removeOldestResult();
                }

                System.out.println("Would you like to view the stored calculation results? (Enter inquiry to view)");
                if (sc.next().equals("inquiry")) {
                    calc.showResults();
                }
            }
            else if (option.equals("circle")) {
                // obtain the data
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                double area = circleCalc.calculateCircleArea(radius);
                System.out.println("The area of the circle is: " + area);
            }


            System.out.println("Would you like to calculate more? (Enter exit to quit)");
        } while (!sc.next().equals("exit"));

    }
}