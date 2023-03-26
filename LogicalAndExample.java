//programs on Logical AND,OR operator and Logical NOT

import java.util.Scanner;

public class LogicalAndExample {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number between 1 and 100
        System.out.print("Enter a number between 1 and 100: ");
        int num = scanner.nextInt();
        
        // Check if the number is even AND between 10 and 50
        if (num % 2 == 0 && num >= 10 && num <= 50) {
            System.out.println(num + " is an even number between 10 and 50");
        } else {
            System.out.println(num + " is not an even number between 10 and 50");
        }
      
      
       // Check if the number is divisible by 3 OR 5
        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println(num + " is divisible by 3 OR 5");
        } else {
            System.out.println(num + " is not divisible by 3 OR 5");
        }
      
      
      // Check if the number is NOT equal to 0
        if (!(num == 0)) {
            System.out.println(num + " is not equal to 0");
        } else {
            System.out.println(num + " is equal to 0");
        }
        
        // Close the scanner to free up resources
        scanner.close();
    }

}
