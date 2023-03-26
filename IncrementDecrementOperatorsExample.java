//Write a method for increment and decrement operators(++, --)

public class IncrementDecrementOperatorsExample {

    public static void main(String[] args) {
        
        // Declare and initialize a variable
        int num = 5;
        
        // Call the increment and decrement methods
        increment(num);
        decrement(num);
        
    }
    
    // Method to increment a number
    public static void increment(int num) {
        num++;
        System.out.println("After increment: " + num);
    }
    
    // Method to decrement a number
    public static void decrement(int num) {
        num--;
        System.out.println("After decrement: " + num);
    }

}
