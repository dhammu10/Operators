//Write a function for arithmetic operators(+,-,*,/)

public class ArithmeticOperatorsExample {

    public static void main(String[] args) {
        
        // Call the arithmetic functions
        int sum = add(5, 3);
        int difference = subtract(5, 3);
        int product = multiply(5, 3);
        float quotient = divide(5, 3);
        
        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
    }
    
    // Function to add two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    // Function to subtract two numbers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    // Function to multiply two numbers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    // Function to divide two numbers
    public static float divide(float num1, float num2) {
        return num1 / num2;
    }

}
