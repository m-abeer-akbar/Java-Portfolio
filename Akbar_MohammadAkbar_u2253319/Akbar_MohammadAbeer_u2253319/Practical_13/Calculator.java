package Akbar_MohammadAbeer_u2253319.Practical_13;
import java.util.*;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        // Create a scanner to read input from the user
        Scanner input = new Scanner(System.in);

        // Create a stack to store operands and intermediate results
        Stack<Double> stack = new Stack<>();

        // Print a prompt asking the user to enter an expression
        System.out.print("Please enter the arithmetic expression that you would like to have evaluated.\n " +
                "Please ensure that there is a space between each operator and operand in the expression: ");

        // Read the expression from the user
        String expression = input.nextLine();

        // Split the expression into individual tokens
        String[] tokens = expression.split(" ");

        // Print a header for the output table
        System.out.printf("%-20s%-20s%6s\n", "Method", "Return Value", "Stack Contents ( ... --> top)");

        // Process each token in the expression
        for (String token : tokens) {
            // Check if the token is numeric
            if (isNumeric(token)) {
                // If the token is numeric, parse it as a double and push it onto the stack
                double operand = Double.parseDouble(token);
                stack.push(operand);

                // Print the push operation and the current stack contents
                System.out.printf("%-20s%-20s%6s\n", "push(" + operand + ")", operand, "(" + stack + ")");
            } else {
                // If the token is not numeric, it must be an operator
                // Pop the top two elements from the stack (which should be operands)
                double y = stack.pop();
                double x = stack.pop();

                // Print the pop operations and the current stack contents
                System.out.printf("%-20s%-20s%6s\n", "pop()", y, "(" + stack + ")");
                System.out.printf("%-20s%-20s%4s\n", "pop()", x, "(" + stack + ")");

                // Perform the specified operation and push the result onto the stack
                double result = evaluate(x, y, token);
                stack.push(result);

                // Print the push operation and the current stack contents
                System.out.printf("%-20s%-20s%6s\n", "push(" + result + ")", result, "(" + stack + ")");
            }
        }

        // At this point, the stack should contain only the final result
        System.out.println("Result(" + stack.pop() + ")");
    }

    // Returns true if the given string represents a numeric value, false otherwise
    private static boolean isNumeric(String s) {
        // Try to parse the string as a double
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Evaluates the given operator and operands and returns the result
    private static double evaluate(double x, double y, String operator) {
        switch (operator) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}