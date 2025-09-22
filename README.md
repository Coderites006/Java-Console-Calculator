# Java-Console-Calculator
Building basic calculator using Java I/O

How it Works

Import Scanner: The import java.util.Scanner; statement makes the Scanner class available for use. This class is essential for reading user input from the console.

Create a Scanner object: Scanner input = new Scanner(System.in); creates a Scanner object named input that reads data from the standard input stream (System.in). .

Get User Input: The program prompts the user to enter two numbers (num1 and num2) and an arithmetic operator (operator). The nextDouble() and next().charAt(0) methods read the input as a double and a char, respectively.

switch Statement: A switch statement is used to check the value of the operator variable.

Each case corresponds to a different operator (+, -, *, /).

The appropriate arithmetic operation is performed, and the result is stored in the result variable.

The break statement exits the switch block after a case is executed.

The default case handles any invalid operator that the user might enter.

Division by Zero Check: A special if statement is included within the / case to prevent a "division by zero" error, a common programming pitfall. If num2 is 0, an error message is printed, and the program exits using return.

Print the Result: Finally, System.out.println("The result is: " + result); displays the final calculated value to the user.

Close Scanner: input.close(); is a good practice to release system resources associated with the Scanner object.

Hence , here is my basic calculator.