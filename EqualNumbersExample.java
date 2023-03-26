//Write a program to find the two numbers equal or not.

import java.util.Scanner;

public class EqualNumbersExample {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Compare the two numbers and print the result
        if (num1 == num2) {
            System.out.println("The two numbers are equal");
        } else {
            System.out.println("The two numbers are not equal");
        }
        
        // Close the scanner to free up resources
        scanner.close();
    }

}
