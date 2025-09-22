import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        // Prompt the user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result;

        // Use a switch statement to perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    sc.close();
                    return; // Exit the program
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! Invalid operator.");
                sc.close();
                return; // Exit the program
        }

        // Print the result
        System.out.println("The result is: " + result);

        // Close the scanner
        sc.close();
    }
}
//here is my calulator code in java