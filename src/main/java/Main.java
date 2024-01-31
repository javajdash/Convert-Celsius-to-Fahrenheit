//(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result.
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    // Create a Scanner object to read input from the user
    Scanner input = new Scanner(System.in);
    
    // Prompts the user to enter a number
    System.out.println("Enter a degree in Celsius: ");
    
    // Assigns the user input to the variable celsius
    double celsius = input.nextDouble();
    
    // Calcualtes the fahrenheit
    double fahrenheit = (9.0 / 5) * celsius + 32;
    
    // Prints out the user input and Fahrenheit conversion
    System.out.println(celsius + " Celsius is " +fahrenheit+ " Fahrenheit");
  }
}