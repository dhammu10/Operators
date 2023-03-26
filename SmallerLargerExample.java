//. Print the smaller and larger number

import java.util.Scanner;

public class SmallerLargerExample {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Determine the smaller and larger numbers
        int smaller = Math.min(num1, num2);
        int larger = Math.max(num1, num2);
        
        // Print the smaller and larger numbers
        System.out.println("The smaller number is: " + smaller);
        System.out.println("The larger number is: " + larger);
        
        // Close the scanner to free up resources
        scanner.close();
    }

}
