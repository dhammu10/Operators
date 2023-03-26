//Program for relational operators (<,<==, >, >==)

import java.util.Scanner;

public class RelationalOperatorsExample {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Check if num1 is less than num2
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        }
        
        // Check if num1 is less than or equal to num2
        if (num1 <= num2) {
            System.out.println(num1 + " is less than or equal to " + num2);
        }
        
        // Check if num1 is greater than num2
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        
        // Check if num1 is greater than or equal to num2
        if (num1 >= num2) {
            System.out.println(num1 + " is greater than or equal to " + num2);
        }
        
        // Close the scanner to free up resources
        scanner.close();
    }

}
